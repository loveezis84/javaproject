package java1;

import java.util.Scanner;

public class Double3 {

	public static void main(String[] args) {

		/*
		 응용문제7
		 사용자가 숫자 3개를 입력시킵니다.
		 3개의 숫자 중 짝수의 대한 숫자만 곱하여
		 결과값을 출력하시오 
		 단, 짝수의 숫자가 한개 또는 없을 경우
		 "짝수의 숫자가 확인 되지 않습니다.
		*/

		Scanner aa = new Scanner(System.in);
		
		double sum=1; //모든 숫자를 전체 곱한 합계 변수
		int count=0;  //짝수 갯수 확인 
		for(int a=1; a<=3; a++) {
			
			System.out.println(a+"번째의 값을 입력하세요");
			int z = aa.nextInt();
			
			if(z % 2 == 0) { // 사용자가 입력한 값이 짝수값 조건확인
				sum *= z;  //짝수값일 경우 지속적으로 곱하기
				count++; //짝수가 맞을 경우 +1증가(카운팅)
			}
		}
		if(count == 0 || count == 1) { //짝수값이 2개 미만일 경우
			System.out.println("짝수의 숫자가 화인되지 않았습니다");
		}
		else { //짝수값이 2개 이상일 경우
			System.out.println("짝수의 숫자들의 합은 " +Math.round(sum)+ "입니다");
			
		}
		aa.close();
	}
}
