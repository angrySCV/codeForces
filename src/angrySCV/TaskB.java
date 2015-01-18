package angrySCV;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskB {
	static Node[] nodes;

	public void solve (int testNumber, Scanner in, PrintWriter out) {
		ArrayList<Node> path = new ArrayList<>();
		int queryCount;
		int countV = in.nextInt();
		int countE = in.nextInt();
		nodes = new Node[countV];
		int otvet = 0;
		for (int i = 0; i < countE; i++) {
			nodes[i] = new Node();
		}
		for (int i = 0; i < countE; i++) {
			nodes[in.nextInt()].addEge(in.nextInt(), in.nextInt());
		}
		queryCount = in.nextInt();
		for (int i = 0; i < queryCount; i++) {
//			getPath(in.nextInt(), in.nextInt(), path);
//			otvet = countPathColor(path);
			System.out.println(otvet);
		}

	}

	private int getPath (int startNode, int endNode, ArrayList<Integer> path) {

		int prevNode = startNode;
//		while (hasNextUnvisitedNode) {
//			int nextNode = nodes[startNode].getNextUnvisitedNode();
//			switch (nextNode) {
//				case 0:
//					// nashel otvet
//					path.add(startNode);
//					return 0;
//				break;
//				case -1:
//					// ne nashel ni odnogo otveta
//					return -1;
//				break;
//				default:
//			}
//		}
//					getPath(nextNode, endNode, path);
		return 0;
	}
}
