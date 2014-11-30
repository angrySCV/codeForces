package angrySCV;

import java.util.Scanner;
import java.io.PrintWriter;

class TaskE {
	int[] dataArray;
	int   visotaDereva;
	int   colichestvoElementov;
	int   nachalniyElement;

	public void solve (int testNumber, Scanner in, PrintWriter out) {
		int n = in.nextInt();
		int m = in.nextInt();
		visotaDereva = (int) Math.ceil(Math.log(5) / Math.log(2.0));
		colichestvoElementov = (int) Math.pow(2, visotaDereva + 1) - 1;
		nachalniyElement = colichestvoElementov - (int) Math.pow(2, visotaDereva) + 1;
		dataArray = new int[colichestvoElementov + 1];
		for (int i = 0; i < n; i++) {
			dataArray[nachalniyElement + i] = in.nextInt();
		}
		for (int i = n + nachalniyElement; i <= colichestvoElementov; i++) {
			dataArray[i] = Integer.MAX_VALUE;
		}
		postroitMassive();
		String command;
		for (int i = 0; i < m; i++) {
			command = in.next();
			if (command.equals("Min")) System.out.print(getMin(in.nextInt(), in.nextInt()));
			else if (command.equals("Set")) elementSet(in.nextInt(), in.nextInt());
		}
	}

	private void postroitMassive () {
		for (int j = visotaDereva; j > 0; j--) {
			colichestvoElementov = (int) Math.pow(2, j + 1) - 1;
			nachalniyElement = colichestvoElementov - (int) Math.pow(2, j) + 1;
			for (int i = 0; i < colichestvoElementov - nachalniyElement; i = i + 2) {
				if (dataArray[i + nachalniyElement] > dataArray[i + 1 + nachalniyElement]) {
					dataArray[(i + nachalniyElement) / 2] = dataArray[i + 1 + nachalniyElement];
				} else dataArray[(i + nachalniyElement) / 2] = dataArray[i + nachalniyElement];
			}
		}
	}


	private void elementSet (int elementNumber, int znachenie) {
		colichestvoElementov = (int) Math.pow(2, visotaDereva + 1) - 1;
		nachalniyElement = colichestvoElementov - (int) Math.pow(2, visotaDereva) + 1;
		dataArray[elementNumber + nachalniyElement] = znachenie;
		siftUP(elementNumber + nachalniyElement);
	}

	private void siftUP (int nomerIzmenenia) {
		int nomerProverki;
		int temp;
		while (nomerIzmenenia > 1) {

			if (dataArray[nomerIzmenenia] < dataArray[nomerIzmenenia ^ 1]) nomerProverki = nomerIzmenenia;
			else nomerProverki = nomerIzmenenia ^ 1;
			if (dataArray[nomerProverki] < dataArray[nomerProverki / 2]) {
				temp = dataArray[nomerProverki];
				dataArray[nomerProverki] = dataArray[nomerProverki / 2];
				dataArray[nomerProverki / 2] = temp;
				nomerIzmenenia = nomerIzmenenia / 2;
			}
		}
	}

	private int getMin (int leftElement, int rightElement) {
		int minLeftElement = dataArray[nachalniyElement + leftElement - 1];
		int minRightElement = dataArray[nachalniyElement + rightElement - 1];
		int levayGranica = nachalniyElement + leftElement - 1;
		int pravayGranica = nachalniyElement + rightElement - 1;
		int minElement;
		if (minLeftElement < minRightElement) minElement = minLeftElement;
		else minElement = minRightElement;
		int kolechistvoIteraciy = 1;
		if (pravayGranica-levayGranica == 1) {
			return Math.min(dataArray[levayGranica], dataArray[pravayGranica]);
		}


		while (levayGranica != pravayGranica) {
			if (vhodiatVgranici) {
				poiskVglubinu(leftElement, rightElement);
			} else poiskVshirinu(leftElement, rightElement);


			for (int i = 0; i < kolechistvoIteraciy; i++) {
				if (minLeftElement < minRightElement) {
					minElement = minLeftElement;
					levayGranica = (levayGranica + 1) / 2;
					pravayGranica = (pravayGranica - 1) / 2;
				}
			}
		}
		return minElement;
	}
}