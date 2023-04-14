package java1;

public class Class4 {

	// 응용문제4
	/*
	 * static이 없는 클레스이며, 해당 class에 두개의 숫자를 인자값으로 보냅니다. 해당 두개의 숫자 범위안에 모든 값을 더하여 결과값을
	 * 받아서 출력하는 코드를 작성하시오
	 */
	public static void main(String[] args) {

		Number1 c = new Number1(); // 외부 클레스 객체 생성
		int total = c.abc(50, 100); // 인자 값을 total에 넣어줌
		if (total == 0) { // 범위 지정이 잘못된 경우 0으로 환원된 값으로 조건문 작성함
			System.out.println("두 숫자 중 첫번째 숫자는 낮음 값으로 설정");
		} else {

			System.out.println(total);
		}
	}

}

class Number1 { // class는 동일한 이름 사용 불가

	public int abc(int a1, int a2) {
		// 자료형 지정해주고
		int sum = 0; // 누적된 값 넣을 변수 지정
		int a; // 반복문 돌리기위한 변수
		if (a1 > a2) { // 범위지정이 잘못됐을경우 sum=0으로 환원함
			sum = 0;
		} else {
			for (a = a1; a <= a2; a++) { // 반복문으로 해당 범위 만큼 모두 합산

				sum += a;
			}
		}
		return sum; // 최종결과값 return
	}
}