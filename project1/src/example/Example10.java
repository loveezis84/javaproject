                           package example;

import java2.mssql;

public class Example10 {

	public static void main(String[] args) {
		
		mssql ms = new mssql();
		ms.abc();  //외부 메소드 로드 
//		ms.main(args); // 외부 메소드 메인 로드
		//외부 java 파일 가져올시 main은 로드하지 않음
		
		System.out.println(ms.bbb()); //외부파일 리턴으로 출력
		//변수로 받아서 처리해도됨
	}
}
