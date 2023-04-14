package java3;

public class Interface1 {
	//interface 사용법(inter1.java, inter2.java)
	//interface의 특징 : class가 없음
	public static void main(String[] args) {
		
		key k = new key();
		k.z1();
		k.z2();
		k.z1_1(20, 30);
	}
}
/*
	interface 상속을 받기 위해서는 implements를 사용해야함
	(extends 를 잘 사용하지 않음)
	interface는 부품이라고 생각하면 되고, 해당 부품을 조립하여
	프로그램을 완성할 수 있다. (로드가 용이함)
	또한, 여러개의 interface를 한번에 로드 할 수 있음
	
	클레스가 다른곳에서 동일한 변수를 사용할시 this로 변수명을 지정하게되면
	어떤것을 선택할지 모르기때문에 오류가 발생함
	그래서 해당 클레스를 지정해주고 그 값을 지정해야한다
	예)inter1.names  / inter2.names 
	틀린예)this.names (x) / this.names (x) 
*/
class key implements inter1,inter2{
	
	@Override
	public void z1_1(int a, int b) {
		inter1.super.z1_1(a, b);
	}
	
	@Override
	public void z1() {
		System.out.println(inter1.names);
//		System.out.println(this.names);
		
	}
	@Override
	public void z2() {
		System.out.println(inter2.names);
//		System.out.println(this.names);
		
	}
	@Override
	public String z3() {
	
		return null;
	}
	
}