import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x =sc.nextInt();
		int y =sc.nextInt();
		int z =sc.nextInt();
		
		int prize = 0;
		
		if(x==y && y==z) { //3개 같을 때
			prize = 10000 + (x*1000);
		
		} else if(x==y || x==z || y==z) { //2개가 같을 때
			if(x==y || x==z) {
				prize = 1000 +(x*100);
			} else {
				prize = 1000 +(z*100);
			}	
		
		} else { //모두 다를 때
			prize = Math.max(x, Math.max(y, z)) * 100;
		}
		
		
		
		//출력
		System.out.println(prize);		

		
	}

}
