package java3;

public class OOP2 {
	//변수 선언 (전역변수 , 지역변수)
	public static void main(String[] args) {	
		vars v = new vars();
		v.abc();

	}
}
class vars{
	
	public void abc() {
		int a = 10;
		if(a == 10) {
			int b = 30;  //if문 안에 생성된 값을 다른대선 쓸수가없다. 대신 필드로 올라가면 사용가능
		}
		int w = 0;
//		while(w < b) { // 에러 발생 (int b = 30이라는 값은 존재하지않음)
//			
//			
//			w++;
//		}	
	}
}
