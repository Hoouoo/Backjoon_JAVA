package backjoon_java;
import java.util.Scanner;

public class Ch11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] time = new int[N];
		int sum=0;
		int L=0,tmp=0;
		for(int i = 0; i<N; i++) {
			time[i]=sc.nextInt();
		}
		insert_sort(time,N);
		for(int i = 0; i<N; i++) {
			for(int j=0;j<=i;j++)
				sum+=time[j];
		}
		
		System.out.println(sum);

	}
	public static void insert_sort(int[] arr,int N) {
		int L,tmp;
		for(int F=0; F<N-1; F++) {
			L = F;
			while(L >= 0 && arr[L]>arr[L+1]) {
				swap(arr,L);
				L--;
			}
		}
	}
	
	public static void swap(int[] arr,int idx ) {
		int tmp = arr[idx];
		arr[idx] = arr[idx+1];
		arr[idx+1]=tmp;
	}
}
