package kh.lclass.chat.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import kh.lclass.chat.client.ClientGUI;

public class ServerBackground {
	private ServerSocket serverSocket; // 서버소켓
	private ServerGUI gui;
	
	// client 여러명을 관리 : key:nickname, value: OutputStream
	private Map<String, BufferedWriter> mapClients = new HashMap<String, BufferedWriter>();
	//map.put("socket", socket) ;
	//map.put("nickname", "ej") ;
	//mapList.add(map);
	
	// map.put("ej", socket);
	// map.put("hj", socket);
	
	private Socket socket;

	private int count; // 현재 접속자 수

	// 서버 생성 및 설정
	public void setting() {
		try {
			serverSocket = new ServerSocket(7777);
			// 방문자 접속을 계속 받아드림. 무한반복함. GUI 프로그램경우 창 닫힐때까지 계속 반복됨. break 없음
			while (true) {
				// 접속자 대기 중
				socket = serverSocket.accept();
				
				new Client(socket).start();
			
			
			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 클라이언트 접속하면 그 정보를 나타내 주는 메소드
	public void addClient(String nickname) {
		gui.appendMsg(nickname+"님이 접속했습니다.");
	}
	
	
	
	
	// private ServerGui gui
	public void setGui(ServerGUI gui ) {
		this.gui = gui;
	}
	
	public void sendMessage(String msg) {
		// client들 모두에게 msg 전달
		Set<String> keys = mapClients.keySet();
		for(String key : keys) {
			BufferedWriter wr = mapClients.get(key);
			try {
				wr.write(msg+"\n");
				wr.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
		
		
	
	}
	
	/////////// Inner Class /////////////////
	
	
	
	class Client extends Thread{
//		private Socket socket;
		private BufferedReader br;
		private BufferedWriter bw;
		private String nickname;
		public Client(Socket socket) {
			//초기값 설정 
			// 서버와 입/출력 통로 생성
						try {
							br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
							bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
							// 클라이언트 nickname이 바로 이어서 들어옴.
							// 접속되면 바로 nickname이 전달될 것으로 읽음
							String nickname = br.readLine();
							// server 화면에 표현
							addClient(nickname);
							// client outputStream 모두에게 접속 정보 전달
							mapClients.put(nickname, bw);
							sendMessage(nickname+"님 접속했습니다.");
						} catch (IOException e) {
							e.printStackTrace();
						}
				
		}
			
		@Override
		public void run() {
			// client 마다 각각에서 전달되어 오는 메시지 확인하고 출력
			// client와 입력 통로가 끊어지지 않았다면 계속 반복확인
			// client에서 수신받은 msg
			while(br != null) {
				try {
					String msg = br.readLine();
					gui.appendMsg(msg);
					// clinet map 모두에게 접속 정보 전달
					sendMessage(msg);
				} catch (IOException e) {
					e.printStackTrace();
				}

				
			}
		}
	
}	
	
	

	
}
	
	
	