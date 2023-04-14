package java1;

import java.util.Scanner;

public class index9 {
	
	//한줄 이상 입력 관련 및 공백
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Q.두개의 숫자를 입력하세요?");
		//next,nextInt
		//스페이스바를 이용하여 2개의 숫자 또는 문자를 입력가능	
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.printf("첫번째 숫자 %d,두번째 숫자 %d",a,b);	
		
		System.out.println("\nQ.두명의 이름을 입력하세요?");
		String c = sc.next();
		String d = sc.next();
		System.out.printf("첫번째 이름 : %s, 두번째 이름 : %s",c,d);
		
		/*
		위에 스캐너에서는 2개의 값을 받아서 출력하고있는데(nextInt,next)
		아래에서 한개의 nextLine으로 출력하려고 요청하니까 오류가 생김
		이럴땐 새로운 스캐너를 하나더 생성해서 출력하면 해결됨.
		nextLine : 스페이스바는 그냥 공백으로 인식
		*/
		Scanner sc2 = new Scanner(System.in);
		System.out.println("\nQ.주소를 입력하세요");
		String e = sc2.nextLine();
		System.out.println("주소:"+e);
		sc.close();
		sc2.close();
	}
}
