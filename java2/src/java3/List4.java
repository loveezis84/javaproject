package java3;

import java.util.ArrayList;
import java.util.Scanner;

public class List4 {
	//무한루프로 배열 코드 연계
	public static void main(String[] args) {
		//for(;;){} // 무한루프
		
		//무한루프 사용하는 이유는 : DB의 갯수를 전체적으로 반복시키기 위해서
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		Integer no; //사용자가 입력한 숫자값을 저장하는 변수
		while(true) {
			System.out.println("숫자를 입력해주세요");
			no = sc.nextInt(); 
			al.add(no); //빈배열에 순차적으로 데이터를 입력시킴
			int ea = al.size(); //배열의 크기를 반복적으로 확인
			if(ea > 9) { //10개가 됐을때 반복문 종료
				
				break;
			}
		}
		sc.close();
		System.out.println(al);
	}
}
