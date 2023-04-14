package java3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try1 {
	//예외처리 방식
	static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		int box;
		try { //오류 발생시 체크
			System.out.println("숫자를 입력하세요");
			box = sc.nextInt();
			System.out.println("사용자는 " +box+ "를 입력하셨습니다.");
		}
		catch (InputMismatchException e) { //아래쪽에서 에러메시지를 확인한후에 예외처리를 추가해줬다.
			System.out.println("문자가 입력 되었습니다.");
		}
		catch (Exception e) { //오류가 발생된 상황
			System.out.println(e); 
			//한글을 썼을때 발생하는 오류를 프린트로 확인한후 그 오류 메시지를 복사해서
			//다시 catch로 추가해준다.
			System.out.println("숫자만 입력하세요");
		}

	}
}
