package java1;

import java.util.Arrays;

public class Class_array1 {
	
	//외부 파일에 있는 class + array(배열) 로드
	//Data1.java와 함께 사용
	//Data1.java를 실행함
	public static void main(String[] args) {
		
		Data1 db = new Data1(); //외부파일 class를 로드
		System.out.println(Arrays.toString(db.user));
		//외부 전역변수 값 출력
		db.userlist(); //외부파일 메소드 호출 //반복문 호출
		System.out.println(db.number);
		/*
		 메소드를 호출 후 전역변수 값과 호출 전 전역변수 값이 다릅니다.
		*/
	}
}
