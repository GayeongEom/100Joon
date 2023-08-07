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
		int N = Integer.parseInt(bf.readLine());
		if((M+N)>=60) {
			H += (M+N)/60;
			M = (M+N)%60;
			if(H>=24) H -= 24;
		} else {
			M += N;
		}
		System.out.println(H+" "+M);
	}

}
