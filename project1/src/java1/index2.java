package java1;

public class index2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user = "홍길동";
		byte level = 5;
		int point = 15000;
		
		//println = ln(line을 의미함); (br)의 형태
		//printf = f(일반출력) - 한줄에 모두 출력 (\n : 한줄내림)
		
		//System.out.println(user+"님 레벨은:"+level+"이고,"+point+"포인트가 있습니다");
		
		System.out.printf("%s\n",user);
		System.out.printf("레벨 %d\n",level);
		System.out.printf("포인트 %d\n",point);
		
		boolean ck = true;
		System.out.printf("동의함: %b",ck);
	}

}
