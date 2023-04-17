package Files;

import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class File7 {

	public static void main(String[] args) {

		member mb = new member();
		try {
			mb.client();

		} catch (Exception e) {
			System.out.println("메소드 오류");
		}
	}
}

class member {

	Scanner sc;
	ArrayList<ArrayList<String>> Um2;
	ArrayList<String> Um;
	FileReader fr;

	public void client() throws Exception {
		Um2 = new ArrayList<>();
		fr = new FileReader("E:\\git_java\\javaproject\\project1\\src\\Files\\member.txt", Charset.forName("UTF8"));
		sc = new Scanner(fr);

		while (this.sc.hasNext()) { // 해당 문서가 true 문장이 있을때까지 출력시킨다는의미

			Um = new ArrayList<>();
			String a = sc.nextLine();
			int w = 0;
			while(w < a.split(",").length) {
				this.Um.add((a.split(",")[w]));
				w++;
			}
			Um2.add(Um);
		}
		System.out.println(Um2);
	}
}
