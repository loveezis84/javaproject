package java3;

//추상 클레스 ( 가상클레스 )
public class Abstract1 {

	public static void main(String[] args) {
		
		box2 bx = new box2();
		bx.sbox();
	}
}
class box2 extends box{
	
	@Override
	public void sbox() {
		System.out.println("집에간다~");
	}
	String result() {
		
		return null;
	}
}
//abstract : 추상 메소드가 존재하며, 해당 추상 메소드를 사용하지 않을 경우
//(오버라이드) 안할경우 에러가 발생함
abstract class box{ //코드 작성할때 무분별한 메소드를 작성하는걸 방지하기 위한 제약을 건다.
	abstract public void sbox(); //추상 메소드
	abstract String result(); //추상 리턴 메소드
	
}