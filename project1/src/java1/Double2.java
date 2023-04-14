package java1;

public class Double2 {

	public static void main(String[] args) {

		/*
		 응용문제6.
		 구구단 9단중 9*64까지 숫자 중
		 홀수값에 대한 평균값 결과를 출력 하시오. 
		 */
		

		int b = 1;
		int sum=0;
		int sum2=0;
		int count=0;
		while(b<=64) {
			
			sum = 9 * b;
			if(sum % 2 == 1) {
				sum2 += sum;
				count++;
			}
			b++;
		}
		int total = sum2/count;
		System.out.println("구구단 9단 중 9 * 64 까지의 홀수값을 더한 평균값은: " + total);
	}
}
