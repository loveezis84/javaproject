package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//반복문 (for, while, do~while)
//배열 관련 (for(변수지정:배열명)){}
public class Example5 {
	Integer data[] = {10,8,5,3,1}; //1차 숫자 배열
	String data2[] = {"f","b","d","q","z"};
	
	public static void main(String[] args) {
		Example5 ex = new Example5();
		ex.array();
	}
	public void array() {
		
		Arrays.sort(this.data2,Collections.reverseOrder()); //오름차순
		System.out.println(Arrays.toString(this.data2)); //오름차순
		//오름차순 정렬 (int,String,Integer 다 넣을수 있음)
		
		ArrayList<String> yun = new ArrayList<>(); //동적배열생성하는법
		
		System.out.println(Arrays.toString(this.data));
		/*
		 응용문제2
		 해당 배열에 모든 값을 합한 결과를 출력하시오. 
		*/
		int ea = this.data.length;
		int w = 0;
		int sum = 0;
		while(w < ea) {
			
			sum += this.data[w];
			w++;
		}
		System.out.println(sum);
	}
}
