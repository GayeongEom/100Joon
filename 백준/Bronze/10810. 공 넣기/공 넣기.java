import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int begin = 0;
		int end = 0;
		int val = 0;
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			begin = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			val = Integer.parseInt(st.nextToken());
			
			for(int j=begin-1; j<end; j++) {
				arr[j] = val;
			}
			
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}

		
	}

}
