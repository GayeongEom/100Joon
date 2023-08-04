import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println(br.readLine()+"??!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
