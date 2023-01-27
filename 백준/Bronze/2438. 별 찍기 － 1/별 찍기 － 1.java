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
		
		//N개 읽기
		try {
			
			int N = Integer.parseInt(br.readLine());
			
			for(int i=0; i<N; i++) {
				for (int j=0; j<i+1; j++) {
					
					bw.write("*");
					
				}//for j
				
				bw.write("\n");
				
			}//for i
			
			bw.flush();
			
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
