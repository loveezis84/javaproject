package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Array13 {
	//사용자 아이디 입력 및 배열 데이터로 변환
	
	public static void main(String[] args) {
	
		String list = "";
		Scanner sc = new Scanner(System.in);
		int f;
		
//		반복문 없이 사용 nextLine();
		System.out.println("학급 학생 아이디를 입력해주세요");
		String id = sc.nextLine();
		list += id + " ";
		
//		for(f=0; f<=4; f++ ) {
//			System.out.println("학급 학생 아이디를 입력해주세요");
//			String id = sc.next();
//			list += id + " ";	
//		}
		//split : 문자열 또는 숫자열을 특정 문자 기준으로 배열화 하는 명령어
		String[] userdata = list.split(" ");
		System.out.println(Arrays.toString(userdata));
		sc.close();
	}
}
