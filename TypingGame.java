package exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("words.txt");
			BufferedReader br = new BufferedReader(fr)){
			String line;
			String[] words=null;
			while((line=br.readLine()) !=null) {
				words = line.split(" ");
			}
			
			int n = 1;    //문제 번호
			br.close();
			long millisecond = 0;
			
			System.out.println("영어타자 게임");
			Scanner sc = new Scanner(System.in);
			millisecond = System.currentTimeMillis();    //게임 시작 전 시간
			for(int i=0; i<10; i++) {
				int rand = (int)(Math.random()*words.length);
				System.out.println("문제" + n);
				String question = words[rand];
				System.out.println(question);
				
				String answer = sc.next();
				if(answer.equals(question)) {
					System.out.println("통과!");
					n++;
				}
				else {
					System.out.println("오타! 다시 도전");
				}
			}
			millisecond = System.currentTimeMillis() - millisecond;
			System.out.println("게임에 걸린 시간은 " + (float)millisecond/1000+ "초입니다.");
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
