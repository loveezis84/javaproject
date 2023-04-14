package java1;

public class Array5 {

	public static void main(String[] args) {
		
		/*
		 응용문제3
		 배열 데이터를 모두 합한 결과값을 출력하시오.
		 15 60 11 14 27  => 127;
		 */
		
		int aa[] = {15,60,11,14,27};

		int ea = aa.length; 
		int a = 0;
		int sum = 0;
		while(a < ea) {
			
			sum += aa[a];
			a++;
		}
		System.out.printf("배열안의 수를 합한 결과는 : %d \n",sum);
		
		//for in과 동일한 형태의 배열 전용 반복문
//		for(int f : aa) {
//			sum += f;			
//		}
//		System.out.println(sum);
		
		String id[] = {"hong","kim","park","lee","jang","jung"};
 		/*
		  응용문제4
		  아이디 데이터 중 4글자 이상인 아이디만 출력하시오
		*/
		for(String z : id) {
			
		int length = z.length(); //배열안에 z의 길이체크 변수
		
			if(length >3) {
				System.out.println(z);
				
			}	
		}
	}
}
