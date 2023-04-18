package Files;

import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.Path;
public class File15 {
	
	//파일 처리
	public static void main(String[] args) {
		
		try {
			//파일 이동 기능
			Path data1 = Paths.get("E:\\git_java\\javaproject\\project1\\src\\Files\\notice.txt");
			Path data2 = Paths.get("E:\\git_java\\javaproject\\project1\\src\\Files\\notice2.txt");
			Files.copy(data1,data2);
			
			
			//파일 이동 기능
			Path data3 = Paths.get("E:\\git_java\\javaproject\\project1\\src\\Files\\notice2.txt");
			Path directory = Paths.get("E:\\memo\\notice.txt");
			Files.move(data3,directory);
		} catch (Exception e) {
			System.out.println(e);
				
		}
	}
}
