package Files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class File19 {

	public static void main(String[] args) {
		
		try {
			String url = "E:\\git_java\\javaproject\\project1\\src\\Files\\notice.txt";
			FileInputStream fs = new FileInputStream(url);
			// 이미지, 동영상 //
//			BufferedInputStream buff = new BufferedInputStream(fs);
//			byte[] a = new byte[fs.available()];
//			int files = buff.read(a);
			
			
			// 문서파일 형태 //
			InputStreamReader ir = new InputStreamReader(fs);
			BufferedReader bf = new BufferedReader(ir);
			String m = "";
			while((m = bf.readLine()) != null) {
				
				System.out.println(m);
			}
			bf.close();
			ir.close();
			fs.close();
			
		} catch (Exception e) {
			
			System.out.println(e);
		}

	}

}
