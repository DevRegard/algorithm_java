package test;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

// 메모장 프로그램
// https://yooniron.tistory.com/40
// https://yooniron.tistory.com/41
public class Memo extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// 멤버변수
	public JTextArea ta = new JTextArea(); //텍스트 박스
    JFileChooser chooser = new JFileChooser();
    
    // 메뉴바 ~> 상단 메뉴 내용 ~> 하위 메뉴 내용
    JMenuBar mb = new JMenuBar(); //메뉴바
    JMenu[] mfile = new JMenu[10]; //메모장 상단 메뉴
    JMenuItem[] item = new JMenuItem[5]; //메뉴창의 내용 변수 생성
    
    // 메뉴 상단 내용
    String[] smenu = { "파일(F)", "편집(E)" };
    
    // 메뉴 하위 내용
    String[] scrItem = { "새파일", "열기", "저장", "다른이름으로저장", "종료" }; // '파일(F)'
    String[] editItem = { "잘라내기(T)", "복사(C)", "붙여넣기(P)", "삭제(L)" }; // '편집(E)'
    
	// 생성자
	public Memo() {
	    
		String dkssud = "안녕";
		
		this.setTitle("메모장 " + dkssud); //사용자가 직접 제목을 지정할 수 있도록 변수 생성
	    this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
        // 메뉴창에 '메뉴' 붙히기
        for (int i = 0; i < smenu.length; i++) {
            mfile[i] = new JMenu(smenu[i]);
            mb.add(mfile[i]);
        }
        
        // 상단메뉴에 '파일' 붙히기
        for (int i = 0; i < scrItem.length; i++) {
            item[i] = new JMenuItem(scrItem[i]);
            // 1. 이벤트 소스: JMenuItem
            // 4. 메뉴바 설정
            this.setJMenuBar(mb);
            mfile[0].add(item[i]); //첫번째 메뉴에 아이템 붙히기
        }
        
        // 상단메뉴에 '편집' 붙히기
	    for (int i = 0; i < editItem.length; i++) {
	    	item[i] = new JMenuItem(editItem[i]);
	    	this.setJMenuBar(mb);
	    	mfile[1].add(item[i]);
		}   
	    
	    // 상단 메뉴에 '하위 내용들' 붙히기
		/*
		 * for (int i = 0; i < scrItem.length; i++) { item[i] = new
		 * JMenuItem(scrItem[i]); item[i] = new JMenuItem(editItem[i]);
		 * this.setJMenuBar(mb); mfile[0].add(item[i]); mfile[1].add(item[i]); }
		 */
        
        // 컴포넌트 추가
        this.add(ta); // JTextArea : 글 작성
 
        this.setVisible(true); //클래스 생성시 프로그램이 보인다.
        
	} //cons end

	public static void main(String[] args) {
		new Memo();
	}
}
