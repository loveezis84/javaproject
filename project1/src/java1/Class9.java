package java1;

import java.util.Scanner;

public class Class9 {

	public static void main(String[] args) {

		/*
		 * 1."벙번호를 입력하세요" -1.무지개룸 2.패밀리룸 3.달빛아래룸 단,1~3번까지 외에 숫자를 입력시 "올바른 값이 아닙니다"라고
		 * 출력합니다. 2. 1번을 선택시 가격은 60000원 2번을 선택시 가격은 125000원 3번을 선택시 가격은 100000원
		 * "해당 가격을 출력후 30% 할인 쿠폰을 적용하시겠습니까?(y/n)" 3. 쿠폰 적용시 30% 할인된 최종 가격을 출력 미적용시 원래
		 * 금액을 출력하시오.
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("방번호를 입력하세요");
		System.out.println("1.무지개룸 2.패밀리룸 3.달빛아래룸");

		int room = scanner.nextInt();
		int price = 0;
		if(room > 3) {
			System.exit(room);
		}
		switch (room) {
		case 1:
			price = 60000;
			break;
		case 2:
			price = 125000;
			break;
		case 3:
			price = 100000;
			break;
		default:
			System.out.println("올바른 값이 아닙니다.");
			return;
		}
		System.out.println("선택하신 방의 가격은 " + price + "원입니다.");
		System.out.print("30% 할인 쿠폰을 적용하시겠습니까? (y/n)\n");
		
		String check = scanner.next();
		
		if(check.equals("y")) {
		
			int totalprice = (int)(price * 0.7);
			System.out.println("선택하신 방은 30% 할인된 " +totalprice+ "원에 예약가능합니다");
		}
		else {
			System.out.println(price);
		}
		scanner.close();
	}
}
