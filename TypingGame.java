package math_random;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		String[] data = {"bear", "cat", "dog", "eagle", "monkey", "tiger"
				         , "penguin", "lion", "snake", "dolphin"};
		int n = 1;    //문제 번호
		long millisecond = 0;
		
		System.out.println("영어타자 게임");
		Scanner sc = new Scanner(System.in);
		millisecond = System.currentTimeMillis();    //게임 시작 전 시간
		for(int i=0; i<10; i++) {
			int rand = (int)(Math.random()*data.length);
			System.out.println("문제" + n);
			String question = data[rand];
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
		System.out.println("게임 소요 시간 " + (float)millisecond/1000+ "초입니다.");
		sc.close();
	}
}
