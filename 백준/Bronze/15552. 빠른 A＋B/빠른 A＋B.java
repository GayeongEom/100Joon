import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n = Integer.parseInt(br.readLine());
			
			for(int i=0; i<n; i++) {
				
				String s = br.readLine();
				
				int a = Integer.parseInt(s.split(" ")[0]);
				int b = Integer.parseInt(s.split(" ")[1]);
				
				bw.write(a + b + "\n");
			
			}
			
			bw.flush();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
