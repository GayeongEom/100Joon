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
		if(A==B && B==C) {
			System.out.println(10000+(A*1000));
		} else if(A!=B && B!=C && A!=C) {
			int L = Math.max(A, B);
			L = Math.max(L, C);
			System.out.println(L*100);
		} else {
			int S=0;
			if(A==B) S=A;
			else if(B==C) S=B;
			else S=C;
			System.out.println(1000+(S*100));
		}
	}
}
