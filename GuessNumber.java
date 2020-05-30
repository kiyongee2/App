package math_random;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int com = rand.nextInt(30) + 1;
		
		while(true) {
			System.out.println("숫자(1-30)를 입력하세요 : ");
			int num = sc.nextInt();
			if(com==num) {
				System.out.println("정답..당신은 천재!");
				break;
			}
			else if(com>num)
				System.out.println("너무 작아요");
			else
				System.out.println("너무 커요");	
		}
		sc.close();
	}
}
