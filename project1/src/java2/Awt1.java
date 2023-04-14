package java2;
//
//import java.awt.Button;
//import java.awt.Checkbox;
//import java.awt.Color;
//import java.awt.Frame;
//import java.awt.Panel;
//import java.awt.TextField;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//
//public class Awt1 {
//	/*
//	  java => awt, swing(GUI)
//	  Frame -> Panel - > Object(생성)
//	  적용방식 : Object -> Panel -> Frame(적용)
//	 */
//	public static void main(String[] args) {
//	
//		Frame fr = new Frame(); //프레임생성
//		closepm cp = new closepm(); //프레임 닫기
//		fr.setTitle("사용자 로그인"); //창 타이틀
//		fr.setSize(500,500); //창 사이즈
//		fr.setVisible(true); //사용 유/무
//		fr.addWindowListener(cp); //창닫기 (없으면 안닫힘)
//
//		Panel p = new Panel();
//		/* 오브젝트 생성 */
//		Checkbox c1 = new Checkbox("auto login");
//		TextField id = new TextField(10);
//		Button btn = new Button("login");
//		Button btn2 = new Button("Close");
//		Button btn3 = new Button("auto ID");
//		
//		btn.setBackground(Color.yellow);
//		btn3.addActionListener(new ActionListener() {
//			String userid = "hong";
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				id.setText(userid); //아이디 이름을 가진 오브젝트 안에 값을 적용
//				
//			}
//		});
//		
//		//닫기버튼
//		btn2.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//				
//			}
//		});
//		p.add(btn3);
//		p.add(btn2);
//		p.add(btn); //add : 추가 (append같은개념)
//		p.add(id);  
//		p.add(c1);
//		fr.add(p); //맨 마지막에 frame 안에 패널을 넣음 
//	}
//	
//}
//class closepm extends WindowAdapter{
//	@Override
//	public void windowClosing(WindowEvent e) {
//		super.windowClosing(e);
//		System.out.println("프로그램 종료");
//		System.exit(0);
//	}
//	
//	
//}