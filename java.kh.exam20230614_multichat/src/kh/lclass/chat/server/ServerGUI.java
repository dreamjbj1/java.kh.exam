package kh.lclass.chat.server;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerGUI extends JFrame {
	// 컴파일 시 인식할 ServerGUI으로 만들어진 객체 고유 ID
	private static final long serialVersionUID = 6085316166659427339L;
	
	private JTextArea jta = new JTextArea(40, 25); // 채팅 창
	private JTextField jtf = new JTextField(25); // 글 입력 부분
	
	public ServerGUI() {
		// 생성자에서는 초기화(즉 화면 초기화) 
		setBounds(200, 100, 400, 600);  // 창이 뜬느 위치와 크기
		setTitle("서버창");
		
		jta.setEditable(false);  // 채팅창은 입력되지 않도록 함
		jta.setFont(new Font("맑은고딕", Font.PLAIN, 18)); // 글자 폰트, 크기
		jta.setBackground(new Color(230, 255, 230));
		
		
	}
}
