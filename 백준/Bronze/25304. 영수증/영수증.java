import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt(); //총금액
		int N = sc.nextInt(); //구매한 물건 종류의 수
		
		int sum=0;
		
		//구매내역 합계
		for(int i=1; i<=N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			sum += (a*b);
		}
		
		//출력
		if(X==sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
