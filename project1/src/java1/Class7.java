package java1;

import java.util.Scanner;

public class Class7 {
	//응용편 : 회원가입시 약관 동의 및 간편회원 가입 진행
	//1."회원가입 약관에 동의하시겠습니까?(y/n)";
	//2.사용자가 n을 선택시 "회원가입이 취소되셨습니다.
	//3.y를입력시 다음과같이 질문사항이 출력 됩니다.
	//-"아이디를 입력하세요"
	//-"패스워드를 입력하세요"
	//-"가입자명을 입력하세요"
	//4.모두 입력 완료시 "정상적으로 회원가입이 완료 되었습니다. 출력
	//*단, 아이디가 admin으로 입력 되었을 경우 "중복된 아이디 입니다."
	//라는 콘솔 출력과 함께프로그램 종료;
	public static void main(String[] args) {
		//해당 코드는 단 한줄로만 사용합니다.(외부클레스 기준으로작성합니다)
			
		memberAgree agree = new memberAgree();
		
	}

}

class memberAgree{
	String abc;
	Scanner check = new Scanner(System.in);
	memberAgree(){
		System.out.println("회원가입 약관에 동의하시겠습니까?(y/n)");
		abc = check.next().intern();
		register(abc);
	
	}
	public void register(String bbb) {
				
		if(bbb == "y") {
			System.out.println("아이디를 입력하세요");
			String id = check.next().intern();	
			
			if(id == "admin") {
				System.out.println("중복된 아이디 입니다.");
				System.exit(0);
			}
			else {
				System.out.println("패스워드를 입력하세요");
				String pwcheck = check.next().intern();
				System.out.println("가입자명을 입력하세요");
				String namecheck = check.next().intern();
	
				if(id != "" && pwcheck != "" && namecheck != "") {
					System.out.println("회원가입이 완료 되었습니다");
				}
				else {
					System.out.println("정상적인 접근이 아닙니다.");
				}
			}
			
		}
		else {
			System.out.println("회원가입이 취소되었습니다");
		}
		
	}
}