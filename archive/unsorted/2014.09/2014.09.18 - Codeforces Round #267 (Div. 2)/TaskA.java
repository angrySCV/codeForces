package angrySCV;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
	public int maxRazmeshenie = 0;
	public int jivetLudey     = 0;
	private int colichestvo = 0;

	public void solve (int testNumber, Scanner in, PrintWriter out) {
		int n = in.nextInt();
		for (int i=0;i<n;i++){
		    jivetLudey = in.nextInt();
		    maxRazmeshenie = in.nextInt();
		    if ((maxRazmeshenie- jivetLudey)>=2){
			    colichestvo++;
		    }
	    }
	System.out.println(colichestvo);
    }
}
