package project;

import java.util.Random;
import java.util.Scanner;

/*
 응용문제4
  업,다운 퀴즈를 하도록 합니다.
  pc가 1~10까지 임의 숫자를 선택 합니다. 단, interface 사용
  "1~10까지 숫자를 입력하세요"
  라는 메시지와 함께 사용자가 숫자를 하나 선택합니다.
 
  결과는 pc가 4라는 숫자를 선택 하였고, 사용자가 8이라는 숫자를
  선택 하였다면 Down을 만약 사용자가 1이라는 숫자를 선택 하였다면
  Up 이라는 메시지를 출력합니다. 단,횟수는 딱 4회만 할 수 있도록 합니다.
  pc가 뽑은 숫자와 사용자가 뽑은 숫자가 같을 경우 "정답"  이라는 메시지 출력,
  4회 이상일 때는 "정답을 맞추지 못했습니다." 라는 결과값을 출력 
 */
public class Example1 {

	public static void main(String[] args) {

		updowngame ud = new updowngame();
		ud.userNum();

	}

}
class updowngame implements random {
	Scanner sc;

	@Override
	public void userNum() {
		this.sc = new Scanner(System.in);
		int number;
		int userNum1;
		int count = 0;
		System.out.println("1~10까지 숫자를 입력하세요");
		number = (int) Math.ceil(Math.random() * 10);
		while (true) {
			
			if(count >= 4) {
				System.out.println("정답을 맞추지 못했습니다.");
				break;
			}
			userNum1 = sc.nextInt();
			if(userNum1 > 10) {
				System.out.println("1~10까지만 입력하세요");
				continue;
			}
			if (userNum1 > number) {
				System.out.println("Down");
				count++;
			}
			else if(userNum1 < number) {
				System.out.println("up");
				count++;
			}
			else {
				System.out.println("정답입니다");
			}
		}
	}
}