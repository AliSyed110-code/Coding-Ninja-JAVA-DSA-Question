package Graphs_1;

import java.util.Scanner;

public class Has_Path {

	public static boolean printhasPathHelper(int edges[][], int sv, int ev, boolean visited[]) {

		QueueUsingLL<Integer> q = new QueueUsingLL<Integer>();
		q.enqueue(sv);
		int n = edges.length;
		visited[sv] = true;
		while (!q.isEmpty()) {
			int front;
			try {
				front = q.dequeue();
			} catch (QueuesEmptyException e) {
				return false;
			}

			if (front == ev) {
				return true;
			}

			for (int i = 0; i < n; i++) {
				if (edges[front][i] == 1 && !visited[i]) {
					q.enqueue(i);
					visited[i] = true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int n;
		int e;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		e = s.nextInt();

		int edges[][] = new int[n][n];
		for (int i = 0; i < e; i++) {
			int fv = s.nextInt();
			int sv = s.nextInt();
			edges[fv][sv] = 1;
			edges[sv][fv] = 1;
		}

		if (n == 0) {
			return;
		}

		int sv = s.nextInt();
		int ev = s.nextInt();
		boolean visited[] = new boolean[n];
		boolean ans = printhasPathHelper(edges, sv, ev, visited);
		System.out.println(ans);
	}

}
