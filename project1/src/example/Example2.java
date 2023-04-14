package example;
//class : 크게 보면 틀이라고 보면된다. (1)
//객체 : 제품정도로 해석  (2)
//메소드 : 제품에 해당하는 재료 (2-1)
//인스턴스 : 제품들에 해당하는 박스 (3)  
//위와같은 순서도로 진행된다고 보면된다.(마지막에 박스로 포장하는행위가 인스턴스)


public class Example2 {
	final int data1 = 20; //변하지 않는 값 (상수 선언)
	String abc ="홍길동";
	
	public static void main(String[] args) {    //메인 필드가 가장 마지막에 실행됨
		final int data2 = 50; //메소드 안에 상수 선언
		//field에 있는 값을 main안에서는 직접 핸들링이 안됨
		Example2 ex = new Example2();
		//class안에 있는 전역 변수의 값을 사용하기 위해 인스턴스로 등록 및 class객체를 생성
		System.out.println(ex.data1);
		ex.abc="이순신"; // "홍길동"이라는 값을 "이순신"으로 교체
		ex.aaa();
	}
	public void aaa() { //단,확장 메소드 에서는 field값 핸들링이 가능함
		//void는 확장함수 같은 개념으로 혼자 발동을 못하기때문에 main이나 직접적으로 핸들링 해줘야 실행이 가능
		this.abc = "강감찬";
		System.out.println(this.abc);
		System.out.println(data1);
	}

}
