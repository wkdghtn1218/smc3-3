import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int arr[] = new int[5];
		int max = 0;
		int index = 0;
		
		for(i=0; i<arr.length; i++) {
		
			System.out.println((i+1)+"�� �Է� :");
			arr[i] = scan.nextInt();
		
		if(max<arr[i]) {
				max = arr[i];
				index = i+1;
		}
		}
	System.out.println("���� ū ���� "+index+"��° ���ڸ� "+max);	
	}

}
