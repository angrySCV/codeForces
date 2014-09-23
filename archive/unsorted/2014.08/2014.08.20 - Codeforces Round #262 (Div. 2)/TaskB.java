package angrySCV;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
	public void solve (int testNumber, Scanner in, PrintWriter out) {
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		double x = 0;
		int summaX = 0;
		int proverkaX = 0;
		int[] reshenie = new int[91];
		int countX = 0;
		for (int sx = 0; sx <= 90; sx++) {
			x = b * Math.pow(sx, a) + c;
			if ((x > 0) & (x < 1000000000))  {
				summaX = (int) x;
				for (int i = 1; i <= 10; i++) {
					proverkaX = proverkaX + summaX % 10;
					summaX = summaX / 10;

				}
				if (proverkaX == sx) {
					reshenie[countX] = (int)x;
					countX++;
				}
			}
			proverkaX = 0;
		}
		System.out.println(countX);
		for (int i = 0; i < countX; i++) System.out.print(reshenie[i] + " ");

	}
}
