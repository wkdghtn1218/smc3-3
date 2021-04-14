import java.util.Random;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		
		int user=0;
		int com=(int)(Math.random()*3);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("[1:가위 2:바위 3:보]");
		user=scan.nextInt();
		String[] str= {"가위","바위","보"};
		System.out.println("나 :" + str[user] + " 컴퓨터 :" + str[com]);
		
		switch(com-user)
		{
			case 2: case-1:
			System.out.println("내가 이겼다");
			break;
			case 1: case-2:
			System.out.println("컴퓨터가 이겼다");
			break;
			default:
			System.out.println("비겼다");
			break;
		}
		
	}

}
