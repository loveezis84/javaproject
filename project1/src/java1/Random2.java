package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Random2 {
	//random 으로 활용법
	public static void main(String[] args) {
		/*
		응용문제1.
		pc가 1~46숫자 6개를 무작위로 생성합니다.
		해당 6개의 숫자를 배열화하여 출력하시오 
		*/

		int[] user = new int[6];
		
		int w = 0;
		while(w < 6) {
			
			user[w] = (int)Math.ceil(Math.random()*46);
			
			w++;
		}
		System.out.println(Arrays.toString(user));

	}
}
