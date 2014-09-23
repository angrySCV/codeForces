package angrySCV;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
	private int kolichestvoPokupok;
	int kolichestvoSahara = 0;
	int dollarov          = 0;
	int centov            = 0;
	private int[] ceniNaSahari;
	int sdacha = 0;
	private int sdachaVcentah;
	private int maximalnaySdacha = -1;

	public void solve (int testNumber, Scanner in, PrintWriter out) {
		kolichestvoSahara = in.nextInt();
		ceniNaSahari = new int[kolichestvoSahara];
		dollarov = in.nextInt();
		centov = dollarov * 100;
		for (int i = 0; i < kolichestvoSahara; i++) {
			ceniNaSahari[i] = in.nextInt() * 100 + in.nextInt();
		}
		for (int i = 0; i < kolichestvoSahara; i++) {
			if (ceniNaSahari[i] < centov) {
				kolichestvoPokupok = centov / ceniNaSahari[i];
				for (int j = 1; j <= kolichestvoPokupok; j++) {
					sdacha = centov - (j * ceniNaSahari[i]);
					sdachaVcentah = sdacha % 100;
					if (sdachaVcentah > maximalnaySdacha) maximalnaySdacha = sdachaVcentah;
				}
			}
		}
		System.out.println(maximalnaySdacha);


	}
}
