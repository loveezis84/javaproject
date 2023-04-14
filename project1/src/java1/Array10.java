package java1;

import java.util.Arrays;

public class Array10 {
	//2차 배열 + 다차원 배열
	public static void main(String[] args) {
		//숫자 형태의 2차 배열
		int[][] data = {
				{1,2,3},
				{3,4,5}
		};
		//정적배열 형태  - 2차 배열 값 넣기
		int indata[][] = new int[2][5]; //2개의 배열이 있는데  그안에 값은 5개씩
//		System.out.println(indata.length);
		indata[0][0] = 10;
		indata[0][1] = 20;
		indata[0][2] = 30;
		indata[0][3] = 40;
		indata[0][4] = 50;
		indata[1][0] = 100;
		indata[1][1] = 200;
		indata[1][2] = 300;
		indata[1][3] = 400;
		indata[1][4] = 500;
		System.out.println(Arrays.toString(indata[1]));
	}
}
