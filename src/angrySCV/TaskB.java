package angrySCV;

import java.io.PrintWriter;
import java.util.Scanner;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
	    long rCruga =in.nextInt();
	    long xCruga =in.nextInt();
	    long yCruga =in.nextInt();
	    long xCeli = in.nextInt();
	    long yCeli = in.nextInt();
	    long colichestvo=0;
	    rCruga+=rCruga;
	    rCruga*=rCruga;
	    long rastoyanie =((xCeli-xCruga)*(xCeli-xCruga))+ ((yCeli-yCruga)*(yCeli-yCruga));
	    colichestvo =(long) Math.ceil(Math.sqrt((double) (rastoyanie) / (rCruga)));
	    System.out.println(colichestvo);
    }
}
