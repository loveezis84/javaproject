package java3;

public interface inter1 {
	String names = "홍길동";
	//지역변수를 implements를 사용해서 전역처럼 활용함
	
	public void z1();
	
	//일반 메소드를 선언하는 방식 (써도 되고 안써도됨)
	default void z1_1(int a,int b) {
		int c = a + b;
		System.out.println(c);
	}
}
