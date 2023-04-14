package example; //그룹에 해당


class korea { // 외부 class 선언
	//외부 Field 공간	
	
	public void abc() { //외부 메소드
		
	}
}

public class Example1 { //class는 무조건 생성
	//Field공간 전역변수field (필드 공간에선 자유롭게 private,public,protected,default 같은것들을 자유롭게 사용한다)
	private int a = 1;
	public int b = 2;
	public String c = "이순신";
	String aa = "3";
	protected int d = 3;
	
	public Example1() { //즉시실행 (construct) 
		
	}
	public static void main(String[] args) {
	//단 main 메소드는 1개로 구성
			
	}
	public String abc() { //문자형 리턴 메소드
		
		return null;
	}
	public void bbb() { //일반 확장 메소드
		String a = "홍길동"; // 지역변수
		
	}
	public static void ccc() { //메모리에 저장시키는 일반 확장 메소드
		
		
	}

}
