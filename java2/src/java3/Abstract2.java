package java3;

// Ab1과 연계
public class Abstract2 extends aa {

   public static void main(String[] args) {
      Boxx box = new Boxx();
      box.idck("hong");
      box.result();
   }
   @Override
   public int password() {
      return 0;
   }
}
// abstract : 자식 클래스에게 특정 메소드의 오버라이드를 강제하고 싶을 때 사용한다. 
// 하위 클래스는 상위 클래스 내부에 있는 추상 메소드의 이름, 파라미터, 리턴 형태 등 모든 형식을 동일하게 오버라이드 해야 한다.
// 추상 클래스 내부의 일반 메소드는 오버라이드가 강제 되지 않는다.

// An abstract class is a class that cannot be instantiated, meaning you cannot create an object of an abstract class.
// 추상 클래스는 인스턴스화 할 수 없다, 즉 추상 클래스의 객체를 생성할 수 없다.
// 추상 클래스도 일반 클래스와 마찬가지로 필드를 상속한다.
class Boxx extends Ab1{
   @Override
   public void idck(String id) {
      System.out.println(id);
   }
   @Override
   public String loginck() {
      return null;
   }
   @Override
   public void result() {
      System.out.println(this.aa1);
      
   }
}