import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st1.nextToken());
		int X = Integer.parseInt(st1.nextToken());
		int[] arr = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		for(int i : arr) {
			if(i<X) sb.append(i).append(" ");
		}
		System.out.println(sb);
	}

}
