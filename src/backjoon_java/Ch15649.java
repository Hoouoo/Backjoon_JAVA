package backjoon_java;
import java.util.Scanner;
public class Ch15649 {
	
	static int N,M;
	static int graph[];
	static boolean check[]; 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		check= new boolean[9];
		graph = new int [9];
		dfs(0);
	}
	
	public static void dfs(int cnt) {
		if(cnt==M) {
			for(int i=0;i<M;i++) {
				System.out.print(graph[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 1 ; i<=N; i++) {
			if(check[i]==true) continue;
			check[i]=true;
			graph[cnt]=i;
			dfs(cnt+1);
			check[i]=false;
		}
	}
}

