package java2;
/*
 [Method17번과 연계작업]
 1.main class에서는 main class 상속못함
 2.다른파일에 있는 외부 class를 실행하고자 하는 파일에서 상속 할 수 있음
 3.main class에서 외부 class를 상속 시킬 수 있음 
 */
public class Method18 extends data{
	//main은 오버라이드를 사용할 수 없습니다.
	public static void main(String[] args) {
		md m = new md(); //아래 클레스에 대한 인스턴스(md)
		m.display();
		Method18 mh = new Method18(); //해당 클레스에 대한 인스턴스 (data)
		mh.name();
	}
	@Override
	public void name() {
		int aa = 10; //오버로딩
		System.out.println(this.abc);
		super.name();
		System.out.println("추가 코드 작성");
	}
}
class md extends pt{ //Method17번에 있는 메소드 오버라이드해서 실행
	
	@Override
	public void display() {
		super.display();
	}
}
class data{
	
	String abc ="홍길동";
	public void name() {
		System.out.println("외부 클레스 data 로드");
	}
}
