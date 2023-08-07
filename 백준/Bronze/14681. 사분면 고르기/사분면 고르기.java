import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(bf.readLine());
		int B = Integer.parseInt(bf.readLine());
		if(A>0) {
			if(B>0) System.out.println(1);
			else System.out.println(4);
		} else if(A<0) {
			if(B>0) System.out.println(2);
			else System.out.println(3);
		}
	}
}
