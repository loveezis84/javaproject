package java3;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class OOP4 {

	/*
	 * 응용문제2 (주)이루온 - 코딩 테스트 해당 원시 배열 
	 * 데이터를 이용하여 추상 
	 * 클레스에서 해당 결과값이 돌출 될 수 있도록 코드를
	 * 작성하시오 회원 전체의 포인트 합계를 출력하시오. 
	 * (abstract 사용) 추상 클레스명은 Userinfo 입니다.
	 */
	public static void main(String[] args) {
		
		Total tt = new Total();
		tt.result();

	}
}
class Total extends Userinfo2 {
	
	@Override
	public void result() {

		int w = 0;
		Integer sum = 0;
		while (w < this.arry.size()) {

			sum += Integer.parseInt(this.arry.get(w)[6]);
			w++;
		}
		DecimalFormat sumformat = new DecimalFormat();
		System.out.printf("포인트의 총 합은: %s점 입니다",sumformat.format(sum));
	}
}
