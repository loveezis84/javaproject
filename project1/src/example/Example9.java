package example;

import java.util.Scanner;

public class Example9 {
	/*
	 응용문제4 
	 [자판기 프로세서 개발] 다음과 같이 작동 되도록 코드를 작성하시오.
	 "금액을 입력하세요:" 
	 "다음 메뉴를 선택하세요:[콜라,사이다,환타,포카리]"
	 "최종 남은 금액은 xx 얼마 입니다."
	 */
	Scanner sc = new Scanner(System.in);
	String data[][] = {
			{"콜라","사이다","환타","포카리"},
			{"500","500","600","800"}
	};
	public static void main(String[] args) {
			
		Example9 ex = new Example9();
		ex.abc();
	}
	public void abc() {
		
		int ea = data[0].length; //4개
		System.out.println("금액을 입력하세요: ");
		int money = sc.nextInt();
		System.out.printf("다음메뉴를 선택하세요:\n[%s,%s,%s,%s]\n",data[0][0],data[0][1],data[0][2],data[0][3]);
		String menu = sc.next();
		int total = 0;
		int w = 0;
		while(w < ea) {
			if(menu.equals(data[0][w])){
				total = money - Integer.parseInt(data[1][w]);
			}
			w++;
		}
		if(total < 0) {
			System.out.println("금액이 부족합니다.");
		}
		else {
			System.out.println("최종 남은 금액은" + total + "원 입니다");
		}
	}
}
