import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int arr[] = new int[500];
		int max = 0;
		int index = 0;
		
		for(i=0; i<arr.length; i++) {
			
			System.out.println("500 이하의 자연수를 입력하세요.");
			arr[i] = scan.nextInt();
			
			if(max<arr[i]){
				max = arr[i];
				index = i+1;
			}
		}
		System.out.println("까지"+index+"의 배수이면서"+max+"의 배수인 수의 합은"+"입니다.");
	}

}
