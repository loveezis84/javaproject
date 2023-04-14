package java1;

import java.util.Arrays;

public class Array11 {
	// 2차배열 응용편
	public static void main(String[] args) {
		/*
		 응용문제7 
		  해당 배열값을 기준으로 짝수, 홀수 인지를 나열하는 배열 
		  결과를 출력하는 코드를 작성하시오.
		  Adata[0] = 5 17 19 22 33
		  Bdata[1] = 1 2 3 4 5
		 */
		
		int[][] data = {
				{5,17,19,22,33},
				{1,2,3,4,5}
				};
		
		int ea = data[0].length;
//		System.out.println(ea); //5개
		
		String[][] Data2 = new String[data.length][data[0].length];
		
		int w = 0;
		int sum = 0;
		while(w < ea) {
			sum = data[0][w]+data[1][w];
			
			if(sum % 2 == 0) {
				Data2[0][w] = data[0][w]+data[1][w]+":"+"짝수";
			}
			else  {
				Data2[0][w] = data[0][w]+data[1][w]+":"+"홀수"; 
			}
			w++;
		}
		System.out.println(Arrays.toString(Data2[0]));
	}
}
