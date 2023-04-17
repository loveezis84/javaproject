package java_ex;

import java.util.Scanner;

public class step3 {

	public static void main(String[] args) {
		Calculator cl = new Calculator();
		cl.result();
		cl.scanner();

	}
}
class Calculator {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int a;
    int b;
    public void result() {
        while (true) { // 무한 루프
            try {
                System.out.println("어떤 계산을 하시겠습니까? \n1.곱하기, 2.빼기, 3.나누기, 4.더하기");
                int choice = sc.nextInt();
                
                if (choice == 1) {
                    System.out.println("곱하기를 선택하셨습니다. \n계산을 위한 값을 2개 입력해주세요");
                    scanner();
                    sum = multiply(a, b);
                    System.out.println(sum);
                } else if (choice == 2) {
                    System.out.println("빼기를 선택하셨습니다. 계산을 위한 값을 2개 입력해주세요");
                    scanner();
                    sum = minus(a, b);
                    System.out.println(sum);
                } else if (choice == 3) {
                    System.out.println("더하기를 선택하셨습니다. 계산을 위한 값을 2개 입력해주세요");
                    scanner();
                    sum = add(a, b);
                    System.out.println(sum);
                } else if (choice == 4) {
                    System.out.println("나누기를 선택하셨습니다. 계산을 위한 값을 2개 입력해주세요");
                    scanner();
                    sum = divide(a, b);
                    System.out.println(sum);
                } else {
                    System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
                    continue; // 루프의 처음으로 이동하여 다시 입력을 받음
                }
                break; // 루프 탈출
            } 
            catch (Exception e) {
               System.out.println("숫자만 입력해주세요. 다시 입력해주세요.");
               sc.next(); // 입력 버퍼 비우기
            }
        }
    }
    
    public int multiply(int a, int b) {
        sum = a * b;
        return sum;
    }
    
    public int minus(int a, int b) {
        sum = a - b;
        return sum;
    }
    
    public int add(int a, int b) {
        sum = a + b;
        return sum;
    }
    
    public int divide(int a, int b) {
        sum = a / b;
        return sum;
    }
    public void scanner() {
    	a = sc.nextInt();
    	b = sc.nextInt();
    }
}
