package java1;

public class Array2 {

	//메소드 배열값을 전달하는 방식
	public static void main(String[] args) {
		String user[] = {"hong","kim","park"};
		Array2 ar = new Array2();
		ar.abc(user); //abc 메소드 배열값을 전달
	}
	
	public void abc(String a[]) { //배열 형태의 인자값으로 받음
		int ea = a.length;
		System.out.println(a[0]); // hong출력
		System.out.println(ea);   //3출력
		
	}	
}