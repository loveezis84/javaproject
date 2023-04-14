package java1;

import java.util.Scanner;

public class index10 {
	//for문 + Scanner
	public static void main(String[] args) {
		/*
		 응용문제2
		 Q.원하는 구구단 숫자를 입력하세요.
		 사용자가 원하는 숫자를 입력하면 해당 숫자에 맞는
		 구구단이 출력되도록 하시오.
		 예시)3을 입력하였을 경우 구구단 3 * 1부터 ~ 3 * 9 = 27까지출력 
		 */
		Scanner a = new Scanner(System.in);
		System.out.println("몇단을 출력하시겠습니까?");
		int user = a.nextInt();
		int z;
		int sum = 0;
		for(z=1; z<=9; z++) {
		
			sum = user * z;
			//System.out.println("%d * %d = %d\n",user,z,(user*z)); 
			//뒤에 변수는 순서대로 작동한다는 의미 아래수식과 같은의미
			System.out.printf(user+"*"+z+"="+sum+"\n");
			a.close();
		}
	}

}
