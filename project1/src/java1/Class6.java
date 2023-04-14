package java1;

public class Class6 {
	//상수 선언하는 방법 + 외부 클레스 기본 메소드 이동
	public static void main(String[] args) {
		
		int a = 5;
		a = 10;
		final int b = 10; 
		//const와 같은 의미로 상수를선언하는 방법
		//b = 5; final을 위에서 선언했기때문에 값을 변경할수없다. 
		System.out.println(b);
		
		String id = "hong";
		User u = new User(id); //객체 생성 및 인자값으로 전달 
	}
}

class User{
	int p;
	String person; //필드에 있는 인스턴스 변수
	public User(String id) { //기본 메소드 즉시실행 메소드
		//즉시 실행 메소드는 무조건 class명과 동일하게 사용해야함
		person = "홍길동";
		list(); //메소드 바로 호출이 가능함
		System.out.println(id);
	}
	public void list() { //즉시실행 메소드에서 실행되는 메소드
		System.out.println(person);
		System.out.println("사용자 리스트 출력");
		p = point();  //return 메소드로 값을 이관받아서 처리함
		System.out.println(p);
		
	}
	public int point() {
		return 5000;
	}
}	