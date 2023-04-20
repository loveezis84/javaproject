package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chat_server {
	//채팅 서버
	public static void main(String[] args) {
		ChatServer cs = new ChatServer();
		cs.chat_sv();
		
	}
}
class ChatServer{
	
	private int port = 10001;
	private String mid;
	ServerSocket sk = null;
	Socket so = null;
	Scanner sc;
	InputStream is = null;
	OutputStream os = null;
	public void chat_sv() {
		
		try {
			this.sk = new ServerSocket(this.port);
			this.sc = new Scanner(System.in);
			System.out.println("login_id : "); //방 개설자
			this.mid = sc.next();
			System.out.println("Chating Room Open"); 
			while(true) {
				this.so = sk.accept();
				this.is = this.so.getInputStream();
				
				
				/* 클라이언트에게 받는 메시지를 출력하는 코드 */
				this.os = this.so.getOutputStream();
				//클라이언트에게 보내는 메시지
				byte[] msg = new byte[1024];
				int n = this.is.read(msg);
				String text = new String(msg,0,n);
				System.out.println(text); 
				//클라이언트 입장 메시지(채팅 메시지)
				/* 클라이언트에게 받는 메시지를 출력하는 코드 */
				
				/* 서버에서 클라이언트로 메시지를 전송하는 코드 */
				this.sc = new Scanner(System.in);
				System.out.println("Server message: ");
				text = this.sc.nextLine();
				if(text.equals("exit")) {
					this.sk.close();
					this.so.close();
					System.out.println("bye");
					break;
				}
				String cms = "["+this.mid+"]:"+text;
				this.os.write(cms.getBytes());;
				this.os.flush();
				/* 서버에서 클라이언트로 메시지를 전송하는 코드 */
			}
			
		} catch (Exception e) {
			System.out.println("Port Connect error!");
			e.printStackTrace();
		}
		
	}
}










