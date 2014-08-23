package angrySCV;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

class TaskA {
	public void solve(int testNumber, Scanner in, PrintWriter out) {
		int x1, y1, x2, y2;
		boolean check = false;
		x1 = in.nextInt();
		y1 = in.nextInt();
		x2 = in.nextInt();
		y2 = in.nextInt();

		check = diagonalnoeRaspolojenie(x1, y1, x2, y2, out);
		if (!check) check = verticalnoeRaspolojenie(x1, y1, x2, y2, out);
		if (!check) check =  gorizontalnoeRaspolojenie(x1, y1, x2, y2, out);
		if (check == false) out.println("-1");

	}
	public static boolean verticalnoeRaspolojenie(int x1, int y1, int x2, int y2, PrintWriter out){
		int x3, y3, x4, y4;
		if (x1==x2) {
			x3 = x4 = x1 + Math.abs(y1-y2);
			if ((x3>1000)||(x3<-1000)) x3 = x4 = x1 - Math.abs(y1 - y2);
			y4= y1; y3= y2;
			out.println(x3 +" "+ y3 +" "+ x4 +" " + y4);
			return true;
		}
		return false;
	}
	public static boolean gorizontalnoeRaspolojenie(int x1, int y1, int x2, int y2, PrintWriter out){
		int x3, y3, x4, y4;
		if (y1==y2) {
			y3 = y4 = y1 + Math.abs(x1 - x2);
			if ((y3>1000)||(y3<-1000)) y3 = y4 = y1 - Math.abs(x1 - x2);
			x4= x1; x3= x2;
			out.println(x4 +" "+ y4 +" "+ x3 +" " + y3);
			return true;
		}
		return false;
	}

	public static boolean diagonalnoeRaspolojenie(int x1, int y1, int x2, int y2, PrintWriter out){
		int x3, y3, x4, y4;
		int	checker1 = Math.abs(x1-x2);
		int checker2 = Math.abs(y1-y2);
		if (checker1 == checker2) {
			y3 = y2; x3 = x1;
			y4 = y1; x4 = x2;
			out.println(x4 +" "+ y4 +" "+ x3 +" " + y3);
			return true;

		}
		return false;
	}
}
