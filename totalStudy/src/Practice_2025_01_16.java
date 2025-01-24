import java.util.*;
import java.io.*;

public class Practice_2025_01_16 { 
	public static void main(String[] args) throws IOException {
		/*
		// 실습 1 졸려.. / while문을 사용하고 값을 입력받아 값에 해당하는 구구단을 출력하는 코드 1
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
		
		// while문을 사용하고 값을 입력받아 값에 해당하는 구구단을 출력하는 코드 2
		Scanner sc = new Scanner(System.in);
		int a = 1;
		System.out.print("몇단을 출력하시겠습니까 : ");
		int b = sc.nextInt(); 
		while(b  < 2 || b > 9) {
			System.out.println("잘못된 입력입니다. 다시 입력하여주십시오");
			System.out.print("몇단을 출력하시겠습니까 : ");
			b = sc.nextInt();
		}
		System.out.println("");
		System.out.println(b + "단 출력");
		while( a < 10) {
			System.out.println(b + " X " + a + " = " +(a*b));
			a++;
			if(a > 9) {
				System.out.print("새로운 단수를 입력하시오: ");
				b = sc.nextInt();
				if(b < 2 || b > 9) {
					System.out.println("범위에 해당하지 않는 값이 입력되었습니다.");
					System.out.println("프로램을 종료합니다.");
					System.exit(0);
;				} else {
					System.out.println("");
					System.out.println(b + "단 출력");
					a = 1;
				}
			}
		}
		sc.close();
		
		// while - break 및 continue 기초연습1
		int x = 1;
		while(true) {
			System.out.println("x");
			x++;
			if(x == 10) {
				break;
			}
		}
		
		// while - break 및 continue 기초연습2
		int x = 1;
		while(x <= 9) {
			System.out.println(x);
			// 무한반복문
			if(x == 3) {
				continue;
			}
			x++;
		}
			
		// continue + break문 개인실험 1 -> 1부터 10까지 짝수의 합 출력
		int a = 0;
		int esum = 0; // 짝수의 합
		int osum = 0; // 홀수의 합
		while(a <= 10) {
			if(a % 2 == 0) {
				esum += a;
				a++;
				continue;
			} 
			osum += a;
			a++;
		}
		System.out.println("짝수의 합: " + esum);
		System.out.println("홀수의 합: " + osum);
		
		//while-continue, break문 실습 1 -> 1부터 9까지 print하는데 345는 제외해라
		int a = 0;
		while(a < 9) {
			a++;
			if(a >= 3 && a <= 5) {
				continue;	
			}
			System.out.println(a);
		}
		
		// 1부터 9까지 출력을 break문을 이용해서
		int x = 1;
		while(x <= 9) {
			switch(x) {
				case 3:
					x++;
					continue;
				case 4:
					x++;
					continue;
				case 5:
					x++;
					continue;
			}
			System.out.println(x);
			x++;
		}
		*/
		/*
		// while문 실습 - 첫줄에 * 둘째줄에는 ** 
		int x = 1;
		int y;
		while(x < 6) {
			y = 1;
			while(y <= x) {
				System.out.print("*");
				y++;
			}
			System.out.println("");
			x++;
		}
		*/
		/*
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();
		int i = 0;
        while (i < k) {
            int j = 1;
            while (j < k - i) {
                System.out.print(" ");
                j++;
            }
            j = 0;
            while (j < i + 1) {
                System.out.print("*");
                j++;
            }
            j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        // 역피라미드
		int x = 0;
		while(x < 6) {
			int y = 5;
			while(x < y) {
				System.out.print("*");
				y--;
			}
			if(x == 4) {
				break;
			}
			System.out.println();
			x++;
		}
		*/
		//while문의 조건을 모두 true로 쓴 상태로 2단부터 9단까지 구구단 출력
//		int a = 2;
//		while(true) {
//			int b = 1;
//			System.out.println(a + "단 출력");
//			while(true) {
//				if(b > 9) {
//					break;
//				}
//				System.out.println(a + " X " + b + " = " + (a*b));
//				b++;		
//			}
//			System.out.println();
//			if(a > 8) {
//				break;
//			}
//			a++;
//		}
//		
//		// 입력받은 특정 단 수만 출력
//		Scanner sc = new Scanner(System.in);
//		int x = 1;
//		System.out.print("몇단을 출력하시겠습니까 : ");
//		int y = sc.nextInt();
//		var z = true;
//		while(z == true) {
//			if(y < 2 || y > 9) {
//				System.out.println("잘못된 입력입니다. 다시 입력하여주십시오");
//				System.out.print("몇단을 출력하시겠습니까 : ");
//				y = sc.nextInt();
//			} else {
//				sc.close();
//				System.out.println(y + "단 출력");
//				while(x < 10) {
//					System.out.println(y + " X " + x + " = " +(x*y));
//					x++;
//					if(x > 9) {
//						z = false;
//					}
//				}
//				
//			}
//		}
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine() + " ");
//		var v = st.nextElement();
//		var b = st.nextElement();
//		
//		System.out.println(v);
//		System.out.println(b);
	}
}
