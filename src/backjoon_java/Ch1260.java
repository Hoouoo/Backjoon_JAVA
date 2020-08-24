package backjoon_java;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Ch1260 {
	
	static int N,M,V;
	static int [][]graph;
	static boolean[] check;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		V=sc.nextInt();
		graph = new int [N+1][N+1];
		check = new boolean[N+1];
		
		int num1,num2;
		
		for(int i=1; i<=M; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			graph[num1][num2] = graph[num2][num1] = 1;
		}
		
		dfs();
		reset_check();
		bfs();
		
	}
	
	public static void dfs() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(V);
		int find;
		boolean flag;
		
		check[V] = true;
		System.out.print(V+" ");
		while(!stack.isEmpty()){{
			find = stack.peek();
			flag = false;
			
			for(int idx = 1; idx <N+1 ; idx++) {
				if (graph[find][idx] == 1 & !check[idx]) {
					stack.push(idx);
					check[idx]=true;
					System.out.print(idx+" ");
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				stack.pop();
			}
		}
		}
	}
	
	public static void bfs() {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(V);
		check[V]=true;
		int find=V;
		
		while(!queue.isEmpty()) {
			find = queue.poll();
			System.out.print(find+" ");
			for(int idx=1; idx <N+1;idx++) {
				if(graph[find][idx] == 1 & !check[idx]) {
					queue.offer(idx);
					check[idx]=true;
				}
			}
		}
		}
	
	public static void reset_check() {
		for(int idx = 1; idx < N+1; idx++) {
			check[idx] =false;
		}
		System.out.println();
	}
}
