package java1;

import java.util.Scanner;

public class index14 {
	//할인율 구하는 공식 방법
	public static void main(String[] args) {
		 
		int money = 10000;
		int coupon = 20;
		double a = coupon * 0.01; //8000
		double b = money * a; //2000
		double c = money - b;
		
		//(int)란 double 자료형을 변환시킬때 사용
		int total = (int)Math.round(c);
		//한줄 라인으로 표현
		//double sum = money-(money*(coupon * 0.01));
		System.out.println(total);
		
		
		/*
		 응용문제4
		 총 상품금액이 50000원 입니다.
		 사용자에게 "할인 쿠폰을 얼마를 적용할까요?" 라는 질문과함께
		 숫자를 받습니다.
		 결과값으로 사용자가 적용한 할인율을 최종 상품금액으로 출력하시오 
		*/
		
		
		
		Scanner bb = new Scanner(System.in);
		System.out.println("할인 쿠폰을 얼마를 적용할까요?");
		int price = 50000;
		int user = bb.nextInt();
		
		double sales = user * 0.01; // 유저에게 입력받은 값 (할인율)
		double total2 = price * sales; // 원래금액에서 할인율적용해서 할인된금액
		double result =  price - total2;
		System.out.println("결제금액은 :" +(int)Math.round(result)+ "원입니다");
	
		bb.close();
			
	}
}
