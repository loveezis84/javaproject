package java3;

public class Exception2 {

	public static void main(String[] args) {
		try {
			Exception2 ex = new Exception2();
			String data = "3000a"; //문자열 데이터 입력(1)
			ex.test(data); //(2) 외부 메소드로 값을 전달
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("문제발생");
		}
	}
	//throws는 main메소드에서 예외처리 없이 해당 메소드를 호출 할 경우를
	//막기위해서 사용합니다.
	public void test(String b) throws Exception { //(4)
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c = new Exception();
		throw c; 
		/*
		 코드에 가장 맨 밑에 사용하고 throw = return과 비슷한 성격을 가지고있습니다.
		 예외처리 결과에 대한 값을 main메소드로 다시 return시킴 
		*/
	}

}
