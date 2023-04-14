package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class List3 {

	public static void main(String[] args) {
		
		/*
		 응용문제3.
		 넘버데이터 3 6 9 12 15
		 넘버데이터 2 4 
		 결과 2 3 4 6 9 12 15
		*/
		Integer[] data1 = {3,6,9,12,15};
		Integer[] data2 = {2,4};
		ArrayList<Integer> numberdata = new ArrayList<>(Arrays.asList(data1));
		ArrayList<Integer> numberdata2 = new ArrayList<>(Arrays.asList(data2));
		numberdata.addAll(numberdata2);
		
//		Collections.sort(numberdata,Collections.reverseOrder());
		Collections.sort(numberdata);
		System.out.println(numberdata);
		
		//무한루프
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("숫자를 입력하세요");
			int no = sc.nextInt();
			
			if(no == 10) {
				break;
			}
		}
		sc.close();
	}
}
