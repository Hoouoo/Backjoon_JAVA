package backjoon_java;
import java.util.Scanner;
public class Ch15650 {
	
	static int N,M;
	static int graph[];
	static boolean check[]; 
	static int flag;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		check= new boolean[9];
		graph = new int [9];
		dfs(1,0);
	}
	
	public static void dfs(int flag,int cnt) {
		
		if(cnt==M) { 
			for(int i=0;i<M;i++) {
				System.out.print(graph[i]+" ");
			}
			System.out.println();
			return;
		} 
		
		for(int i = flag; i<=N; i++) {
     			if(check[i]==true) continue;
 			check[i]=true;
			graph[cnt]=i;
			dfs(i,cnt+1);
			check[i]=false;
		}
	}
}

