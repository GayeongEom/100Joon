import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt(); //시
		int B = sc.nextInt(); //분
		int C = sc.nextInt(); //필요한 시간

		int endtime = B + C;

		if(endtime>=60) { //n시간 n분 소요될 때
			A += endtime/60; //A에 n시간 더하기
			B = endtime-(endtime/60*60);

			if(A>23) { //A가 23시 넘으면 
				A -= 24;
			} //A if end
		} else {
			B = endtime;
		}

		//출력
		System.out.println(A + " " + B);



	}

}
