import java.util.Scanner;

class Grade{
	int math;
	int science;
	int english;
	
	public int average(){
		return (math+science+english)/3;
	}

}

public class Prob_01 {
		
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			Grade me = new Grade();
			System.out.println("����, ����, ���� ������ 3���� ���� �Է�>>");

			me.math=sc.nextInt();
			me.science=sc.nextInt();
			me.english=sc.nextInt();
			
			System.out.println("����� :"+me.average());
			
			
	
	}
		
}
	
	