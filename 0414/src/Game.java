import java.util.Random;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		
		int user=0;
		int com=(int)(Math.random()*3);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("[1:���� 2:���� 3:��]");
		user=scan.nextInt();
		String[] str= {"����","����","��"};
		System.out.println("�� :" + str[user] + " ��ǻ�� :" + str[com]);
		
		switch(com-user)
		{
			case 2: case-1:
			System.out.println("���� �̰��");
			break;
			case 1: case-2:
			System.out.println("��ǻ�Ͱ� �̰��");
			break;
			default:
			System.out.println("����");
			break;
		}
		
	}

}
