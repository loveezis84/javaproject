package project;

import java.util.ArrayList;
import java.util.Arrays;

public class Object3 {

	public static void main(String[] args) {
		
		ob1 ob = new ob1();
		ob.data1();

	}

}
class ob1{
	ArrayList<Object[]> al; //2차 배열 이상
	Object data[][]; //원시 2차 배열
	
	public void data1() {
		this.data = new Object[][] {
				{"hong","kim","park","hong","kang","jang"},
				{2000,5000,4000,2200,3100,4120}
		};
		this.al = new ArrayList<>(Arrays.asList(this.data));
		System.out.println(Arrays.toString(this.al.get(0)));
		/*
		 응용문제1
		 해당 배열값 중 평균 총 포인트는 얼마인지 결과값을 출력하시오.
		 예시)
		 총 평균 포인트는 : 0 원 입니다. 
		 
		*/
	
		Integer sum = 0;
		int w = 0;
		while(w < al.get(1).length) {
			
			sum += (int)al.get(1)[w];
			
			w++;
		}
		System.out.printf("총 평균 포인트는: "+sum / al.get(1).length+" point입니다");
		
	}
}
