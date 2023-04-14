package example;

import java.util.Scanner;

/*
 응용문제1
 질문 "7000원 결제 하시겠습니까? 라고출력되며,
 숫자 1을 입력하면, "결제가 진행 됩니다." 라고 출력 후 프로세서는 종료됩니다.
 숫자 2를 입력하면, "결제가 취소 되었습니다." 라고 출력 후 동일하게 프로세서가 종료 됩니다.
*/
public class Example3 {

	final int money = 7000;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("출금하실 금액은?");
		Example3 ex = new Example3();
		ex.abc();
	}

	public void abc() {
		int user = this.sc.nextInt();
		
		if (user == this.money) {
			System.out.printf("%d원 결제 하시겠습니까?", this.money);
			int userselect = sc.nextInt();
			//String일 경우 intern 또는 equals를 사용해야 조건을 확인할수 있습니다.

			if (userselect == 1) {
				System.out.println("결제가 진행 됩니다");
			} 
			else if (userselect == 2) {
				System.out.println("결제가 취소 되었습니다");

			}
			this.sc.close();
		}
		else if(user > this.money){
			System.out.println("잔액이 부족합니다\n" +money+" 원 출금가능합니다");
		}
	}
}
