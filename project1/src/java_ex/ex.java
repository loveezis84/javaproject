package java_ex;

import java.util.ArrayList;
import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		
		UserNumber un = new UserNumber();
		un.NumberInput();
		/*
		 응용문제3 
		 사용자가 총 7개의 숫자를 입력합니다.
		 그중 7개의 숫자 중 짝수 값이 몇개 입력 되었는지 출력하시오
		 또한, 최종 배열 값도 출력합니다.
		*/
	}
}
class UserNumber{
	Scanner scanner;
	int number = 0;
	ArrayList<Integer> numberList = new ArrayList<>();
	public void NumberInput() {
	
	this.scanner = new Scanner(System.in);
	int count = 0;
	int ea = 0;
		while(true) {
			if(count == 7) {
				break;
			}
			System.out.printf("총 7개의 숫자를 입력하세요 (%d개)",count);
			number = scanner.nextInt();
			numberList.add(number);
			count++;
			if(number % 2 == 0) {
				ea++;
				System.out.println(ea);
			}
		}
		System.out.printf("사용자가 입력한 값은: %s\n짝수의 갯수는: %d입니다",numberList,ea);
	}
}










