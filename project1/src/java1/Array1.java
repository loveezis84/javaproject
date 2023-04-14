package java1;

public class Array1 {

	public static void main(String[] args) {
		//[] : 배열을 변수에 선언할 때 사용하는 형태
		String user[] = {"홍길동","이순신","강감찬"};
		int ea = user.length;
		System.out.println(ea); // 3개
		System.out.println(user[1]); //이순신
		
		
		//숫자 형태의 배열형태
		int number[] = {1,2,3,4,5};
		System.out.println(number[3]); // 4
		
		// int 타입의 기본 배열 선언 및 초기화
		int[] myIntArray = {1, 2, 3, 4, 5};

		// double 타입의 기본 배열 선언 및 초기화
		double[] myDoubleArray = new double[]{1.0, 2.0, 3.0, 4.0, 5.0};

		// String 타입의 기본 배열 선언 및 초기화
		String[] myStringArray = new String[3];
		myStringArray[0] = "Hello";
		myStringArray[1] = "world";
		myStringArray[2] = "!";
		
	}
}
