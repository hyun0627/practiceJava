import java.util.*;
import java.io.*;

public class Parctice_2025_01_14 {
	public static void main(String[] args) throws IOException{ 
		
		/*
		// 정수a를 입력받고 if - else if - else문을 사용하여 a가 어떤 수 인지 체크하는 코드
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 a를 입력하시오: ");
		int a = sc.nextInt();
		sc.close();
		if(a > 0) {
			System.out.println(a + "는(은) 양수입니다.");
		} else if(a < 0) {
			System.out.println(a + "는(은) 음수입니다.");
		} else {
			System.out.println(a + "는(은) 0입니다.");
		} System.out.println("프로그램 종료");
		
		// if - else if - else문 체험 2
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 a를 입력하세요 : ");
		int a = sc.nextInt();
		sc.close();
		if(a % 2 == 0) {
			System.out.println(a + "는(은) 2의 배수입니다.");
		} else if(a % 3 == 0) {
			System.out.println(a + "는(은) 3의 배수입니다."); 
		} else if(a % 5 == 0) {
			System.out.println(a + "는(은) 5의 배수입니다.");
		} else if(a % 7 == 0 ) {
			System.out.println(a + "는(은) 7의 배수입니다.");
		} else {
			System.out.println(a + "는(은) 2,3,5,7의 배수가 아닙니다.");
		}
		
		// if - else if - else문 체험 3
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		int grade = sc.nextInt();
		sc.close();
		if(grade == 100) {
			System.out.println("성적은: A+");
		} else if(grade >= 90 && grade < 100) {
			System.out.println("성적은 A");
		} else if(grade >= 80 && grade < 90) {
			System.out.println("성적은 B");
		} else if(grade >= 70 && grade < 80) {
			System.out.println("성적은 C");
		} else if(grade >= 60 && grade < 70) {
			System.out.println("성적은 D");
		} else {
			System.out.println("성적은 F");
		}
		*/
		/*
		// 달을 입력받아 몇일까지 있는지 혹은 윤달인지 확인하는 코드(if elseif else문 체험4)
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 달을 입력하세요 : ");
		int month = sc.nextInt();
		sc.close();
		if(month > 12 || month <= 0) {
			System.out.println(month + "월은 존재하지 않습니다.");
		} else {
			if(month == 2) {
				System.out.println(month + "월은 28일 또는 29일까지 있는 윤달입니다. ");
			} else if(month == 4 || month == 6 || month == 9 || month == 11) {
				System.out.println(month + "월은 30일까지 있습니다.");
			} else {
				System.out.println(month + "월은 31일까지 있습니다.");
			}
		}
		*/
		/*
		// while문을 이용해서 달에 해당하는 월을 입력받기 전까지 계속 반복
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 달을 입력하세요 : ");
		int month = sc.nextInt();
		while(month > 12 || month <= 0) {
			System.out.print(month + "월은 존재하지 않습니다. 다시 입력하세요.\n");
			System.out.print("원하는 달을 입력하세요 : ");
			month = sc.nextInt();
			if(month > 0 && month < 13) {
				break;
			}	
		}
		sc.close();
		if(month == 2) {
			System.out.println(month + "월은 28일 또는 29일까지 있는 윤달입니다. ");
		} else if(month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(month + "월은 30일까지 있습니다.");
		} else {
			System.out.println(month + "월은 31일까지 있습니다.");
		}
		
		// if-else if-else문 체험5 - 정수 a,b,c,를 입력받고 세 숫자를 비교 가장 큰수부터 출력한다.
		Scanner sc = new Scanner(System.in); 
		System.out.print("정수 a를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("정수 b를 입력하세요 : ");
		int b = sc.nextInt();
		System.out.print("정수 c를 입력하세요 : ");
		int c = sc.nextInt();
		sc.close();
		if(a < 0 || b < 0 || c < 0) {
			System.out.println("잘못된 값을 입력받았습니다. 다시 입력하세요.");
		} else {
			if(a == b && a== c) {
				System.out.println("max : " + a + " mid : " + b + " min : " + c);
			} else {
				if(a >= b && a >= c) {
					if(b > c) {
						System.out.print("max : " + a + " mid : " + b + " min : " + c);
					} else {
						System.out.print("max : " + a + " mid : " + c + " min : " + b);
					}
				} 
				if(b > a && b >= c) {
					if(a > c) {
						System.out.print("max : " + b + " mid : " + a + " min : " + c);
					} else {
						System.out.print("max : " + b + " mid : " + c + " min : " + a);
					}
				}
				if(c > a && c > b) {
					if(a > b) {
						System.out.print("max : " + c + " mid : " + a + " min : " + b);
					} else {
						System.out.print("max : " + c + " mid : " + b + " min : " + a);
					}
				}
			}			
		}
		
		// 12세 이하면 어린이 출력 13~19세 이하면 청소년 출력 20 ~ 65세 사이 장년 66세부터는 노년 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("귀하의 나이를 입력하십시오 : ");
		int age = sc.nextInt();
		sc.close();
		if(age < 0) {
			System.out.println("잘못입력되었습니다. 다시 입력 부탁드립니다.");
		} else if(age <= 12) {
			System.out.println("귀하는 어린이입니다.");
		} else if(age > 12 && age < 20) {
			System.out.println("귀하는 청소년입니다.");
		} else if(age > 19 && age < 66) {
			System.out.println("귀하는 장년입니다.");
		} else {
			System.out.println("귀하는 노인입니다.");
		} 
		*/
		Scanner sc = new Scanner(System.in);
		String datestr = "";
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		int month = 0;
		int day = 0;
		if(year < 1900 || year > 2025) {
			System.out.println("잘못된 입력입니다. 다시 입력하여주십시오.");
			System.exit(0);
		} else {
			System.out.print("월을 입력하세요 : ");
			month = sc.nextInt();
			if(month > 12 || month <= 0) {
				System.out.print("잘못된 입력입니다. 다시 입력하여주십시오.");
				System.exit(0);
			} else {
				System.out.print("일을 입력하세요 : ");
				day = sc.nextInt();
				if(day < 1 || day > 31) {
					System.out.print("잘못된 입력입니다. 다시 입력하여주십시오.");
					System.exit(0);
				}
			}
		}
		sc.close();
		datestr += year;
		if(month > 0 && month < 10) {
			datestr += "0" + month; 
		} else {
			datestr += month;
		}
		if(day > 0 && day < 10) {
			datestr += "0" + day;
		} else {
			datestr += day;
		}	
		System.out.println("입력하신 날짜는 : " + datestr + "입니다");
		
		//
	}
}
