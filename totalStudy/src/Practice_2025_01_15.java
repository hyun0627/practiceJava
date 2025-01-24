import java.util.*;

public class Practice_2025_01_15 {
	public static void main(String[] args) {
		
		/*1월 15일 실습
		// switch-case문 연습1
		// 정수 a,b 문자열 x를 입력받고 x == + 이면 print(a+b) -이면 print(a-b) *이면 print(a*b) ... 기타의 경우 wrong operator 출력
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수 a를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("정수 b를 입력하세요 : ");
		int b = sc.nextInt();
		System.out.print("문자열 x를 입력하세요 : ");
		String x = sc1.nextLine();
		sc.close();
		sc1.close();
		
		switch(x) {
			case "+":
				System.out.println(a + " + " + b + " = " + (a+b));
				break;
			case "-":
				System.out.println(a + " - " + b + " = " + (a-b));
				break;
			case "*":
				System.out.println(a + " X " + b + " = " + (a*b));
				break;
			case "/":
				System.out.println(a + " / " + b + " = " + (a/b));
				break;
			case "%":
				System.out.println(a + " % " + b + " = " + (a%b));
				break;
			default :
				throw new RuntimeException("Wrong Operator");	
		}
				
		//switch-case문 연습2, dow(dayOfWeek)에 따른 요일 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("오늘의 요일번호를 입력하십시오 : ");
		int dow = sc.nextInt();
		sc.close();
		switch(dow) {
			case 1: 
				System.out.println("오늘은 월요일입니다.");
				break;
			case 2: 
				System.out.println("오늘은 화요일입니다.");
				break;
			case 3: 
				System.out.println("오늘은 수요일입니다.");
				break;
			case 4: 
				System.out.println("오늘은 목요일입니다.");
				break;
			case 5: 
				System.out.println("오늘은 금요일입니다.");
				break;
			case 6: 
				System.out.println("오늘은 토요일입니다.");
				break;
			case 7: 
				System.out.println("오늘은 일요일입니다.");
				break;
			default :
				throw new RuntimeException("잘못된 요일번호입니다.");
		}
			
		//while문 실습 1
		int x = 1;
		while(x < 10) {
			System.out.println(x);
			x++;
		}
		
		//while문 실습 2 / 1부터 100까지출력
		int x = 1;
		while(x <= 100) {
			System.out.println(x);
			x++;
		}
		
		// while문 실습3 / 100이하의 3의 배수 출력
		int x = 1;
		while(x < 100) {
			if(x % 3 == 0) {
				System.out.println(x);
			}
			x++;
		}
		//while문 실습4 / 1 ~ 5까지의 합 구하기
		int sum = 0;
		int a = 1;
		while(a <= 100) {
			sum += a;
			a++;
		}
		System.out.println("합계: " + sum);
		
		// while문 실습5 / 구구단 9단 출력
		Scanner sc = new Scanner(System.in);
		int a = 1;
		System.out.print("몇단을 출력하시겠습니까 : ");
		int b = sc.nextInt();
		sc.close();
		System.out.println(b + "단 출력");
		while(a < 10) {
			System.out.println(b + " X " + a + " = " +(a*b));
			a++;
		}
		*/
		/*
		int i = 2;
		int j;
		while(i < 10) {
			j = 1; // 여기에 초기화를 해야지만 j값이 9이후에 다시 1로 만들어줌
			System.out.println(i+"단 출력");
			while(j < 10) {
				System.out.println(i + " X " + j + " = " + (i*j));
				j++;
			}
			System.out.println("");
			i++;
		}
		
		Scanner sc = new Scanner(System.in);
		int a = 1;
		System.out.print("몇단을 출력하시겠습니까 : ");
		int b = sc.nextInt();
		var c = true;
		while(c == true) {
			if(b < 2 || b > 9) {
				System.out.println("잘못된 입력입니다. 다시 입력하여주십시오");
				System.out.print("몇단을 출력하시겠습니까 : ");
				b = sc.nextInt();
			} else {
				sc.close();
				System.out.println(b + "단 출력");
				while(a < 10) {
					System.out.println(b + " X " + a + " = " +(a*b));
					a++;
					if(a > 9) {
						c = false;
					}
				}
			}
		}
		
		// 피보나치 수열 -> 0 1 1 2 3 5 8 13 ...
		int a = 0, b = 1, c = 1; // a = 초항, b = 두번째항 , c = 뒤에항 + 그 앞에 항
		while(c < 100) {
			System.out.println(a + " + " + b + " = " + c); 
			a = b;
			b = c;  
			c = a+b;
		}
			
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 a를 입력하시오 : ");
		int a = sc.nextInt();
		while(a != 0) {
			System.out.println("a는 : " + a);
			System.out.print("새로운 정수 a를 입력하시오 : ");
			a = sc.nextInt();
			if(a == 0) {
				System.out.println("0이 입력되었습니다.\n프로그램 종료을 종료합니다.");
				break;
			}
		}
		*/
	}
}
