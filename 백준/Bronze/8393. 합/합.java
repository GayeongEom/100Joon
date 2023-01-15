import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner (System.in);
		
		int sum = 0;
		int n = sc.nextInt();

		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}