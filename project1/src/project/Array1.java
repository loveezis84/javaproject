package project;

import java.util.ArrayList;
import java.util.Arrays;

public class Array1 {

	//ArrayList 배열 문자,숫자 혼합 사용하기
	public static void main(String[] args) {
		String data[] = {"hong","park"}; //문자배열
		int data2[] = {10,20}; //숫자배열
		//현재 배열 자료형이 2가지 입니다.
		//해당 방식은 Object를 사용합니다
		
		/*
		Object란? 문자,숫자 자료형과 관련없이
		모든 자료형을 다 받아주는 자료형 구조 입니다. 
		*/
		ArrayList<Object> li = new ArrayList<>(Arrays.asList(data));
		System.out.println(li);
		li.add(data2[0]);
		li.add(data2[1]);
		System.out.println(li);
		/*
		 <계산방식>
		 1번째 방식
		 int sum = (int)li.get(2) + (int)li.get(3);
		 
		 2번째 방식
		 Object sum = (int)li.get(2) + (int)li.get(3);
		*/
//		3번째 방식 
		Integer sum = (Integer)li.get(2) + (Integer)li.get(3);
		System.out.println(sum);
		
		//추가로 Arraylist 안에 데이터가 어떤 자료형인지
		//알아내는 방법(Object) 일 경우
		
		//Object는 한가지 자료형만 받는 형태가 아니다 보니,
		//..getClass().getName() 을 이용하여 해당 데이터가 문자인지
		//숫자인지를 파악해야 합니다.
		System.out.println(li.get(0).getClass().getName());
	}
}
