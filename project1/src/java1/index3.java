package java1;

public class index3 {

	public static void main(String[] args) {
		//if문
		int a,b;
		a = 10*2;
		b = 20;
		if(a < b) {
			System.out.println("b값이 큽니다.");	
		}
		else if(a > b) {
			System.out.println("a값이 큽니다.");
		}
		else {
			System.out.println("두값이 같습니다");
		}
		
		/*
		 응용문제.1
		 1번 항목은 숫자 10, 9, 22이며,
		 2번 항목은 숫자 19, 10, 2입니다. 
		 첫번째 두번째 숫자는 더하며, 세번째 숫자는 곱할경우 결과값이
		 작은 항목이 출력 되도록 코드를 작성하시오
		 결과는 예시)1번항목 결과가 작습니다.
		*/
		int a1 = 10+(9*22);
		int a2 = 19+(10*2);
		
		if(a1 > a2) {
			System.out.println("a2 값이작습니다.");
		}
		else if(a1 < a2) {
			System.out.println("a2 값이 큽니다.");
		}
		
		String userid = "hong";
		String userpw = "a123456";
		if(userid == "hong" && userpw == "a123456") {
			System.out.println("로그인 되셨습니다");
		}
		else {
			System.out.println("아이디 및 패스워드를 확인하세요");
		}
		
		//정수에서 소수점 결과를 출력하는 경우
		int aa = 103;
		double bb = aa / (double)3;
		System.out.println(bb);
		
		//Integer : 매개체에 대한 속성을 말한다.
		//.toString()문자열로 변환
		//.parseInt() 또는 .valueOf() 문자를 숫자로 변환할때 사용
		
		//숫자를 문자로 변환하여 출력하는 경우
		int cc = 500;
		String dd = Integer.toString(cc);
		
		//문자를 숫자로 변환하여 출력하는 경우
		String c1 ="600";
		int d1 = 10;
		//int sum = Integer.valueOf(c1) + d1;
		int sum = Integer.parseInt(c1) + d1;
		System.out.println(sum);
		
		//증가, 감소
		int z = 10;
		z++;
		System.out.println(z);
		
		//+= , -=, *=, /=
		int k = 50;
//		k = k + k;
		k += k;
		System.out.println(k);
		
		//간단문자표현 (char - ""는적용이안되고 ''와 적용됨)
		char f = 'Y';
		System.out.println(f);
		
	}
}
