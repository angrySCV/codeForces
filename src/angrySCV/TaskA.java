package angrySCV;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
	public static Integer count = 0;
    public void solve(int testNumber, Scanner in, PrintWriter out) {
	    int a = 0;
	    int nSocks = in.nextInt();
	    int mPokupok = in.nextInt();
	    int i = mPokupok;
		while (i<=nSocks ){
			nSocks++;
			i+=mPokupok;
		}
	    System.out.println(nSocks);
    }

}