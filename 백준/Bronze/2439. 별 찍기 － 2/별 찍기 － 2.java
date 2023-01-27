import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		
		//입출력객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//N 읽기
		try {
			int N = Integer.parseInt(br.readLine());
			
			for(int i=0; i<N; i++) {
				
				//공백 for문
				for(int j=0; j<(N-i)-1; j++) {
					
					bw.write(" ");
					
				}
				
				//* for문
				for(int j=0; j<i+1; j++) {
					bw.write("*");
				}
				
				bw.write("\n");
								
			}//for i
			
			//버퍼 비우기
			bw.flush();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
