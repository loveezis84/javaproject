package java1;

import java.util.Scanner;

//Scanner class 활용법

public class index6 {

	public static void main(String[] args) {
		//숫자 형태의 Scanner
		Scanner a = new Scanner(System.in);
		
		System.out.println("Q.당신의 나이는?");
		
		int age = a.nextInt();
		System.out.printf("입력하신 나이는 %d ", age);
		
		//문자 형태의 Scanner
		Scanner b = new Scanner(System.in);
		
		System.out.println("\nQ.당신의 성함은?");
		
		String name = b.next();
		System.out.printf("고객명 %s 입니다", name);
		
		//Scanner 종료
		b.close();
		a.close();
	}

}
