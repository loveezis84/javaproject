package java1;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		
		Member2 mb = new Member2();
		mb.list("홍길동", 5);
		/*
		 `문제5
		 member2 class안에 신규 메소드를 생성하여 다음과같이 결과가 
		 나올수 있도록 코드를 제작합니다. 단, 사용자가 직접 구구단숫자를 입력합니다.
		 예시)"사용하실 구구단 숫자를 하나 입력해주세요:"
		 [결과] - 해당 구구단 출력 단, 역순으로 출력
		 만약 4를 입력시 4*9 = 36, 4*8=32 ... 4*1
		*/
//      순서도
//		사용자로부터 구구단 숫자를 입력받는다.
//		입력받은 숫자를 정수형으로 변환한다.
//		9부터 1까지 역순으로 반복한다.
//		각 반복에서 구구단을 출력한다.
//		출력 형식에 맞추어 출력한다.
		
		Scanner User = new Scanner(System.in);
		System.out.println("\n사용하실 구구단 숫자를 입력해주세요");
		int a = User.nextInt();
		
		mb.gugudan(a);
		User.close();
		
		
	}

}

class Member2{
	  
	//일반 메소드는 인자값을 복합적으로 적용할 수 있음.
	public void list(String user,int level) {
		System.out.printf("고객명: %s 레벨: %d",user,level);
	
	}
	public void gugudan(int zzz) {
		
		int b;
		int sum=0;
		for(b=9; b>=1; b--) {
			sum = zzz * b;
			System.out.printf("%d * %d = %d\n",zzz,b,sum);
		}		
	}
}