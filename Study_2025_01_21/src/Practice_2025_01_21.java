import java.util.*;
import java.io.*;

// 메뉴 관리 클래스
class Menu {
	// 메뉴이름(String) , 가격(int)
	String name;
	int price;
	
	public void printMenu(String name, int price) {
		System.out.print("메뉴 이름: " + name + " 가격: " + price);
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
}

public class Practice_2025_01_21 {
	public static void main(String[] args) {
		
		/*
		// 문자열을 입력받고 어떤 문자열인지에 따라 다르게 출력하는 코드
		String str = ""; // 문자열을 저장할 변수
		Scanner sc = new Scanner(System.in); // 문자열을 입력받을 스캐너
		Scanner sc2 = new Scanner(System.in); // 정수를 입력받을 스캐너
		
		// 방법1 -> while + switch-case문 사용
		System.out.print("문자열을 입력하시오 : ");
		str = sc.nextLine();

		while(!(str.equals("x") || (str.equals("X")))) {
			
			switch(str) {
				case "m","M" :
					System.out.println("메뉴 관리"); // 메뉴 추가, 제거
					break;
					
				case "o","O" :
					System.out.println("주문 관리"); // 몇개의 커피가 몇개 들어왔는지
					break;		
					
				case "s","S" :
					System.out.println("매출 관리"); // 돈 관리
					break;
			}
			System.out.print("문자열을 입력하시오 : ");
			str = sc.nextLine();		
		}
		sc.close();
		System.out.println("프로그램 종료");
		*/
		
		
		// 방법2 -> while문 + if문 사용	
		String str = "";
		Scanner sc  = new Scanner(System.in);
		System.out.print("문자열을 입력하시오 : ");
		str = sc.nextLine();
		
		while(true) {	
			if(str.equals("x") || str.equals("X")) {
				break;
			} else {
				if(str.equals("m") || str.equals("M")) {
					System.out.println("메뉴 관리");
				} else if(str.equals("o") || str.equals("O")) {
					System.out.println("주문 관리");
				} else if(str.equals("s") || str.equals("S")) {
					System.out.println("매출 관리");
				} 
			}
			System.out.print("문자열을 입력하시오 : ");
			str = sc.nextLine();
		}
		sc.close();
		System.out.println("프로그램 종료");
		
		
	}

}
