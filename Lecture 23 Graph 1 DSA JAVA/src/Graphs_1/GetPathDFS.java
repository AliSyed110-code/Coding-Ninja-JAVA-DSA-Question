package Graphs_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GetPathDFS {

	public static ArrayList<Integer> getPathDFS(int edges[][], boolean visited[], int v1, int v2) {
		if (v1 == v2) {
			ArrayList<Integer> ans = new ArrayList<>();
			visited[v1] = true;
			ans.add(v1);
			return ans;
		}
		visited[v1] = true;

		for (int i = 0; i < edges.length; i++) {
			if (edges[v1][i] == 1 && !visited[i]) {
				ArrayList<Integer> arr = getPathDFS(edges, visited, i, v2);
				if (arr != null) {
					arr.add(v1);
					return arr;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		int e = s.nextInt();

		int edges[][] = new int[v][v];

		for (int i = 0; i < e; i++) {
			int fv = s.nextInt();
			int sv = s.nextInt();

			edges[fv][sv] = 1;
			edges[sv][fv] = 1;

		}
		int v1 = s.nextInt();
		int v2 = s.nextInt();

		boolean visited[] = new boolean[v];

		ArrayList<Integer> arr = getPathDFS(edges, visited, v1, v2);
		if (arr != null) {
			for (int i : arr) {
				System.out.print(i + " ");
			}
		}
	}
}
 