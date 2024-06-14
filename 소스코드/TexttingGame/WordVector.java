package TexttingGame;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

//파일에서 단어를 읽어와 wVector에 저장하는 클래스
public class WordVector {
	private Vector<String> wVector = new Vector<String>();
	
	public WordVector() {
		
		try { //파일 읽기
			Scanner scanner = new Scanner(new FileReader("word.txt"));
			while(scanner.hasNext()) {
				String word = scanner.nextLine();
				wVector.add(word);
			}
			scanner.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//wVector에서 무작위로 선택해서 단어를 반환하는 메소드
	public String getWord() {
		int index = (int)(Math.random()*wVector.size());
		return wVector.get(index);
	}
}
