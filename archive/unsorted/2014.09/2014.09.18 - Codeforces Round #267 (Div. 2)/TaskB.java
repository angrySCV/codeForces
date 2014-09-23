package angrySCV;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
	private int result = 0;
	private int colichestvoraznih = 0;
	private int n;

	public void solve (int testNumber, Scanner in, PrintWriter out) {
		n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		int fedia = 0;
		int[] igroki = new int[m];

		for (int i = 0; i < m; i++) {
			igroki[i] = in.nextInt();
			//System.out.println(igroki[i]);

		}
		fedia = in.nextInt();
		for (int i = 0; i < m; i++) {
			result = igroki[i] ^ fedia;
			if (sumOfBit(result)<=k) colichestvoraznih++;
		}
		//System.out.println(sumOfBit(0b01111)+"- colvobit");
		System.out.println(colichestvoraznih);
	}

	private int sumOfBit (int result) {
		int sum = result & 1;
		boolean correntBit = false;
		for (int i=0;i<=n;i++) {
			sum += ((result >>>= 1) & 1);
		}
		return sum;
	}

}
