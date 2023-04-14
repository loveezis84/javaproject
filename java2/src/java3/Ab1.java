package java3;
//abstract4

abstract class sum_total{
	public int sum;
	public abstract void datalist();
	public abstract void result();
}

// ------------------------- abstract4 응용문제용 //


public abstract class Ab1 { // 메인 클래스에도 abstract를 적용할 수 있다.
   public int aa1 = 30;
   public abstract String loginck();
   public abstract void idck(String id);
   public abstract void result();
   // Abstract methods do not specify a body.
   public void ab_1() {
      // 추상 클래스에 일반 메소드를 만들 수 있다. 이 메소드는 상속이 강제되지 않는다.
   }
}
abstract class aa {
  public abstract int password(); // 가상 메소드 생성
}
abstract class aa2 extends aa{
   public abstract String user_info();
}



class aa3{
	public String aa3_method() {
		
		return null;
	}
}