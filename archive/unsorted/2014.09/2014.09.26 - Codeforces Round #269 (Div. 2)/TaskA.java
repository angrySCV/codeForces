package angrySCV;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
	private int   reshenie = -1;
	private int   nog      = 0;
	private int   n        = 6;
	private int[] golova   = new int[n];
	private int[] spichki  = new int[n];

	public void solve (int testNumber, Scanner in, PrintWriter out) {
		for (int i = 0; i < n; i++) {
			spichki[i] = in.nextInt();
		}


		for (int nomerNog = 0; nomerNog < 3; nomerNog++) {
			proverkaNog(nomerNog);
			if (nog >= 4) {
				if (golova[4] == golova[5]) reshenie = 1;
				else reshenie = 0;
				break;
			}
		}


		switch (reshenie) {
			case 0:
				System.out.println("Bear");
				break;
			case 1:
				System.out.println("Elephant");
				break;
			default:
				System.out.println("Alien");
				break;
		}
	}

	private int proverkaNog (int nomerNog) {
		nog = 0;
		int nachalo = 0;
		int konec = 5;
		for (int i = 0; i < n; i++) {
			if (spichki[nomerNog] == spichki[i]) {
				golova[nachalo++] = spichki[i];
				nog++;
			} else golova[konec--] = spichki[i];
		}
		return nog;
	}
}
