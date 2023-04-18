package Files;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class File7_1 {

	public static void main(String[] args) {

		database md = new database();
		try {

			md.db();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
class database {
	FileReader fr;
	Scanner sc;
	ArrayList<String[]> ln;
	String data[];

	public void db() throws Exception {
		// 경로(웹) - Servlet, Spring Java \경로
		fr = new FileReader("E:\\git_java\\javaproject\\project1\\src\\Files\\member.txt");
		sc = new Scanner(fr);
		ln = new ArrayList<>();
		while (sc.hasNext()) {
			//split으로 구분하여 1차배열로 이관
			this.data = sc.nextLine().split(",");
			this.ln.add(this.data); //1차배열값을 2차배열로 이관
		}
		//2차배열 이상 출력시 deepToString(배열명).toArray()를 사용하면 
		//정확한 데이터를 확인할수 있습니다.
		System.out.println(Arrays.deepToString(this.ln.toArray()));
		fr.close();
		sc.close();
	}
}
