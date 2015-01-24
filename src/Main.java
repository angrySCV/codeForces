import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author angrySCV
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskA solver = new TaskA();
		solver.solve(1, in, out);
		out.close();
	}
}

class TaskA {
	public void solve (int testNumber, Scanner in, PrintWriter out) {
		int colichestvoInstrumentov = in.nextInt();
		int colichestvoDney = in.nextInt();
		int[][] obuchenie = new int[colichestvoInstrumentov][2];
		for (int i = 0; i < colichestvoInstrumentov; i++) {
			obuchenie[i][0] = in.nextInt();
			obuchenie[i][1] = i;
		}
		int countInstrument = 0;
		int countDay = 0;
		int totalCount = 0;
		Arrays.sort(obuchenie, new Comparator<int[]>() {
			public int compare (int[] o1, int[] o2) {
				return Integer.compare(o1[0], o2[0]);
			}
		});
out:
		for (int i = 0; i < colichestvoInstrumentov; i++) {
			if (countDay + obuchenie[i][0] <= colichestvoDney){
				countDay = countDay+obuchenie[i][0];
				countInstrument++;
			} else break out;
		}
		System.out.println(countInstrument);
		for (int i = 0; i < countInstrument; i++) {
			System.out.print(obuchenie[i][1]+1 + " ");
		}
	}
}

