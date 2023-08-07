import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		//조건 정리
		if(A==B && B==C) {
			System.out.println(10000+(A*1000));
		} else if(A==B || B==C || A==C) {
			if(A==B || A==C) System.out.println(1000+(A*100));
			else System.out.println(1000+B*100);
		} else {
			System.out.println(Math.max(A, Math.max(B, C))*100);
		}
	}
}
