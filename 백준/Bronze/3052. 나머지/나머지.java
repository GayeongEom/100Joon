import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[42];
		for(int i=0; i<10; i++) {
			arr[Integer.parseInt(br.readLine())%42]=true;
		}
		int cnt = 0;
		for(boolean b : arr) {
			if(b) cnt++;
		}
		System.out.println(cnt);
		
	}

}
