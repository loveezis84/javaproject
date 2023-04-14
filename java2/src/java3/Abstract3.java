package java3;

public class Abstract3 {
   // 상속 2개 이상 가져오기
   public static void main(String[] args) {
      
   }

}

//super가 붙으면 일반 메소드의 상속값을 받아옴
class ab3 extends aa2{
   //aa추상 클레스에 aa2 상속을 받고 그리고 외부 클레스에서 로드
	//할 경우 aa에 사용한 메소드도 호출해야함
	
   @Override
   public int password() {
      return 0;
   }
   @Override
   public String user_info() {
	   
	   return null;
   }
   
}