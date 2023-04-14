package java3;

import java.util.ArrayList;
import java.util.Arrays;

public class OOP3 {
	/*
	(주)씨이랩
	응용문제2
	본데이터 15,22,37,8,11,19,41 이 있습니다.
	해당 본 데이터를 다음 결과같이 커스텀 하여 출력하시오.
	*/
	static ArrayList<Integer> changeNumber;
	public static void main(String[] args) {
		Integer[] number = {15,22,37,8,11,19,41};
		
		changeNumber = new ArrayList<>(Arrays.asList(number));
//		System.out.println(changeNumber);
		
		changeNumber.add(0,7);
		changeNumber.remove(3);

		changeNumber.remove(5);
		changeNumber.add(5,39);	
		System.out.println(changeNumber);
	}
}
