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
		
		//String 저장
		try {
			
			
			//반복
			while(true) {
				
				String tc = br.readLine();

				int a = Integer.parseInt(tc.split(" ")[0]);
				int b = Integer.parseInt(tc.split(" ")[1]);
				
				//입력된 값이 0이면 종료
				if(a==0 && b==0) break;
				
				bw.write((a+b) +"\n");
				
			}// while
			
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
