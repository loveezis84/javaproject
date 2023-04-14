package java1;

import java.util.Scanner;

public class index11 {
	//while문, do~while문
	public static void main(String[] args) {
		
		//while문
		int a = 1;
		while(a<=9) {
				
//			System.out.println(a);
			a++;
		}
		
		//do~ while문
		int b = 1;
		
		do {
			
//			System.out.println(b);
			b++;
		}while(b<=9);
		
		/*
		 응용문제3 
		 사용자가 두개의 숫자를 입력합니다.
		 두 숫자의 범위에 있는 모든 값을 더하는 코드를 작성하시오
		 예시)10 15 
		*/
		
		Scanner c = new Scanner(System.in);
		System.out.println("두개의 값을 입력하세요");
		int z = c.nextInt();
		int q = c.nextInt();
		int sum=0;
		
		while(z <= q){
			
			sum += z;
			z++;
		}
		System.out.printf("총합계치는 : %d",sum);
		c.close();
	}
}
