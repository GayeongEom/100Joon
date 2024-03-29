import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 int N = Integer.parseInt(br.readLine());
		 int M = Integer.parseInt(br.readLine());
		 
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 int[] arr = new int[N];
		 for(int i=0; i<N; i++) {
			 arr[i] = Integer.parseInt(st.nextToken());
		 }
		 Arrays.sort(arr);
		 
		 int i = 0;
		 int j = arr.length-1;
		 int cnt = 0;
		 
		 while(i<j) {
			 if(arr[i] + arr[j]==M) {
				 cnt++;
				 i++;
				 j--;
			 } else if(arr[i] + arr[j]<M) {
				 i++;
			 } else if(arr[i] + arr[j]>M) {
				 j--;
			 }
		 }

		 System.out.println(cnt);
		
		
	}

}
