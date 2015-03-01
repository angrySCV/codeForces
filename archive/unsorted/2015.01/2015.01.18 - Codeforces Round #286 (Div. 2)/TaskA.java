package angrySCV;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
	public void solve (int testNumber, Scanner in, PrintWriter out) {
		int incorrect = 0;
		String correctWord = "";
		String vvod = in.next();
		String secondTry = vvod;
		int dlinnaStroki = vvod.length();
		if (dlinnaStroki == 1) {
			System.out.print(vvod + vvod);
			return;
		}
		for (int i = 0; i < dlinnaStroki / 2; i++) {
			if (vvod.charAt(i) != vvod.charAt(dlinnaStroki - 1 - i)) {
				incorrect++;
				correctWord = vvod.substring(0, dlinnaStroki - i) + vvod.charAt(i) + vvod.substring(dlinnaStroki - i);
				vvod = correctWord;
				dlinnaStroki++;
			}

		}

		if (incorrect > 1) {
			incorrect = 0;
			dlinnaStroki = secondTry.length();
			for (int i = 0; i < dlinnaStroki / 2; i++) {
				if (secondTry.charAt(i) != secondTry.charAt(dlinnaStroki - i-1)) {
					incorrect++;
					correctWord = secondTry.substring(0, i) + secondTry.charAt(dlinnaStroki - i-1) + secondTry.substring(i, dlinnaStroki);
					secondTry = correctWord;
					dlinnaStroki++;
				}

			}
			vvod =secondTry;
		}

		switch (incorrect) {
			case 0:
				correctWord = vvod.substring(0, dlinnaStroki / 2) + vvod.charAt(dlinnaStroki / 2) + vvod.substring(dlinnaStroki / 2);
				System.out.println(correctWord);
				break;
			case 1:
				System.out.println(vvod);
				break;
			default:
				System.out.println("NA");
		}
	}
}