package java2;

// class 안에 클레스
public class Method16 {

	public static void main(String[] args) {
			
		green gr = new green(); //부모 클레스 인스턴스 생성
		gr.setter(20,30);
		green.blue gb = gr.new blue(); //부모 클레스 안에 자식클레스 인스턴스 생성
		gb.print(); //자식 클레스 안에 메소드 실행

	}

}
class green{
	int aa,bb;
	String name = "홍길동";
	String userage; //자식 클레스에 있는 값을 setter로 사용하는 변수
	public void setter(int a,int b) {
		this.aa = a;
		this.bb = b;
		blue bb = new blue();
		System.out.println(bb.age); //자식 클레스에 있는 값을 가져올 때
	}
//	public void pt() {
//		System.out.println(this.userage);
//	}
	class blue{ //자식클레스
		int a1 = green.this.aa; //해당 필드에 class 변수 선언(this사용 필수)
		int b1 = green.this.bb;
		String age = "30";
		public void print() {
//			green.this.userage = age;
			System.out.println(green.this.name);
			System.out.println(a1);
			System.out.println(a1*b1);
//			green.this.pt(); //부모 메소드 호출
		}
	}
}