import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int arr[] = new int[500];
		int max = 0;
		int index = 0;
		
		for(i=0; i<arr.length; i++) {
			
			System.out.println("500 ������ �ڿ����� �Է��ϼ���.");
			arr[i] = scan.nextInt();
			
			if(max<arr[i]){
				max = arr[i];
				index = i+1;
			}
		}
		System.out.println("����"+index+"�� ����̸鼭"+max+"�� ����� ���� ����"+"�Դϴ�.");
	}

}
