package java1;

public class Class3 {
	//외부 class 생성시 static 유/무 활용 및 return 메소드
	public static void main(String[] args) {
		
		Box b = new Box();
		b.abc();
		
		Class3 c = new Class3(); //같은 클레스라도 해당 객체 생성후 메소드 로드함
		c.bbb();
		
		//리턴 메소드로 값 받기
		String result = c.zzz();
		System.out.println(result);
		
		//리턴 메소드 숫자형태로 받기
		int result2 = c.kkk();
		System.out.println(result2);
		
		//event라는 메소드가 static 메모리에 이미 할당 되어 있으므로 
		//Coupon class를 로드후 바로 해당 메소드를 호출 할 수있음
		Coupon.event(); //객체 생성 없이 바로 호출 가능 (Static)
		
			
	}
	public void bbb() {
		int a = 10000;
		double b = a/0.5;
		System.out.println(b);
	}
	//리턴 메소드 (문자형태)
	public String zzz() {  // void가 없으면 무조건 마지막에 return을 함께 써줘야함
		String a = "거북선";
		return a;
	}
	//리턴 메소드 (숫자형태)
	public int kkk() {
		int a = 100;
		return a;
		
	}
}
//static 메소드가 있는 경우 (메모리 할당)
class Coupon{
	
	public static void event() {
		int cp = 30;
		System.out.println(cp);
		
	}
	public void event2() { // 이런경우 객체 생성을 해줘야함
		System.out.println("test");
	}
	
}
class Box{
	
	public void abc() { //static void : 메모리에 할당 되는 메소드임
		//단, static을 사용하지 않을 경우 package안에서는 공유가 가능함
		System.out.println("test");
		
	}
}