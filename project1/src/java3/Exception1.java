package java3;

//예외처리 : I/O (Input & Output) 사용시 무조건 필수로 적용하게 됩니다.
public class Exception1 {

	public static void main(String[] args) {
		
		int a;
		String b = "a1";
		try { //(1) : 해당 변수 값을 숫자로 자료형을 변환
			a = Integer.valueOf(b); //문자 A로 인하여 오류발생 
			
			//try에서 문제 발생시 해당 문법은 작동하지 않음
			int sum = 10 + 20;
			System.out.println(sum);
			
		} catch (Exception e) { //(2) : 오류발생시 실행 되는 문법
			System.out.println("숫자로 변환 되지 않습니다");
			//(3) 어떤 부분에서 오류가 발생하는지 체크(print로 오류가 출력됨)
		}
		finally { //(4) try에서 문제가 발생한 사항을 수정 후 재 실행
			b = b.replaceAll("[a-zA-Z]", "");  //해당 문자를 제거하고 뒤에남아있는 숫자만 남겨놈
			a = Integer.valueOf(b); //숫자로 변환(5)
		}
		System.out.println(a); //(6)최종 결과값 출력	
	}
}
