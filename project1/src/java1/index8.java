package java1;

import java.util.Scanner;

public class index8 {

	//Scanner와 문자열 비교
	public static void main(String[] args) {
		//equals 는 "==" 와 같은 뜻
		/*
		intern() :
		문자에 한해서 
		조건문에 equals를 사용하지 않고 연산자 기호로 처리할때 사용
		equals 를 쓰거나 .intern();을 붙여도 똑같이 동작함 문자열만사용함
		*/
		Scanner a = new Scanner(System.in);

		System.out.println("아이디를 입력하세요");
		String mid = a.next().intern();
		
		//if(mid.equals("kim") || mid.equals("park")){
		if(mid == "kim" || mid == "park"){
		//	System.out.println("회원이 확인되었습니다");
		}
		else {
	//		System.out.println("비회원 입니다.");
		}
		
		/*
		 응용문제1.
		 사용자가 원하는 숫자를 입력합니다. 단, 해당 숫자가
		 100이하 숫자만 입력해야 하며, 100초과일 경우
		 "숫자는 100까지만 입력가능합니다"
		 -추가-
		 사용자가 입력한 값이 짝수 인지 홀수 인지를 출력하시오.
		 */

		Scanner b = new Scanner(System.in);
		System.out.println("Q.1~100까지 숫자를 입력하세요");
		
		int n = b.nextInt();
		if(n > 100) {
			System.out.println("숫자는 100까지만 입력가능합니다");
		}
		else {
			
			if(n % 2 == 0) {
				System.out.println("짝수입니다");
			}
			else {
				System.out.println("홀수입니다.");
			}
		}
		a.close(); //scanner a 종료
		b.close(); //scanner b 종료
	}
}
