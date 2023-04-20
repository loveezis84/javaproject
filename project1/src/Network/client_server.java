package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class client_server {
	//채팅 클라이언트
	public static void main(String[] args) {
		ClientServer cs = new ClientServer();
		cs.client_sv();

	}
}
class ClientServer{
	
	private String ip = "192.168.10.144";
	private int port = 10001;
	private String mid = "";
	private String msg = "";
	Socket so = null;
	Scanner sc;
	InputStream is = null;
	OutputStream os = null;
	public void client_sv() {
		boolean found = true;
		String cms = "";
		try {
			this.sc = new Scanner(System.in);
			System.out.println("login id: ");
			this.mid = this.sc.nextLine();
			while(true) {
				this.so = new Socket(this.ip,this.port);
				this.is = this.so.getInputStream();
				//서버에서 받아오는 메시지
				this.os = this.so.getOutputStream();
				//서버로 보내는 메시지
				if(found == true) {  
					this.msg = "["+this.mid+"] join room";
					found = false;
					//최초 서버에 접속했을 경우(서버로 보내는 메시지)
				}
				else {
					this.sc = new Scanner(System.in);
					System.out.println("message : ");
					cms = this.sc.nextLine();
					
				}		
				if(cms.equals("exit")) {
					this.msg = "chatroom out";
					this.os.write(this.msg.getBytes());					
					this.os.flush();
					this.is.close();
					this.sc.close();
					break;
				}
				else {
					this.msg = "["+this.mid+"]:" +cms;
					this.os.write(this.msg.getBytes());					
					this.os.flush();
				}
				
				/* 서버에서 메시지를 받는 코드 */
				byte[] msg = new byte[1024];
				int n = this.is.read(msg);
				String serverText = new String(msg,0,n);
				System.out.println(serverText);
				/* 서버에서 메시지를 받는 코드 */
				
			}
		} catch (Exception e) {
			System.out.println("Server Connect error!");
			e.printStackTrace();
			
		}	
	}
}











