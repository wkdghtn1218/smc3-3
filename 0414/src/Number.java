import java.util.Random;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		
		System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50)까지:");
		Scanner sc = new Scanner(System.in); // 스캐너생성
		int num=sc.nextInt();
		int diff = 0;
		int []arr=new int[10]; // 10개 공간생성
		
		for(int a=0; a<10; a++) { 
			arr[a]=(int)(Math.random()*50+1); //숫자 생성 Random 함수 *마지막숫자+첫번째숫자
			System.out.print(arr[a]+" ");
		}
		System.out.println();
		
		for(int i=0; i<10; i++) {
			if(arr[i] == num) {
				System.out.println("당첨!");
				diff = 1;
			}
		}
		if(diff == 0) System.out.println("꽝");
	}
}
		
		

