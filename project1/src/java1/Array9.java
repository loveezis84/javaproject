package java1;

import java.util.Arrays;

public class Array9 {

	//2차 배열 구조 및 출력
	/*
	동적배열 :
	 int[] a = {1,2,3};
	 int a[] = {1,2,3};
	 int[] a = new int[]{1,2,3};
	 
	 정적배열
	 int a[] = new int[2];
	 a[0]=1;
	 a[1]=2;
	 //--------------------------------------------//
	 동적배열 전달
	 get
	 a1=10,20,30,40,50;
	 
	 정적배열 전달
	 get
	 a1=10&a2=20&a3=30&a4=40;
	 */
	public static void main(String[] args) {
		String[][] member = {
				{"홍길동","김유신","유관순"},
				{"25","31","22"}	
		} ;
//		System.out.println(Arrays.toString(member[0]));
//		System.out.println(member[0][2]);
		
		int w = 0;
		while(w < member.length) {
			//전체 바퀴수
			int ww = 0;
			while(ww < member[0].length) {
				//3개씩 2번 돌아가는 반복문
				System.out.println(member[w][ww]);
				ww++;
			}
			w++;
		}
	}
}
