package Files;

import java.io.FileReader;

public class File3 {
	//java에서는 모든 파일을 다 읽어 올 수 있습니다.
	//.data, .date, .dat, .json, .xml, .exe, .bat 모든파일 로드가능
	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("E:\\git_java\\javaproject\\project1\\src\\Files\\data.dat");
			System.out.println(reader.read());
			
			while(true) {
				int a = reader.read();
				System.out.println((char)a);
				if(a == -1) {
					break;
				}
			}
			reader.close();
			
		} catch (Exception e) {
			System.out.println("파일 오류");
		}
		
	}

}
