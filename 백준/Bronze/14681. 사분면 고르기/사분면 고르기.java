import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//정수 x
		int x = sc.nextInt();
		
		//정수 y
		int y = sc.nextInt();
		

		if(x<0) {
			if(y<0) {
				System.out.println("3");
			} else {
				System.out.println("2");
			}
		} else {
			if(y<0) {
				System.out.println("4");
			} else {
				System.out.println("1");
			}
		}
		
	}

}