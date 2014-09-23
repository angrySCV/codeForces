package angrySCV;

import java.util.Scanner;
import java.io.PrintWriter;

class TaskA {
	private boolean check = false;

	public void solve(int testNumber, Scanner in, PrintWriter out) {
		int n = in.nextInt();
		int [][] a = new int [n][n];
		int [][] countO = new int[n][n];
		String mesaga = "";
		for (int i = 0; i<n; i++) {
			mesaga = in.next();
			for (int j =0; j<n;j++) {
				//System.out.print(mesaga.charAt(j));
				if (mesaga.charAt(j) == 'o') {
					a[i][j] = 1;
				}
				else a[i][j]=0;
			}
		}


		for (int i = 0; i<n; i++) {
			for (int j =0; j<n;j++){
				if (a[i][j] == 1) {
					if (i>=1) countO[i-1][j]++;
					if (i<n-1) countO[i+1][j]++;
					if (j>=1) countO[i][j-1]++;
					if (j<n-1) countO[i][j+1]++;
				}
			}
		}
		for (int i = 0; i<n; i++) {
			for (int j =0; j<n;j++){
				if (countO[i][j] == 1 || countO[i][j]==3) {
					check = true;
				}
			}
		}
		System.out.println(check ? "NO" : "YES");
		System.exit(0);
	}
}

