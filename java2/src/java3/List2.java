package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List2 {

	public static void main(String[] args) {
		String user[] = { "hong", "kim", "park", "jang" };

		ArrayList<String> al = new ArrayList<>(Arrays.asList(user));
		int ea = al.size();
		/*
		 * 4개로 하면 반복문이 remove했을때 삭제되기때문에 조건이 성립되지않음 ea로 반복문을 돌릴경우 반복문 안에 해당 ea값을 반복문 안에
		 * 넣어서 사용하면 반복문이 돌때마다 체크하게됨
		 */
		int w = 0;
		while (w < al.size()) { // 노드값은 변경되는 상태를 유지하게 해줌
			if (al.get(w).equals("kim")) {
				al.remove(w); // 노드가 삭제되서 3번만돌아감
			}
			w++;
		}
//		System.out.println(al);  // 출력 값 : [hong, park, jang]

		/*
		 * 응용문제5 [정보처리기사] 해당 배열을 확인 후 짝수의 숫자를 모두 삭제하여 최종 결과 배열을 출력하시오 
		 * 10 7 6 1 11 37 41
		 * 7 1 11 37 41
		 */
		int[] userNumber = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> userNumber2 = new ArrayList<>();
		int z = 0;
		while(z < userNumber.length) {
			
			if(userNumber[z] % 2 == 1) {
				userNumber2.add(userNumber[z]);
			}
			z++;
		}
		Collections.sort(userNumber2); // 오름차순
//		Collections.sort(userNumber2,Collections.reverseOrder()); // 내림차순
		System.out.println(userNumber2); // 출력값 [7, 1, 11, 37, 41]

	}	
}
