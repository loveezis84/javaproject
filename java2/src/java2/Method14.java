package java2;

import java.util.Scanner;

public class Method14 {
	//Object 클레스
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		test1 ts = new test1();
		ts.info("홍길동",30);  //받는쪽에서 Object로 받게되면 String,int와같은 형식도 받을수있다.
		boolean result = ts.equals("30");
		if(result == false) {
			System.out.println("숫자를 입력하세요");
			String number = sc.next();
		}
		else {
			System.out.println("올바른 값 입니다");
		}
		
	}
}
class test1 extends Object{ //메소드 명은 편하게 지어도상관없음
	
	private String name;
	private int age;
	public void info(String n,int a) { //setter 
		this.name = n;
		this.age = a;
	}
	@Override //오버라이드시 자료형 및 인자값을 추가하지 못함(원래 클레스의 메소드를 수정해야함)
	public boolean equals(int zz) { //boolean 숫자가 아닌 문자로 들어올 경우
		return super.equals(zz);  // 문자일 경우 false
	}
}
class Object{
	public boolean equals(int z) { 
		//같은 class값을 비교하는 메소드
		
		return true;
	}
	
}