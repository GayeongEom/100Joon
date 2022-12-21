import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		System.out.println((B%10)*A);
		System.out.println((B/10)%10*A);
		System.out.println((B/100)*A);
		System.out.println(A*B);
	}

}
