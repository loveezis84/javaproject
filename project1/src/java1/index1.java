package java1; // package란 프로젝트 그룹을 말합니다.

public class index1 { //index1 이라는 클레스 명
	//필드공간(전역변수)	
	
	//main 메소드는 java에 기본으로 실행되는 최초의 함수같은의미
	public static void main(String[] args) {
		//지역변수
		//변수선언시 무조건 자료형을 입력받게 됩니다.
		String a = "홍길동"; //문자 자료형 변수
		int b = 10; //숫자 자료형 변수
		int c = 20;
		int d = b + c;
		System.out.println(a);
		System.out.println(d);
		
		double e = 1.5f; //소수 자료형 변수
		/*
		 float:소숫점 기준45개 (숫자 뒤에 f)
 		 double:소숫점 기준으로 320개
		*/
		System.out.println(e);
		
		long f = 123456789123456789L; 
		//숫자 자료형 중 표현가능한 범위를 L붙여주면 출력됨
		System.out.println(f);
		/*
		byte : -128 ~ 127
		short : -32600 ~ 32600
		int : -2,147,000,000 ~ 2,147,000,000
		long : -9,000,000,000,000,000 ~ (숫자 뒤에 L)
		*/
		
		byte aa = 127;
		System.out.println(aa);
		
		
	}

}
