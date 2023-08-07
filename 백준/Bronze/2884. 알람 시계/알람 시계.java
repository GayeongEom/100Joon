import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		if(H == 0) {
			if(M<45) System.out.println("23 " + (M+15));
			else System.out.println(H+" "+(M-45));
		} else {
			if(M<45) System.out.println((H-1)+" "+(M+15));
			else System.out.println(H+" "+(M-45));
		}
	}

}
