package backjoon_java;

import java.util.Scanner;
import java.util.Stack;

public class Ch2606 {

	static int cnt = 0;
	static int num;
	static int[][] graph ;
	static boolean[] check ;
	static int pare;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		pare = sc.nextInt();
		graph = new int [num+1][num+1];
		check = new boolean [num+1];

		for (int idx = 0; idx < pare; idx++) {
			int one = sc.nextInt();
			int two = sc.nextInt();
			graph[one][two] = graph[two][one] = 1;
		}
		
		dfs(1);
		System.out.println(cnt);
	}

	/*public static void dfs(int start) {
		Stack<Integer> computer = new Stack<Integer>();
		computer.push(start);
		boolean flag;
		int target;

		check[start] = true;
		while (!computer.isEmpty()) {
			target = computer.peek();
			flag = false;
			
			for (int i = 1; i < num+1; i++) {
				if(graph[target][i] == 1 & !check[i]) {
					computer.push(i);
					check[i]=true;
					flag = true;
					cnt++;
					break;
				}
			}
			
			if(!flag) {
				computer.pop();
			}
		}
	}*/
	
	public static void dfs(int start) {
		check[start] = true;
		
		for(int i=1; i<num+1;i++) {
			if(graph[start][i]== 1 && !check[i]) {
				dfs(i);
				cnt++;
			}
		}
	}
}
