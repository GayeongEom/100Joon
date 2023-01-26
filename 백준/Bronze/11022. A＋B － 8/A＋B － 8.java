import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		
		//입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			//테스트 케이스 개수
			int T = Integer.parseInt(br.readLine());
			
			for(int i=0; i<T; i++) {
				
				String tc = br.readLine();
				
				int a = Integer.parseInt(tc.split(" ")[0]);
				int b = Integer.parseInt(tc.split(" ")[1]);
				
				int result = a+b;
				
				bw.write("Case #" + (i+1) + ": "+ a + " + " + b + " = " + (a+b) + "\n");
				
				
				
				
			} //for
			
			bw.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
