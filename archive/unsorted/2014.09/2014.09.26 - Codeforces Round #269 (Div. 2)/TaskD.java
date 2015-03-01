package angrySCV;

import java.util.Scanner;
import java.io.PrintWriter;


class TaskD {
	private static int[] dataArray;
	private static int elementCount = 0;

	public void solve (int testNumber, Scanner in, PrintWriter out) {
		int n = in.nextInt();
		String vvod;
		dataArray = new int[n + 1];
		for (int i = 0; i < n; i++) {
			vvod = in.next();
			if (vvod.equals("Insert")) insert(in.nextInt());
			else System.out.println(extract());
		}
	}

	private int extract () {
		int x;
		x = dataArray[1];
		dataArray[1] = dataArray[elementCount];
		int temp;
		int corentElement = 1;
		int elementDlyaProverki = (corentElement * 2);
		//siftDown
		while (elementDlyaProverki <= elementCount) {
			if (elementDlyaProverki + 1 <= elementCount) {
				if (dataArray[elementDlyaProverki] <= dataArray[elementDlyaProverki + 1]) {
					elementDlyaProverki++;
				}
			}
			if (dataArray[corentElement] < dataArray[elementDlyaProverki]) {
				temp = dataArray[corentElement];
				dataArray[corentElement] = dataArray[elementDlyaProverki];
				dataArray[elementDlyaProverki] = temp;
			}
			corentElement = elementDlyaProverki;
			elementDlyaProverki = (elementDlyaProverki * 2);
		}
		elementCount--;
		return x;
	}

	private void insert (int x) {
		elementCount++;
		dataArray[elementCount] = x;
		int temp;
		int corentElement = elementCount;
		//siftUp
		while (corentElement != 1) {
			if (dataArray[corentElement] > dataArray[corentElement / 2]) {
				temp = dataArray[corentElement];
				dataArray[corentElement] = dataArray[corentElement / 2];
				dataArray[corentElement / 2] = temp;
			}
			corentElement = corentElement / 2;
		}

	}
}

