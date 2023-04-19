package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Net5 {
 
   //socekt 통신 : server , client 양방향 통신
   //http 통신 : image , 동영상 , 음악 등 사용자 요청에 맞춰서 송수신 통신(단방향)
   
   //양방향 : 자동 업데이트 
   public static void main(String[] args) {
   
      System.out.println("Server Connect");
      int port = 9002; //포트번호 셋팅
      try {
         ServerSocket ss = new ServerSocket(port); // 오픈시킬 포트를 적용
         while(true) {
            System.out.println("Server Result...");
            Socket sc = ss.accept(); // accept : 클라이언트가 접속하는것을 대기하는 역할을 하게됨
            System.out.println("host success!!");
            
            //Server에서 Client로 받는 통로
            InputStream is = sc.getInputStream();
            
            //Client로 보내는 통로
            OutputStream os = sc.getOutputStream();
            byte data[] = new byte[1024];  
            //client에서 받는 text를 byte로 받음
            int n = is.read(data); 
            // 해당 값을 읽어들임
            String magclient = new String(data,0,n);
            //문자자료형으로 변환
            System.out.println(magclient);
            //출력
            String aws = "server hellow~^^"; //서버에서 보내는 메시지
            //client로 메시지 전송
            os.write(aws.getBytes()); //클라이언트로 보내기위한 메모리 저장
            os.flush();
            os.close();
            is.close();
            sc.close();   
         }
         
      }catch (Exception e) {
         System.out.println("Server Connect error!!");
      }

   }

}