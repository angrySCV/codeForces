package angrySCV;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class TaskC {
	public void solve (int testNumber, Scanner in, PrintWriter out) {
		int n = in.nextInt();
//		int n = 5000;
		int[] massiveChisel = new int[n];
		int maxPovtorov = 1;
		int tecusheeChisloPovtorov = 1;
		for (int i = 0; i < n; i++) {
			massiveChisel[i] = in.nextInt();
//			massiveChisel[i] = 1;
		}

		Arrays.sort(massiveChisel);

		for (int i = 1; i < n; i++) {
			if (massiveChisel[i - 1] == massiveChisel[i]) {
				tecusheeChisloPovtorov++;
			} else {
				if (maxPovtorov < tecusheeChisloPovtorov) maxPovtorov = tecusheeChisloPovtorov;
				tecusheeChisloPovtorov = 1;
			}
		}
		if (maxPovtorov < tecusheeChisloPovtorov) maxPovtorov = tecusheeChisloPovtorov;
		if (maxPovtorov > n / 2) {
			System.out.println(1);
		} else System.out.println(0);
	}
}

