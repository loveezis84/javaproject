package java3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OOP1 {

	static Scanner sc;
	static ArrayList<Integer> money;
	public static void main(String[] args) {
		/*
		 응용문제1 
		 사용자가 입금을 처리하게 됩니다.
		 총 8번의 횟수 금액을 입력하게 되며,
		 모든 입금이 완료 되었을 경우 최종 합계금액을 출력시키는
		 프로세서를 구축하시오 
		 예시)
		 입금할 금액을 적으세요?
		 500
		 입금할 금액을 적으세요?
		 1000
		 
		 500 100 ~ 
		 최종 입금금액 : 
		 */
		int count = 0;
		Integer sum = 0;
		money = new ArrayList<>();
		System.out.println("입금할 금액을 적으세요");
		while(true) {
			sc = new Scanner(System.in); 
			try {
			money.add(sc.nextInt());
			count++;
			if(count == 8) { //count의 값이 8이 되면 반복문 break
				break;
			}
			}
			catch (Exception e) { //숫자 미입력시
				System.out.println("제발 숫자만 입력 하세요");
				continue;	
			}
		}
		for(int value : money) {
			sum += value;
		}	
		DecimalFormat df = new DecimalFormat();
		System.out.printf("현재 입금 금액은: %s원입니다",df.format(sum));
	}
}