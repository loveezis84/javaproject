package Network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class multi_client {
	//멀티채팅 클라이언트
	public static void main(String[] args) {
	  multi_client mc = new multi_client();
	  mc.info();
	}
	public void info() {
		Socket sk = null;
		BufferedReader br = null;
		InputStream is = null;
		InputStreamReader isr = null;
		Scanner sc = null;
		try {
			sk = new Socket("192.168.10.155",10001);
			System.out.println("Connect Success");
			sc = new Scanner(System.in);
			System.out.println("user id: "); //사용자 아이디
			String name = sc.next();
			//멀티 스레드로 사용자 아이디 및 소켓 전달
			Thread tr = new ch_client(sk,name);
			tr.start(); //멀티 스레드 가동
			
			is = sk.getInputStream();  //읽기
			isr = new InputStreamReader(is); //byte를 String으로 변환
			br = new BufferedReader(isr); //메모리에 저장
			
			while(br != null) {
				String msg = br.readLine();
				System.out.println("ID:" +msg); //전달
			}
			
		} catch (Exception e) {
			System.out.println("Server Connect Error...");
		}
		
	}
}
class ch_client extends Thread{
	Socket sk = null;
	String name = null;
	Scanner sc = null;
	//소켓이랑 아이디 값을 기본설정으로 등록
	public ch_client(Socket s,String name) {
		this.sk = s;
		this.name = name;
		
	}
	
	@Override
	public void run() {
	
		try {
			//byte를 String으로 변환
			PrintStream ps = new PrintStream(this.sk.getOutputStream());
			ps.println(this.name); //입장에 대한 1회만 사용
			ps.flush();
			
			while(true) { //사용자가 입력하는 메시지를 전달
				this.sc = new Scanner(System.in);
				String msg = this.sc.nextLine();
				ps.println(msg); //전달 메시지 출력
				ps.flush(); //메시지 초기화
				
				if(msg.equals("exit")) {
					System.out.println(this.name +":" + "room out");
					System.exit(0); //프로세스 종료~!
					break;
				}
			}
			
		} catch (Exception e) {
			System.out.println("Message Error!!");
		}
	}
}












