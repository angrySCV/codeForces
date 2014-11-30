package angrySCV;

import java.util.Scanner;
import java.io.PrintWriter;

class TaskB {
	private static int dlinnaPervogoChisla;
	private static int dlinnaVtorogoChisla;
	private static 	int massiveStartFrom = 0 ;

	public void solve (int testNumber, Scanner in, PrintWriter out) {
		String chislo1 = in.next();
		String chislo2 = in.next();
		dlinnaPervogoChisla = chislo1.length();
		dlinnaVtorogoChisla = chislo2.length();
		String xLevo, xPravo, yLevo, yPravo;
		int[] resultat;
		int[] massivChisel1;
		int[] massivChisel2;
		massivChisel1 = new int[dlinnaPervogoChisla];
		massivChisel2 = new int[dlinnaVtorogoChisla];
		resultat = new int[dlinnaPervogoChisla + dlinnaVtorogoChisla];
		resultat[dlinnaPervogoChisla + dlinnaVtorogoChisla - 1] = 0;
		rasparsitChisla(chislo1, chislo2, massivChisel1, massivChisel2);
		peremnojit(massivChisel1, massivChisel2, resultat);
		vivestiResultat(resultat);

//		chast[i]
//
//		levo = karacuba(xLevo, yLevo);
//		pravo = karacuba(xPravo, yPravo);
//		centr = karacuba(summa(xLevo, xPravo), summa(yLevo, yPravo));

//	    while (nachalo!=konec) {
//		    reshenie[nachalo++] = pravo()+cent()+levo();
//		    promejutocniyRezultat = karacuba(centr());
//		    reshenie [konec--]= levo();
//	    }


	}

	private void vivestiResultat (int[] resultat) {
		for (int i = massiveStartFrom; i <dlinnaPervogoChisla+dlinnaPervogoChisla-1; i++) {
			System.out.print(resultat[i]);
		}
	}

	private void peremnojit (int[] massivChisel1, int[] massivChisel2, int[] resultat) {
		int nomerElementaVotvete = -1;
		for (int i = 0; i < dlinnaVtorogoChisla; i++) {
			nomerElementaVotvete++;
			for (int j = 0; j < dlinnaPervogoChisla; j++) {
				resultat[j + nomerElementaVotvete] = resultat[j + nomerElementaVotvete] + massivChisel1[j] * massivChisel2[i];

			}

		}
		for (int k = dlinnaPervogoChisla+dlinnaVtorogoChisla-1; k > 1; k--) {
			resultat[k] = resultat[k] + resultat[k - 1] % 10;
			resultat[k - 1] = resultat[k - 1] / 10;

			if (resultat[k]>9){
				resultat[k-1]+=resultat[k]/10;
				resultat[k] = resultat[k]%10;
			}


		}
		resultat[1]+=resultat[0]%10;
		resultat[0]=resultat[0]/10;
		if (resultat[0]==0) massiveStartFrom = 1;
	}

	private void rasparsitChisla (String chislo1, String chislo2, int[] massivChisel1, int[] massivChisel2) {
		for (int i = 0; i < chislo1.length(); i++) {
			massivChisel1[i] = (int) chislo1.charAt(i) - 48;
		}
		for (int i = 0; i < chislo2.length(); i++) {
			massivChisel2[i] = (int) chislo2.charAt(i) - 48;
		}


	}

}

