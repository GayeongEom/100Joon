
import java.io.*;
import java.util.*;




public class Main {
	
	static int A,B;

	public static void main(String[] args) throws IOException{

		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token= new  StringTokenizer(bw.readLine());
		
		A = Integer.parseInt(token.nextToken());
		B = Integer.parseInt(token.nextToken());
		System.out.println(A-B);
	}

}
