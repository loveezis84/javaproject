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
		ArrayList<Object> li = new ArrayList<>(Arrays.asList(data));
		System.out.println(li);
		li.add(data2[0]);
		li.add(data2[1]);
		System.out.println(li);

	}
}
