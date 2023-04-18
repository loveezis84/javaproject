package java_ex;

import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class arry2 {

	public static void main(String[] args) {
		align ag = new align();
		
		try {
			ag.arry_align();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
class align{
	Scanner scan;
	LinkedList<String> member;
	LinkedList<LinkedList<String>> member2;
	String[] b;
	public void arry_align() {
		member2 = new LinkedList<>();
		try {
			FileReader fr = new FileReader("D:\\Project\\HomePC\\JavaStart\\src\\java_ex\\member.txt");
			this.scan = new Scanner(fr);
			while(scan.hasNext()) {
				member = new LinkedList<>();
				String sc = scan.nextLine();
				b = sc.split(",");
//				System.out.println(Arrays.toString(b));
				
				int w = 0;
				while(w < b.length) {
					
					member.add(b[w]);
					w++;
				}
				member2.add(member);
			}
			fr.close();
			scan.close();
			
		} catch (Exception e) {
			System.out.println(e);
				
		}	
		System.out.println(member2);
	}
}
