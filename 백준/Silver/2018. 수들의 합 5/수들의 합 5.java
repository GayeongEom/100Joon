import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sIdx = 1;
		int eIdx = 1;
		int sum = 1;
		int cnt = 1;
		
		while(eIdx<N) {
			if(sum==N) {
				cnt++;
				eIdx++;
				sum += eIdx;
			}
			else if(sum>N) {
				sum -= sIdx;
				sIdx++;
			}
			else if(sum<N) {
				eIdx++;
				sum += eIdx;
			}
		}
		System.out.println(cnt);
		
		
	}

}
