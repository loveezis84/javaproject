package java1;

public class Array12 {

	public static void main(String[] args) {
		/*
		 * 응용문제8 데이터 배열에 있는 모든 짝수값에 합산 결과를 출력하시오. 단, 해당 배열은 2차 배열 형태 입니다. 1번 데이터 : 11 42
		 * 22 16 2번 데이터 : 7 33 10 29 최종결과 : 90
		 */

		int[][] data = { { 11, 42, 22, 16 }, { 7, 33, 10, 29 } };
		
		int ea = data[0].length; 
//		System.out.println(ea); //4개
		int w = 0;
		int sum = 0;
		int a=0;
		int b=0;
		while(w < ea) {
			
			if(data[0][w] % 2 == 0) {
				
				a += data[0][w];
				if (data[1][w] % 2 == 0) {
					
					b += data[1][w];
				}
			}
			w++;
		}
		sum = a + b;
		System.out.println(sum);
	}
}
