package java1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Ship a = new Ship();


	}

}
class Ship{
	
	public Ship() {
		agree();
	}
	public void agree() {
		String ag1 = inputs("회원가입 약관에 동의 하시겠습니까?(y/n): ","");
		
		if(ag1.equals("y")) {
			String ag2 = inputs("아이디를 입력하세요: ","");
			if(ag2.equals("admin")) {
				System.out.println("해당 아이디는 중복 되었습니다");
				ag2 = inputs("아이디를 입력하세요: ","");
			}
			else {
				String ag3 = inputs("패스워드를 입력하세요: ","");
				String ag4 = inputs("가입자명을 입력하세요: ","y");
				System.out.printf("\n아이디:%s 패스워드:%s 가입자명:%s",ag2,ag3,ag4);
			}
			
		}
		else {
			System.out.println("회원가입이 취소 되었습니다.");
			System.exit(0);
		}
	}
	public String inputs(String msg,String exit) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		String result = sc.next();
		if(exit.equals("y")) {
		sc.close();
		}
		return result;
	}
}