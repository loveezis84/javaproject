package Files;

import java.io.FileWriter;
import java.util.Scanner;

//user.txt라는 파일에 다음과 같이 저장 되도록 코드를 작성하시오.
/*
 사용자 아이디를 입력하세요?
 총 5번의 질문을 물어보며, 사용자가 직접 입력합니다.
 사용자가 입력한 내용은 user.txt에 남아 있어야 합니다. 
*/
public class File5 {

	public static void main(String[] args) {
		ask as = new ask();
		as.check();
		
	}
}
class ask{
	Scanner sc;
	String userid;
	int count = 0;
	public void check() {
		//true를 안쓰는 이유는 반복문 안에 적용시에만 true필요
		try {
			FileWriter fr = new FileWriter(
					"E:\\git_java\\javaproject\\project1\\src\\Files\\user.txt");
		while(true) {
			sc = new Scanner(System.in);
			System.out.println("사용자 아이디를 입력하세요");
			userid = sc.next();
			fr.write(userid+"\n");
			this.count++;
			
			if(this.count == 5) {
				System.out.println("더이상 입력할수 없습니다");
				break;
			}
		}
		fr.close();
		sc.close();
		} catch (Exception e) {
			if(e.getMessage() != null) {
				System.out.println("error 발생");
			}
		}
		
	}
}


