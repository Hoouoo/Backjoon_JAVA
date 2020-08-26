package backjoon_java;
import java.io.*;
import java.util.StringTokenizer;
public class Ch15651  {
	
	static int N,M;
	static int graph[];
	static boolean check[]; 
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		check= new boolean[8];
		graph = new int [8];
		dfs(0);
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static void dfs(int cnt)throws IOException {
		
		if(cnt==M) { 
			for(int i=0;i<M;i++) {
				bw.write(String.valueOf(graph[i]+" "));
			}
			bw.newLine();
			return;
		} 
		
		for(int i = 1; i<=N; i++) {
 			check[i]=true;
			graph[cnt]=i;
			dfs(cnt+1);
			check[i]=false;
		}
	}
}