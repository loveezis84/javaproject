package java2;

public class Method15 {
	//오버라이드 규칙
	public static void main(String[] args) {
		
		
	}

}
class color1{
	public String abc() {
		return null;
	}
	public boolean zzz(String nm) {
		return true;
	}
}
class color2 extends color1{
	@Override
	public String abc() {
		return super.abc();
	}
	@Override //override는 메소드명 ,인자값은 동일하게 맞춰야 에러가 나질 않는다.
	//단, 인자 명은 다르게 사용해도 문제가 없다.
	public boolean zzz(String nm) { 
		return super.zzz(nm);
	}
	public void zzz() {
		
	}
	
}
