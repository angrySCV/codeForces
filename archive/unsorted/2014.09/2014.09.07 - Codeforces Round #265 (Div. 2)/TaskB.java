package angrySCV;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
	private int colichestvoOperacii = 0;
	int[] pismo;
	int   n;
	static int i = 0;

	public void solve (int testNumber, Scanner in, PrintWriter out) {
		n = in.nextInt();
		pismo = new int[n];
		for (; i < n; i++) pismo[i] = in.nextInt();


		for (i = 0; i < n; i++) {
			if (pismo[i] == 1) {
				colichestvoOperacii++;
				if ((i + 1 < n) && (pismo[i + 1]) == 0) {
					if (lastOnlyZeros()==true) break;
					else colichestvoOperacii++;
				}
			}
		}


		System.out.println(colichestvoOperacii);
	}

	public boolean lastOnlyZeros () {
		for (int j=i+1; j < n; j++) if (pismo[j] == 1) return false;
		return true;
	}
}

