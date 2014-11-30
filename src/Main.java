import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author angrySCV
 */
public class Main {
	public static void main (String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskE solver = new TaskE();
		solver.solve(1, in, out);
		out.close();
	}
}

class TaskE {
	int[] dataArray;
	int   visotaDereva;
	int   colichestvoElementov;
	int   nachalniyElement;

	public void solve (int testNumber, Scanner in, PrintWriter out) {
		int n = in.nextInt();
		int m = in.nextInt();
		visotaDereva = (int) Math.ceil(Math.log(5) / Math.log(2.0));
		colichestvoElementov = (int) Math.pow(2, visotaDereva + 1) - 1;
		nachalniyElement = colichestvoElementov - (int) Math.pow(2, visotaDereva) + 1;
		dataArray = new int[colichestvoElementov + 1];
		for (int i = 0; i < n; i++) {
			dataArray[nachalniyElement + i] = in.nextInt();
		}
		for (int i = n + nachalniyElement; i <= colichestvoElementov; i++) {
			dataArray[i] = Integer.MAX_VALUE;
		}
		postroitMassive();

		String command;
		for (int i = 0; i < m; i++) {
			command = in.next();
			if (command.equals("Min")) System.out.print(getMin(in.nextInt(), in.nextInt()));
			else if (command.equals("Set")) elementSet(in.nextInt(), in.nextInt());
		}
	}

	private void postroitMassive () {
		for (int j = visotaDereva; j > 0; j--) {
			colichestvoElementov = (int) Math.pow(2, j + 1) - 1;
			nachalniyElement = colichestvoElementov - (int) Math.pow(2, j) + 1;
			for (int i = 0; i < colichestvoElementov - nachalniyElement; i = i + 2) {
				if (dataArray[i+nachalniyElement] > dataArray[i + 1+ nachalniyElement]) {
					dataArray[(i+nachalniyElement) / 2] = dataArray[i + 1 + nachalniyElement];
				} else dataArray[(i + nachalniyElement) / 2] = dataArray[i+nachalniyElement];
			}
		}
	}


	private void elementSet (int leftElement, int rightElement) {


	}

	private int getMin (int leftElement, int rightElement) {
		return dataArray[1];
	}
}

