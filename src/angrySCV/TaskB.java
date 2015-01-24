package angrySCV;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
	    int rCruga =in.nextInt();
	    int xCruga =in.nextInt();
	    int yCruga =in.nextInt();
	    int xCeli = in.nextInt();
	    int yCeli = in.nextInt();
	    int colichestvo=0;
	    int rastoyanie =(xCeli-xCruga)*(xCeli-xCruga)+ (yCeli-yCruga)*(yCeli-yCruga);
	    rCruga*=rCruga;
	    if (rastoyanie-rCruga > 0) {
	    colichestvo = (int) Math.ceil(Math.sqrt((rastoyanie-rCruga) / (rCruga*2)));
	    } else colichestvo=0;
	    System.out.println(colichestvo);
    }
}
