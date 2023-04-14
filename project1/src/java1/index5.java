package java1;

import java.util.Scanner; // 클레스 로드

public class index5 {

	public static void main(String[] args) {
		//system.in(입력) !=system.out(출력)
		//new : 객체를 선언하는 것을 의미함
		//새로운 입력값을 받도록 클레스를 생성
		
		Scanner sc = new Scanner(System.in); 
		//사용자가 직접 값을 입력하는 도구 틀 (인풋같은형태)
		int a = 10;
		System.out.println("사용자가 원하는 숫자를 입력하세요");
		//print,prinf : 출력라인이 같은 라인으로 출력됨
		//println = 줄바꿈
		int b = sc.nextInt(); //사용자 입력값을 숫자로 받음
//		String b = sc.next(); //사용자 입력값을 문자값으로 받음
		System.out.println(b);
		
		//10을 맞추는 up,down 게임
		if (a > b) {
			System.out.println("up");
		}
		else if(a < b) {
			System.out.println("down");
		}
		else {
			System.out.println("정답입니다");
		}
		sc.close();
		//Scanner 사용후 항상 닫아줘야한다.
		//위에서 스캐너 사용하고 프로세서가 끝나는 시점에 닫아줘야 메모리가 누수되는걸 방지할수있다.
	}
}