import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
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
		TaskB solver = new TaskB();
		solver.solve(1, in, out);
		out.close();
	}
}

class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
	    long rCruga =in.nextInt();
	    long xCruga =in.nextInt();
	    long yCruga =in.nextInt();
	    long xCeli = in.nextInt();
	    long yCeli = in.nextInt();
	    long colichestvo=0;
	    rCruga+=rCruga;
	    rCruga*=rCruga;
	    long rastoyanie =((xCeli-xCruga)*(xCeli-xCruga))+ ((yCeli-yCruga)*(yCeli-yCruga));
	    colichestvo =(long) Math.ceil(Math.sqrt((double) (rastoyanie) / (rCruga)));
	    System.out.println(colichestvo);
    }
}

