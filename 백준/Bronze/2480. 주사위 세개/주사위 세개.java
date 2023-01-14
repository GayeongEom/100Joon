import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x =sc.nextInt();
		int y =sc.nextInt();
		int z =sc.nextInt();
		
		int prize = 0;
		
		//3개가 다 같은건 1번
		//2개가 같은건 3번
		//모두 다른게 가장 많음
		if(x==y) { //2개가 같은 상황
			if(x==z) { //3개가 같음
				prize = 10000 + (x * 1000);
			} else {
				prize = 1000 + (x * 100);
			}
		} else if(x==z) { //2개가 같은 상황
			prize = 1000 + (x * 100);
		} else if(y==z ) { //2개가 같은 상황
			prize = 1000 + (z * 100);
		} else { //모두 다를 때
			prize = Math.max(x, Math.max(y, z)) * 100;
		}
		
		//출력
		System.out.println(prize);		

		
	}

}
