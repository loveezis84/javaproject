package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//Thread를 이용한 멀티 클라이언트
public class m_client {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("User ID: ");
		String mid = sc.nextLine().intern();
		if(mid == "") {
			System.out.println("Id error");
		}
		else {
			Mchat m = new Mchat(mid);			
		}
	}
}
class Mchat{
	private String ip = "192.168.10.149";
	private int port = 10001;
	private String msg = "";
	Socket so = null;
	Scanner sc;
	InputStream is = null;
	OutputStream os = null;
	
	public Mchat(String id) {
		try {
			
			this.msg = "Welcome to " + id;
			while(true) {
				this.so = new Socket(this.ip,this.port);
				this.is = this.so.getInputStream(); //받고
				this.os = this.so.getOutputStream(); //출력
				//상호 작용
								
				this.sc = new Scanner(System.in);
				System.out.println("chat : ");
				this.msg = this.sc.nextLine();
				
				this.os.write(this.msg.getBytes());
				this.os.flush();
				
				
				byte[] data = new byte[2048];
				int n = this.is.read(data);
				this.msg = new String(data,0,n);
				System.out.println(this.msg);
			}
			
		}
		catch (Exception e) {
			System.out.println("Server Error");
			e.printStackTrace();
		}
	}
}















