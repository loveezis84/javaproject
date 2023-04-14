package java1;

import java.util.Scanner;

import java1.login;

public class Class10 {

	public static void main(String[] args) {
		/*
		 로그인 프로세서 
		 1."아이디를 입력하세요"
		 2."패스워드를 입력하세요"
		 3.hong/a123456 으로 입력시 "로그인 되었습니다;
		 4.hong 외에 아이디는 "가입되지 않은 사용자입니다"
		 */
		 login a = new login();
	}

}
class login{
	Scanner sc = new Scanner(System.in);
	public login() {
		check();
	}
	public void check() {
		String id = rt("아이디를 입력하세요");
		String pw = rt("패스워드를 입력하세요");
		
		if(id.equals("hong")) {
	
				int count = 1;
				while(count <= 3) {
					
					if(pw.equals("a123456")) {
						System.out.println("로그인 되었습니다");
						break;
					}
					else if(count == 3) {
						System.out.println("패스워드를 3회 틀리셨습니다");
						System.out.println("해당 아이디는 10분 후에 로그인 가능합니다");
						break;
					}
					else {
						pw = rt("패스워드를 다시 입력하세요"+"("+(count)+")회 틀리셨습니다");
						count++;
					}
				}
			}
		else {
			System.out.println("가입되지 않은 사용자 입니다");
		}
		
	}
	public String rt(String a) {
		System.out.println(a);
		String join = sc.next();
		return join;
	}
}
