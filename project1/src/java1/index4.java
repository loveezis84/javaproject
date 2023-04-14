package java1;

public class index4 {

	public static void main(String[] args) {
		//반복문 사용
		int f;
		for(f=1; f<=10; f++) {
		//System.out.println(f);
		}
		
		//더블for문
		int a,b;
		for(a=2; a<10; a++) {
			
			for(b=1;b<10;b++) {
				//System.out.printf("%d*%d=%d\n",a,b,(a*b));
				
			}
		}
		
		/*
		 응용문제2.
		 숫자 45 ~ 60까지 총 합산한 결과값을 출력하시오. 
		 */
		
		int aa;
		int bb = 0;
		for(aa=45; aa<=60; aa++) {
			
			bb += aa;
		}
		System.out.println(bb);
		
		/*
		응용문제.3
		1~200까지 숫자중 홀수값만 모두 더한 결과값을 출력하시오  
		*/
		short a1;
		short sum=0;
		
		for(a1=1; a1<=200; a1++) {
			
			
			if(a1 % 2 == 1) {
				sum += a1;
			}
		}
		System.out.println(sum);
		
		
		/*
		 응용문제4
		 20~60까지 숫자 중 3의 배수 값만 모두 더한 후 짝수 인지
		 홀수 인지를 출력하시오
		*/
		
		int zz;
		
		for(zz=20; zz<=60; zz++) {
			
			if(zz % 3 == 0) {
				bb += zz;
								
		      }	
		}	
		if(bb % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		
		/*
		 구구단 7단부터 3단까지 역순으로 출력되도록합니다.
		 단,그중 결과값이 홀수인 값만 출력하시오
		 */
		
		int aaa;
		int bbb;
		int ccc=0;
		for(aaa=7; aaa>=3; aaa--) {
				
			for(bbb=9; bbb>=1; bbb--) {
				
				ccc = aaa * bbb;
				 
				if(ccc % 2 == 1) {
					
					System.out.println(aaa+"*"+bbb+"="+ccc);
					
				}
			}
		}
	}
}
