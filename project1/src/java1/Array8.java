package java1;

import java.util.Arrays;

public class Array8 {
	//배열 합치기
	public static void main(String[] args) {
		/*
		 응용문제7
		 데이터 배열 2개가 있습니다. 해당 데이터 배열을
		 다음 결과처럼 값을 출력시키시오.
		 1번 data : 대한민국 일본 중국 베트남 태국
		 2번 data : 40 35 70 55 32;
		 결과출력 data
		 ["대한민국(40)",일본(35)","중국(70)","베트남(55)","태국(32)"]
		*/
		
		String[] data1 = {"대한민국","일본","중국","베트남","태국"};
		int[] data2 = {40,35,70,55,32};
		int ea = data1.length;
		String[] total = new String[ea];
		System.out.println(ea);
		
		int a = 0;
		while(a<ea) {
			total[a] = data1[a] +"("+ Integer.toString(data2[a]) +")";
//			total[a] = data1[a] +"("+ String.valueOf(data2[a]) +")";
//			total[a] = data1[a] +"("+ data2[a] +")";	
			a++;
		}
		System.out.println(Arrays.toString(total));
	}
}
