package backjoon_java;

import java.util.Scanner;
public class Ch2798 {

	public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);
			
	        int N = scan.nextInt();
	        int M = scan.nextInt();
	        int[] cards = new int[N];
			
	        for(int i = 0; i < N; i++) {
	            cards[i] = scan.nextInt();
	        }
			
	        int max = 0;
	        outline : for(int i = 0; i < N-2; i++) {
	            for(int j = i+1; j < N-1; j++) {
	                for(int k = j+1; k < N; k++) {
	                    int sum = cards[i] + cards[j] + cards[k];
	                    if(sum <= M) {
	                        max = Math.max(max, sum);
	                    }
	                    if(max == M) { 
	                        break outline;
	                    }
	                }
	            }
	        }
			
	        System.out.println(max);
}
	/*	Scanner sc = new  Scanner(System.in);
		int cnt = sc.nextInt(); // 카운트
		int max = sc.nextInt();  // 맥스값 
		
		int[] num= new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			num[i]=sc.nextInt();
		}
		
		S_sort(num,cnt);  // 삽입정렬 (내림차순)
		
		int val = 0;
		int val_cnt = 0;
		int loop = 0;
		
		while(val_cnt <3 && val < max) {
			for(int i=0; i<cnt; i++) {
				if(val<=max) {
					val+=num[i];
					val_cnt++;
					if(val>max) {
						val-=num[i];
						val_cnt--;
						loop++;
						if(loop==cnt-val_cnt) {
							val-=num[i-loop];
							i-=loop;
							loop = 0;
						}
					}
				}
			}
		}
		System.out.println(val);
		
	}*/
	
	public static void S_sort(int[] num,int cnt) {  // 삽이정렬 algorithm
		for(int F=0 ; F<(cnt-1) ; F++) {
			int L=F;
			while(L >= 0 && num[L] < num[L+1]) {
				int tmp = num[L];
				num[L] = num[L+1];
				num[L+1]=tmp;
				L--;
			}
		}
	}

}
