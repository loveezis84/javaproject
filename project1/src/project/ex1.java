package project;

import java.util.Scanner;

public class ex1 {
	//game 파일이랑 연결
	public static void main(String[] args) {
		
		games gm = new games(); //외부 클레스 호출
		gm.user(); //외부 메소드 실행
		
	}
}
class games implements game{
	Scanner sc;
	int count = 0;
	//this.pc : pc가 1~10까지 숫자를 뽑아 저장한 변수값;	
	@Override
	public void user() {
		sc = new Scanner(System.in);
		System.out.println("1~10까지 숫자를 입력하세요:");
		int my = sc.nextInt();
		if(my > 10) {
			System.out.println("10이하의 숫자만 입력하세요");
			user();
		}
		else {
			count++;	
			if(count > 4) { //4회 이상 틀릴경우
				System.out.println("정답을 맞추지 못했습니다.");
			}
			else { //4번의 기회
				//return 값으로 결과를 받음
				String z = result(game.pc,my);
				if(z.equals("")) { //결과값이 없으면 정답
					System.out.println("정답 입니다");
				}
				else { //그 외 결과는 모두 출력
					System.out.println(z);
					user();
				}
			}
		}
	}
	@Override
	public String result(int a, int b) {
		String msg = "";
		if(a > b) {
			msg = "up";
		}
		else if(a < b) {
			msg = "down";
		}
		return msg;
	}
}
