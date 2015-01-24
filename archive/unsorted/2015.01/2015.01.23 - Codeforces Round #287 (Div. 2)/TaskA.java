package angrySCV;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class TaskA {
	public void solve (int testNumber, Scanner in, PrintWriter out) {
		int colichestvoInstrumentov = in.nextInt();
		int colichestvoDney = in.nextInt();
		int[] obuchenie = new int[colichestvoInstrumentov];
		for (int i = 0; i < colichestvoInstrumentov; i++) {
			obuchenie[i] = in.nextInt();
		}
		int countInstrument = 0;
		int countDay = 0;
		int totalCount = 0;
		Arrays.sort(obuchenie);
out:
		for (int i = 0; i < colichestvoInstrumentov; i++) {
			if (countDay + obuchenie[i] <= colichestvoDney){
				countDay = countDay+obuchenie[i];
				countInstrument++;
			} else break out;
		}
		System.out.println(countInstrument);
		for (int i = 0; i < countInstrument; i++) {
			System.out.print(obuchenie[i] + " ");
		}
	}
}
