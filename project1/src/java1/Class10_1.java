package java1;

import java.util.Scanner;


public class Class10_1 {
	//로그인 프로세서
	public static void main(String[] args) {
		/*
		 로그인 프로세서 
		 1."아이디를 입력하세요"
		 2."패스워드를 입력하세요"
		 3.hong/a123456 으로 입력시 "로그인 되었습니다;
		 4.hong 외에 아이디는 "가입되지 않은 사용자입니다"
		 */
		
		userlogin ul = new userlogin();
		ul.login();
	}
}


class userlogin{
	
	int count = 0; //3회 틀릴경우 로그인이 잠김
	Scanner sc = new Scanner(System.in);
	String msg = "";
	
	public String pwck(String id) {
		count++;
		System.out.println("패스워드를 입력하세요");
		String pw = sc.next();
		if(pw.equals("a123456") && id.equals("hong")){
			msg = "yes";
		}
		else {
			if(count < 3) {
				System.out.println("패스워드가 틀립니다.("+count+")");
				pwck(id);				
			}
			else {
				msg = "no";
			}
		}
		return msg;
	}
	public void login() {
		System.out.println("아이디를 입력하세요");
		String id = sc.next();
		//result : yes : 로그인 되었습니다. no : 로그인 실패 10분후 다시 로그인
		
		String result = pwck(id); //패스워드 입력 및 검토
		if(result.equals("yes")) {
			System.out.println("로그인 되었습니다");
		}
		else {
			if(!id.equals("hong")) {
				System.out.println("가입되지 않은 사용자 입니다.");
			}
			else {
				System.out.println("해당 아이디는 10분후에 다시 로그인 하실수있습니다.");				
			}
		}
		sc.close();
	}
}