package java1;

//Class만 단독으로 사용가능
public class Class1 {//Class 없이 method를 사용할 수 없습니다.
	//필드공간(전역변수, 전역객체)
	//static : 메모리를 직접적으로 핸들링하는 속성
	static int money = 10000; //클레스 변수 
	
	public static void main(String[] args) { //main 실행 메소드라 합니다.
		String name = "유관순"; // 지역변수
		
		Adata ad = new Adata();  //해당 클레스를 객체로 변화시켜 A객체호출 
		Bdata bd = new Bdata();	 //B객체호출
		System.out.println(ad.a); //객체에 있는 변수 값 a를 로드
		System.out.println(bd.a);
		Cdata cd = new Cdata();
		cd.aa = 10; //Cdata 클레스 안에 aa변수 호출 후 값을 이관
		cd.bb = 30;
		cd.cc = cd.aa+cd.bb;
		System.out.println(cd.cc);
	}

}
class Adata{ //클레스 안에 전역변수로 배치되어있는상태
	String a = "홍길동";
}
class Bdata{
	String a = "이순신";
}
class Cdata{
	//인스턴스 변수 생성(전역변수)
	int aa; //숫자할당
	int bb; //숫자할당
	int cc; //결과값
}