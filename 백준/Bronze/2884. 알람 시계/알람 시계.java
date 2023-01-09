import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//입력개체
		Scanner sc = new Scanner(System.in);

		//H
		int hour = sc.nextInt();
//		h>=0 && h<=23;
		//M
		int minute = sc.nextInt();
//		m>=0 && m<=59;
		
		//구현
		if(hour==0) {
			if(minute >=45) {
				minute -= 45;
			} else {
				hour =23;
				minute = 60+(minute-45);
			}
			
		} else if(hour<=23) {
			if(minute >=45) {
				minute -= 45;
			} else {
				--hour;
				minute = 60+(minute-45);
			}
		}
		
		//출력
		System.out.println(hour + " " + minute);


	}

}
