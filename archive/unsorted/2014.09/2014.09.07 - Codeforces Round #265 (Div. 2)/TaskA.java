package angrySCV;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
	private int countChange = 1;


	public void solve (int testNumber, Scanner in, PrintWriter out) {
		char[] binarData;
		int n = in.nextInt();
		binarData = new char[n];
		String dataString = in.next();
		for (int i = 0; i < n; i++){
			binarData[i]= dataString.charAt(i);
			if (binarData[i] == '1'){
				countChange++;
			} else break;
		}
		if (countChange>n) countChange = n;
		System.out.println(countChange);
	    
    }
}
