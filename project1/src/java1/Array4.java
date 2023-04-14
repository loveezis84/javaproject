package java1;

import java.lang.reflect.Array;

public class Array4 {
	//배열 범위 설정
	public static void main(String[] args) {
		
		
		int a[] = new int[5]; //a[]변수에 배열값 범위를 생성
		a[0] = 5;
		a[1] = 10;
		a[2] = 15;
		a[3] = 20;
		a[4] = 25;
		
		int ea = a.length;
		System.out.println(ea);//5개
		
		int w = 0;
		while(w < ea) {
			System.out.println(a[w]); //배열출력
			w++;
		}
		//문자배열로 추가
		String user[] = new String[3];
		user[0] = "홍길동";
		user[1] = "이순신";
		user[2] = "강감찬";
		int ea2 = user.length;
		System.out.println(ea2); //3개
		
		//단축코드로 배열 값 추가
		int number[] = new int[] {1,2,3,4,5}; 
 
	}
}
