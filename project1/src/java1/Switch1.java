package java1;

public class Switch1 {

	public static void main(String[] args) {
		int a = 10;
		switch(a) {
		case 1:
		case 10: //멀티 case 사용
			System.out.println("옵션1을 선택");
			break;
		case 2:
			System.out.println("옵션2을 선택");
			break;
		case 3:
			System.out.println("옵션3을 선택");
			break;
		default:
			System.out.println("옵션 값이 잘못 되었습니다.");
			break;
		}

	}

}
