package project;

import java.util.Arrays;
import java.util.LinkedList;

public class Example4 {
	//ArrayList, List, LinkedList에서 사용하는 옵션
	public static void main(String[] args) {
		String data[] = {"hong","kim","park"};
		LinkedList<String> nums = new LinkedList<>(Arrays.asList(data));
		System.out.println(nums); 
		nums.clear(); //배열값을 초기화 시켜버림
		System.out.println(nums);
		nums.add("a");
		nums.add("b");
		nums.add("c");
		System.out.println(nums);
		nums.set(2, "zzzzzz");  //2번째 노드의 값 "c"를 "zzzzz"로 변경
		System.out.println(nums);
		
		/*
		 contains는 데이터를 빠르게 찾을 때 사용합니다.
		 찾고자 하는 값을 적용 하였을 경우 true (데이터 확인)
		 false (데이터 값이 없음)
		 */
		boolean found = nums.contains("a");
		System.out.println(found);
		
	
	}
}
