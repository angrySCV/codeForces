package angrySCV;


import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;


class TaskC {
	public static int lastMinElement          = 1;
	public static int minElement              = 0;
	private       int uvelichivaemSUskoreniem = 0;

	public void solve (int testNumber, Scanner in, PrintWriter out) {
		int n = in.nextInt();
		long[] a = new long[n];
		long summator = 0; // dlia optimizacii prirasheniy i sokrasheniea kolichestva sortirovok
		int m = in.nextInt();
		int w = in.nextInt();
		int min;
		int nomerElementa = 0;
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		//	uvelichivaemSUskoreniem = m - w;
		for (int i = 0; i < m; i++) {
			minimum(a);
			nomerElementa = min = minElement;
			if ((n - min) < w) nomerElementa = nomerElementa - (w - n + min);
			summator = a[lastMinElement] - a[minElement];
			if (summator == 0) summator = 1;
			if (summator > (m - i)) summator = m - i;
			else
				for (int j = 0; j < w; j++) {
					a[nomerElementa] += summator;
					nomerElementa++;
				}
			if (summator > 1) i += summator - 1; //pereskakivaem seriu elementov na raznicu summatora
		}

		minimum(a);
		System.out.println(a[minElement]);
	}
// nujno skorrektirovat' verhnuu granicu summatora - pod konec innogda lishnego summiruet i poetomu ne ostaetsea ostal'nim

	public static void minimum (long[] a) {
		long minValue = a[0];
		long prevMinValue = a[0];
		minElement = 0;
		lastMinElement = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < minValue ) {
				prevMinValue = minValue;
				lastMinElement = minElement;
				minValue = a[i];
				lastMinElement = minElement;
				minElement = i;
			}
		} return;
	}

}
