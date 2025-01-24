import java.util.*;
import java.io.*;

public class Practice_2025_01_20_2 {
	public static void main(String[] args) { 
		
		// 2단부터 9단까지 구구단 출력
//		for(int i = 2; i < 10; i++) {
//			for(int j = 1; j < 10; j++) {
//				System.out.println(i + " X " + j + " = " + (i*j));
//			}
//		}
		
		// 직각삼각형 별찍기
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 직각삼각형을 180도로 돌린 버전
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 5; j > i; j--) {
//				System.out.print(" ");
//			}
//			for(int k =0; k < i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 직각삼각형 두개를 위아래로 붙인 버전
//		for(int i = 1; i<=5; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i = 1; i <= 4; i++) {
//			for(int j = 4; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 앞에 한 문제에서 while문을 for문으로 바꿔보는법
//		String menu = "";
//		int price = 0;
//		Scanner s1 = new Scanner(System.in);
//		Scanner s2 = new Scanner(System.in);
//		ArrayList<String> meArr = new ArrayList<>();
//		ArrayList<Integer> prArr = new ArrayList<>();
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.print("메뉴 이름을 입력하세요 : ");
//			menu = s1.nextLine();
//			System.out.print("가격을 입력하세요 : ");
//			price = s2.nextInt();
//			
//			meArr.add(menu);
//			prArr.add(price);
//		}
//		
//		for(int i = 0; i < meArr.size(); i ++) {
//			System.out.println("메뉴 : " + meArr.get(i) + " 가격 : " + prArr.get(i));
//		}
		
		// 1부터 100까지의 합계를 for문으로 구하기
//		int sum = 0;
//		for(int i  = 1; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println("1부터 100까지의 합계: " + sum);
		
		
	}
}
