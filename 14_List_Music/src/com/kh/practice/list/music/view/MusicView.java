package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music_controller.MusicController;
import com.kh.practice.list.music_vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	public void mainMenu() {
	
	
//	******* 메인 메뉴 *******
//	1. 마지막 위치에 곡 추가 // addList() 실행
//	2. 첫 위치에 곡 추가 // addAtZero()
//	3. 전체 곡 목록 출력 // printAll()
//	4. 특정 곡 검색 // searchMusic()
//	5. 특정 곡 삭제 // removeMusic()
//	6. 특정 곡 정보 수정 // setMusic()
//	7. 곡명 오름차순 정렬 // ascTitle()
//	8. 가수명 내림차순 정렬 // descSinger()
//	9. 종료 // “종료” 출력 후 main()으로 리턴
//	메뉴 번호 선택 : >> 입력 받음
//	//메뉴 화면 반복 실행 처리
	int menu = 0; // 비정상 입력 경우를 위한 초기값
	while(menu !=9) {
	System.out.println("******* 메인 메뉴 *******");
	System.out.println("1.마지막 위치에 곡 추가 ");
	System.out.println("2.첫 위치에 곡 추가 ");
	System.out.println("3.전체 곡 목록 출력 ");
	System.out.println("4.특정 곡 검색 ");
	System.out.println("5.특정 곡 삭제 ");
	System.out.println("6.특정 곡 정보 수정 ");
	System.out.println("7. 곡명 오름차순 정렬 ");
	System.out.println("8. 가수명 내림차순 정렬 ");
	System.out.println("9. 종료 ");
	System.out.println("메뉴 번호 선택 : >>");
	System.out.println("메뉴 화면 반복 실행 처리");
	String menuStr = sc.nextLine(); // 사용자 입력
	menu = -1; // 비정상 입력 경우를 위한 초기값
	try {
		menu = Integer.parseInt(menuStr); // 사용자 입력값을 menu에 대입
	} catch (NumberFormatException e) {
		System.out.println("!!!문자는 입력될 수 없습니다.");
	}
	 //정상입력 경우
	switch(menu) {
	case 0:
		saveFile();
		break;
	case 2:
		addAtZero();
		break;
	case 3:
		printAll();
		break;
	case 4:
		searchMusic();;
		break;
	case 5:
		removeMusic();
		break;
	case 6:
		setMusic();
		break;
	case 7:
		ascTitle();
		break;
	case 8:
		descSinger();
		break;
	case 9:
//		System.out.println("종료");
		break;
//		return; // 종료 경우 메소드 종료
	default:
		// 비정상 입력 경우
		System.out.println("!!!메뉴에 해당하는 1~9 숫자만 작성해주세요.");
//		continue; // 다시 메뉴입력이 보이도록 함.
	}
	// 반복문 마지막에 더이상의 어떤 코드도 없다면 continue가 무의미해보이지만...
	// 다른 동작이 아래처럼 있다면 continue 중요함. 가독성을 위해서도 continue 권장
	//System.out.println("정상적 메인메뉴 실행된 경우에만 보였으면 함.");
	} 
	System.out.println("종료");
	// 생략가능 코드
	return; 
}
	public void addList() {
		
//		****** 마지막 위치에 곡 추가 ******
// 	곡 명과 가수 명을 사용자에게 입력 받는다.
// 	MusicController에 addList()를 이용해서 입력한 정보를 넘기고
// 	추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔창에 출력
	System.out.println("****** 마지막 위치에 곡 추가 ******");
	System.out.println("곡명을 입력해주세요.");
	String title = sc.nextLine();
	System.out.println("가수명을 입력해주세요.");
	String singer = sc.nextLine();
//	Music vo = new Music();
//	vo.setTitle(title);
//	vo.setSinger(singer);
//	Music vo = new Music(title, singer);
	int result = mc.addList(new Music(title, singer));
	if(result > 0) {
		System.out.println("추가 성공");
	} else {
		System.out.println("추가 실패");
	}
}
	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.println("곡명을 입력해주세요.");
		String title = sc.nextLine();
		System.out.println("가수명을 입력해주세요.");
		String singer = sc.nextLine();
		int result = mc.addList(new Music(title, singer));
		if(result > 0) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
		
	}
	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		List<Music> volist = mc.printAll();
		for(Music vo : volist) {
			System.out.println(vo);
		}
	}
	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.println("검색할 곡 명을 입력해주세요.");
		String title = sc.nextLine();
		Music result = mc.searchMusic(title);
		if(result == null) {
			System.out.println("검색한 곡이 없습니다.");
		} else{
			System.out.printf("검색한 곡은 000(%s, %s) 입니다.\n", result.getTitle(), result.getSinger());
		}
		//
		//                                        
	
	}
	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.println("삭제할 곡 명을 입력해주세요.");
		String title = sc.nextLine();
		Music result = mc.removeMusic(title);
		if(result == null) {
			System.out.println("삭제할 곡이 없습니다.");
		} else{
			System.out.printf("삭제한 곡은 000(%s, %s) 입니다.\n", result.getTitle(), result.getSinger());
		}
		
	}
	public void setMusic() {
		System.out.println("****** 특정 곡 정보 수정 ******");
		System.out.println("수정할 곡명을 입력해주세요.");
		String title = sc.nextLine();
		System.out.println("변경할 곡명을 입력해주세요.");
		String newTitle = sc.nextLine();
		System.out.println("변경할 가수명을 입력해주세요.");
		String newSinger = sc.nextLine();
		
		Music result = mc.setMusic(title, new Music(newTitle, newSinger)); 
		if(result == null) {
			System.out.println("수정할 곡이 없습니다. ");
		} else {
			// 기존 곡명 / 가수
			System.out.printf("000(%s, %s)의 값이 변경되었습니다.\n", result.getTitle(), result.getSinger());
		}
		
	}
	public void ascTitle() {
		System.out.println("======== 곡 명 오름차순 정렬 ======== ");
		int result = mc.ascTitle();
		if(result > 0) {
			System.out.println("정렬 성공");
		} else {
			System.out.println("정렬 실패");
		}
	}
	public void descSinger() {
		System.out.println("======== 가수 명 내림차순 정렬 ======== ");
//		int result = mc.descSinger();
		int result = mc.descSinger2();
		if(result > 0) {
			System.out.println("정렬 성공");
		} else {
			System.out.println("정렬 실패");
		}
	}

	public void saveFile(){
		System.out.println("******* 곡정보를 파일에 저장 *******");
		System.out.println("저장할 파일경로를 작성해 주세요.");
		String fileName = sc.nextLine();
		
		int result = mc.saveFile(fileName);
		if(result > 0) {
			
		} 
			
		}
	}

