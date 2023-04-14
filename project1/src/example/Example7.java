package example;

import java.util.ArrayList;
import java.util.Scanner;

public class Example7 {
	/*
	 응용문제3 
	 사용자가 총 7개의 숫자를 입력합니다.
	 그중 7개의 숫자 중 짝수 값이 몇개 입력 되었는지 출력하시오
	 또한, 최종 배열 값도 출력합니다.
	 */
	ArrayList<Integer> user = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Example7 ex = new Example7();
		ex.abc();
	}
	public void abc() {
		
		int w = 0;
		int count = 0;
		System.out.println("7개의 숫자를 입력하세요"); //메시지는 1번만 출력
		while(w < 7) { //7번반복
			Integer userNum = sc.nextInt(); //입력값 7번 출력
			this.user.add(userNum);
			if(userNum % 2 == 0) {  //사용자가 입력한 값이 짝수일경우
				count++; //+1씩 증가(카운팅)
			}
			w++;
		}
		System.out.println(this.user +"\n짝수는: "+ count + "개 입니다");
		sc.close();
	}
}
