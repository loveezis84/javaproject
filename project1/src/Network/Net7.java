package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Net7 {

	public static void main(String[] args) {
		String ip = "192.168.10.148";
		int port = 9002;
		try {
			chat ch = new chat();
			ch.serverConnect(ip, port);
		} catch (Exception e) {
			System.out.println("Server error");
			e.printStackTrace();
		}
	}
}

class chat{
	Scanner sc;
	
	//아래 3개는 무조건 고정
	//client와 server모두 공용으로 사용하는 클레스 입니다.
	Socket soket;
	OutputStream outP;
	InputStream inP;
	
	public void serverConnect(String ip,int port) throws Exception{
		this.soket = new Socket(ip,port); //상대방 ip,port번호
		System.out.println("ok~!");
		this.outP = this.soket.getOutputStream(); 
		//soket 정보를 갖고와서 서버로 값을 보내는 역할
		this.inP = this.soket.getInputStream();
		//server에서 값을 받을때 사용
		this.sc = new Scanner(System.in);
		
		System.out.println("message: ");
		String msg = this.sc.nextLine();
		String username = "YunSeung :";
		String chats = username + msg;
		
		this.outP.write(chats.getBytes()); //write로 getBytes 전송
		this.outP.flush();
		this.outP.close();	
	}
}









