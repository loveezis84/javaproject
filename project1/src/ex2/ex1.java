package ex2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		try {
			FileLoad fl = new FileLoad();
			fl.load();
		} catch (Exception e) {
			System.out.println("메소드 오류");
		}
	}
}
class FileLoad{
	InputStream is = null;
	public void load() throws Exception {
		is = new FileInputStream("C:\\Project\\Notebook\\Cheper1\\src\\Files\\number.txt");
		byte[] data = new byte[is.available()];
		
		String a = new String(data,0,is.read(data));
		
		Scanner sc = new Scanner(a);
		String[] aaa = null;
		ArrayList<String[]> number = new ArrayList<>();
		while(sc.hasNext()) {
			aaa = sc.nextLine().split(","); 	
			number.add(aaa);
		}
		System.out.println(Arrays.deepToString(number.toArray()));
	}
}
