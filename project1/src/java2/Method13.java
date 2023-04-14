package java2;

import java.util.Scanner;

public class Method13 {

	public static void main(String[] args) {
		/*
		 응용문제1. 사용자가 구구단 숫자를 하나 입력 합니다.
		 세컨 개발자가 입력된 사항을 1~9까지 결과가 출력 되는 구구단을 개발 합니다.
		 단, 상속 받은 메소드에서 처리 되도록 코드를 작성완료하시오.
		*/
		gugu gu = new gugu();
		gu.gugu();
	}

}
class gugudan{
	protected int number;
	Scanner sc = new Scanner(System.in);
	public void gugu() {
		System.out.println("검색할 구구단을 입력하세요");
	}
	public void result() {
		
	}
}
class gugu extends gugudan{
	
	@Override
	public void gugu() {
		super.gugu();
		this.number = sc.nextInt();
		sc.close();
		result();
	}
	@Override
	public void result() {
		super.result();
		
		int w = 1;
		int sum = 0;
		while(w <= 9) {
			
			if(number < 1) {
				System.out.println("최소 1이상 숫자를 입력해주세요");
				break;
			}
			else {
				sum = number * w;
				System.out.printf("%d * %d = %d\n",number,w,sum);				
			}
			w++;
		}	
	}
}












