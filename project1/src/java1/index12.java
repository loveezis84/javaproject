package java1;

import java.math.BigInteger; //BigInteger 클레스 로드

public class index12 {
	//Big_loop 값 설정
	public static void main(String[] args) {
		// 1~100까지 모든 숫자를 곱하여 최종 결과값 출력
		int w = 1;
		BigInteger sum = new BigInteger("1");
		//BigInteger : java 에서 유일하게 무한의 값을 가질수 있는 변수형
		//단, 변수값에 최초값은 무조건 문자 "" 로 설정합니다. 
		
		while(w <= 100) {
			/*
			add : 사칙연산의 더하기 담당
			multiply : 사칙연산의 곱하기 담당
			subtract : 사칙연산 빼기 담당
			divide : 사칙연산의 나누기 담당
			*/
			sum = sum.multiply(BigInteger.valueOf(w)); //BigInteger = sum과 동일
			//valueOf(w) 는 문자를 숫자로 변환시켜줌 w의값은 "1"의 문자로 되어있기때문에 바꿔서 계산함
			w++;
		}
		System.out.println(sum);
	}
}
