package java3;

import java.util.ArrayList;
import java.util.List;

public class List5 {
	
	//List 배열 사용법
	//List (Array 업그레이드) 순서가 있는 데이터 집합 배열과는 다르게
	//빈 배열에 초기용량을 지정해서 내부배열의 크기를 지정해준다.
	//메모리 공간의 크기를 동적으로 변경가능합니다.
	//메모리 재사용이 편리하다
	public static void main(String[] args) {
		
		String data[] = {"hong","kim","park"};
 		List<String> aa = new ArrayList<>();

 		System.out.println(aa);
 		List<Integer> bb = new ArrayList<>(10);
 		
 		/*
 		1 = 1M / 10 = 10M
 		메모리 초기 용량 크기
 		ArrayList는 내부 배열의 크기를 미리 지정할 수 있는데, 
 		이때 사용하는 값이 초기 용량입니다. 초기 용량을 지정하면 
 		ArrayList는 해당 용량만큼의 요소를 저장할 수 있는 배열을 미리 생성하고,
 		요소를 추가할 때마다 내부 배열의 크기를 동적으로 조정하지 않고,  	
 		초기에 생성한 배열의 크기를 기준으로 요소를 저장합니다.
   		초기 용량을 적절하게 지정하면 배열의 크기를 동적으로 조정하는 비용을 줄일 수 있으며
 		ArrayList의 성능을 향상시킬 수 있습니다. 
 		하지만 초기 용량을 너무 크게 지정하면 메모리를 낭비하게 되므로 적절한 값을 선택해야 합니다.
 		*/
 		bb.add(10);
 		System.out.println(bb);
 		
	}
}
