import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		//입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		while(true) {
			
			
			String tc = br.readLine();
			
			if(tc == null) {
				
				break;
				
			}
			
			
			int a = Integer.parseInt(tc.split(" ")[0]);
			int b = Integer.parseInt(tc.split(" ")[1]);
			
			
			bw.write((a+b) + "\n");
			
			bw.flush();
		}
		
		

		
		
		
		
	}

}
