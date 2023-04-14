package java1;

class Member{ //외부 클레스
	String user = "홍길동"; //인스턴스 변수값 
	public void abc() { //void : return이 없는 메소드
		String user2 = "이순신";
		System.out.println(user2);
	}
}
/*
  [접근 제어자]
  public : 접근에 대한 제한이 없는 자유로운 사용이 가능  보안등급에 따라아래로 내려감
  private : 자신의 클레스 내에서만 접근이 가능
  protected : 같은 패키지 안에서 파생되는 클레스만 접근이 가능
  외부 클레스 : default (동일한 패키지만 접근이 가능)
*/

public class Class2 {
	//외부 Class 및 외부 메소드 활용
	public static void main(String[] args) {
		Member m = new Member(); //객체생성
		m.abc(); // Member Class안에 메소드를 호출
		Inject i = new Inject(); //객체 생성
		i.user("hong", "a123456"); //인자 값으로 해당 메소드를 전송
		
		
		Number u = new Number();
		u.zzz(20,20);
		
	
		
		/*
		 응용문제1 
		 외부 class를 이용하여 2개의 숫자 값을
		 외부 class 안에 있는 메소드를 이용하여 곱합니다.
		 해당 곱한 값이 짝수 인지 홀수 인지 검토하는 코드를 작성하시오
		 
		 Number 클레스 생성 -> zzz 메소드에 인자값 2개를 정수형태로전달받고 그 이후 계산식을 적용
		*/
		

	}
}
class Inject {
	//user 메소드에 두개의 인자값 및 자료형을 받는 형태
	public void user(String name,String pw) { //인자값은 자료형을 지정해줘야함
		System.out.println("사용자명"+name+"패스워드"+pw);
		
	}
}
class Number{
	public void zzz(int z1,int z2) {
		int sum = z1* z2;
		if(sum % 2 ==0){
			System.out.println("짝수 입니다.");
		}
		else {
			System.out.println("홀수 입니다.");
		}
	}

}
