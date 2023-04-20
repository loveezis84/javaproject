package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

//Thread를 이용한 멀티 서버
public class m_server {

	public static void main(String[] args) {
		ChatRoom cr = new ChatRoom();
		
	}
}
class ChatRoom{
	static final int port = 10001;
	ServerSocket sk = null;
	Socket so = null;
	public ChatRoom() {
		
		try {
			this.sk = new ServerSocket(ChatRoom.port);
			System.out.println("****** Chating *******");
		while(true) {
			this.so = this.sk.accept(); //클라이언트 접속허가
			Thread tr = new chat_thread(this.so); //accept 전송
			tr.start();
			
		}
		} catch (Exception e) {
			System.out.println("Port Error!!");
			
		}
	}
}
class chat_thread extends Thread{
	InputStream is;
	OutputStream os;
	private String msg = "";
	Scanner sc;
	static ArrayList<Socket> user = new ArrayList<Socket>();
	//배열을 메모리에 저장 시키는 이유는 접속자를 누적시키기 위해서 사용
	
	
	public chat_thread(Socket s){ //즉시실행
		System.out.println("**** Chatroom open! ****");
		try {
			chat_thread.user.add(s);
			this.is = s.getInputStream(); //받고
			this.os = s.getOutputStream(); //출력
			//상호 작용
			
			
		} catch (Exception e) {
			System.out.println("Exit error!");
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		try {
			while(true) {
				byte[] data = new byte[1024];
				int n = this.is.read(data);
				this.msg = new String(data,0,n);
				System.out.println(this.msg);
				
//				this.sc = new Scanner(System.in);
//				System.out.println("message: ");
				String result = this.msg;
				
				int f;
				/* 누군가 입력하는 메시지를 접속한 모든 사용자에게 출력함 */
				for(f=0; f<this.user.size(); f++) {
					this.os = this.user.get(f).getOutputStream();
					this.os.write(result.getBytes());
					this.os.flush();
				}
				/* 전송 끝 */
			}
			
		} catch (Exception e) {
			System.out.println("Client Success Exit");
			e.printStackTrace();
		}
	}
}










