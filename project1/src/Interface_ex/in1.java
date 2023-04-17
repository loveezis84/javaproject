package Interface_ex;

import java.util.Scanner;

public class in1 {

	public static void main(String[] args) {
		
		udgame1 ud = new udgame1();
		ud.user();
		
	}
}
class udgame1 implements udgame{
	Scanner sc;
	int count = 0;
	@Override
	public void user() {
		while(true) {
			sc = new Scanner(System.in);
			try {
				
			System.out.println("숫자를 입력해주세요");
			int user = sc.nextInt();
			
			if(user > 10) {
				System.out.println("10이하의 숫자만 입력해주세요");
			}
			else {
				String z = result(user,ranNumber);
				if(count == 4) {
					System.out.printf("정답을 맞추지 못했습니다.\n정답은: %d",ranNumber);
					sc.close();
					break;
				}
				if(z.equals("")) {
					System.out.println("정답입니다");
					break;
				}
				else {
					count++;
					System.out.println(z);
				}
			}
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요 다시 입력해주세요");
			}
		}
	}
	
	@Override
	public String result(int user, int ranNumber) {
		String msg = "";
		
		if(user < ranNumber) {
			msg = "up";
		}
		else if(user > ranNumber) {
			msg = "down";
		}
		return msg;
	}
	
}












