package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Array7 {
	// 배열 생성 응용편
	public static void main(String[] args) {
		/*
		 * 응용문제6 사용자가 상품을 검색합니다. 사용자가 검색한 내용을 배열로 저장되도록 하십시오. 예시) 상품검색 : 선풍기 상품검색 : 냉장고
		 * 상품검색 : 모니터 상품검색 : 검색종료 [선풍기,냉장고,모니터,null,null,null,null];
		 */

		Scanner sc = new Scanner(System.in);
		String[] product = new String[7];
		int ea = product.length; // 7개

		int w = 0;
		while (w < ea) {
			System.out.printf("상품검색 :");
			String word = sc.nextLine();
			//Arrays.toString : 숫자,문자,소수[]의 현재 배열 변수값을 출력하는 함수
 			if(word.equals("검색종료")){
				System.out.println(Arrays.toString(product));
				break;
			}
			else {
				product[w] = word;
				
			}
			w++;
		}
	}
}
