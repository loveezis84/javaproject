package java1;

import java.util.Scanner;

public class Random1 {
	//무작위 숫자생성 (random 메소드 이용방법 + 재귀메소드 (자신의 메소드를 호출 또는 다른 메소드를 호출)
	public static void main(String[] args) {
		/*
		Math.ceil(x) : (올림) x 값보다 크거나 같은, 가장 작은 정수를 반환합니다. 즉, 올림을 수행합니다. 반환값은 double 형태입니다.
 		Math.floor(x) : (절삭)  x 값보다 작거나 같은, 가장 큰 정수를 반환합니다. 즉, 절삭을 수행합니다. 반환값은 double 형태입니다.
		Math.round(x) : (반올림) x 값을 반올림하여, 가장 가까운 정수를 반환합니다. 반환값은 long 형태입니다
		*/
		int number = (int)Math.ceil(Math.random() * 10);
//		System.out.println(number);
		
		/*
		  문제. 컴퓨터가 하나의 숫자를 뽑습니다.
		  사용자가 해당 숫자를 맞추는 게임입니다.
		  단,틀릴경우 컴퓨터는 다시 다른 숫자를 뽑습니다.
		  틀릴경우 : "실패"
		  맞을경우 : "정답"
		*/
		game a = new game();
		a.pc();
	}
}
class game{
	
	Scanner sc = new Scanner(System.in);
	public void pc() {
		//1 ~ 5까지 pc가 무작위 숫자를 선택함
		System.out.println("1 ~ 5까지 숫자중 하나를 입력해주세요");
		int ai = (int)Math.ceil(Math.random()*5);
		int person = this.sc.nextInt();
		//this는 해당 class내에서의 사용되는 모든것을 의미함 (안써도상관없음)
		if(ai == person) {
			System.out.println("정답입니다");
			this.sc.close();
		}
		else {
			System.out.println("실패입니다");
			this.pc(); 
			//재귀함수 this를 안써도 상관없지만 같은 클레스내에서의 메소드만 검색한다는것을 의미함
		}	
	}
}
