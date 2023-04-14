package java3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Abstract4 {
	/*
	 응용문제1
	 1차 배열값이 있습니다. 해당 배열값 리스트를
	 오름차순으로 정렬하며, 해당 모든 배열값을 더하는
	 최종 결과값을 출력하는 코드를 작성하시오.
	 배열데이터 : 1 10 15 19 8 4 7 0 2 3 9 12
	*/
	public static void main(String[] args) {
			
		calculator ca = new calculator();
		ca.datalist();
		ca.result();
	}
}
class calculator extends sum_total{
	
	Integer[] arry;
	int count = 0;
	int count1 = 0;
	@Override
	public void datalist() {
		arry = new Integer[] {
		1, 10, 15, 19, 8, 4, 7, 0, 2, 3, 9, 12};
		Arrays.sort(arry); //오름차순 정렬
//		Arrays.sort(this.arry,Comparator.reverseOrder());
//		Arrays.sort(this.arry,Collections.reverseOrder());
		System.out.println(Arrays.toString(this.arry));
	}
	@Override
	public void result() {
	
		this.sum = 0;
		int w = 0;
		while(w < this.arry.length) {
			
			this.sum += this.arry[w];
			if(this.arry[w] % 2 == 0) {
				this.count++;
			}
			else {
				this.count1++;
			}
			w++;
		}
		System.out.printf("배열값의 총 합은: %d\n짝수는%d개,홀수는%d개",sum,count,count1);
	}
}