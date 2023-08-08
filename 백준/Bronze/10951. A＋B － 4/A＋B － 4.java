import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String input = "";
		
//		while((input=br.readLine())!=null && !input.isEmpty()) {
//			st = new StringTokenizer(br.readLine());
//			int A = Integer.parseInt(st.nextToken());
//			int B = Integer.parseInt(st.nextToken());
//			sb.append(A+B).append("\n");
//		}
//		System.out.println(sb);
		
		//true로 while문 돌리기
//		while(true) {
//			if((input=br.readLine())==null) break;
//			st = new StringTokenizer(br.readLine());
//			int A = Integer.parseInt(st.nextToken());
//			int B = Integer.parseInt(st.nextToken());
//			sb.append(A+B).append("\n");
//		}
//		System.out.println(sb);
		
		//다른 사람 코드
//		while((input=br.readLine())!=null) {
//			st = new StringTokenizer(input);
//			int A = Integer.parseInt(st.nextToken());
//			int B = Integer.parseInt(st.nextToken());
//			sb.append(A+B).append("\n");
//		}
//		System.out.println(sb);

		//if문 break버전
		while(true) {
			if((input=br.readLine())==null) break;
			st = new StringTokenizer(input);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			sb.append(A+B).append("\n");
		}
		System.out.println(sb);
	}

}

//br eof 처리하는 방법!
//true로 while문을 돌리고 if문으로 break 걸어주기...
