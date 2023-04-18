package java_ex;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arry1 {

	public static void main(String[] args) {
	
		array ar = new array();
		try {
			ar.bos();
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

class array{
	ArrayList<String> data;
	ArrayList<String> data3;
	ArrayList<ArrayList<String>> data2;
	Scanner sc;
	public void bos() throws Exception {
		FileReader fr = new FileReader("E:\\git_java\\javaproject\\project1\\src\\java_ex\\member.txt");
		sc = new Scanner(fr);
		data2 = new ArrayList<>();
		while(sc.hasNext()) {
			data = new ArrayList<>();
			data3 = new ArrayList<>();
			String memberA = sc.nextLine();
			String[] memberArr = memberA.split(","); // 문자열을 "," 로 구분하여 배열로 만듦
			System.out.println(Arrays.toString(memberArr));
//			System.out.println(memberArr.length); //5개
			try {
				int w = 0;
				while(w < memberArr.length) {
					
					data.add(memberArr[w]);
					w++;
			}
			}
			 catch (Exception e) {
					// TODO: handle exception
				}
			data2.add(data);
		}
		fr.close();
		sc.close();
		System.out.println(data2);
	}
}










