package java2;
//Method18번과 연계작업

public class Method17{

	public static void main(String[] args) {		
		pt p = new pt();
		p.display();
	}
}
class pt{ //Method18 사용이 가능할까?? (오버라이드 사용가능)
	public void display() {
		
		System.out.println("메인 데이터 호출");
	}
	
}

