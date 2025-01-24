import java.io.*;
import java.util.*;

public class Practice_2025_01_13 { 
	public static void main(String[] args) throws IOException{
		
		/*
		// 비교 연산자 체험(정수 및 실수 비교)
		int a = 9;
		float b = 9.0f;
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		// 비교 연산자(문자열 비교) / 문자열이 영어와 한글 둘 다 가능
		String str1 = "안중근";
		String str2 = "Hello";
		System.out.println(str1.equals("안중근")); // 문자열 비교: .equals(문자열 또는 문자열을 저장해놓은 변수) 사용
		System.out.println(str1 == "안중근"); // 이것도 가능은 하지만 이것을 사용하기 보다는 위에 equals사용하기
		System.out.println(str1.equals(str2)); // str1과 str2를 비교
		System.out.println("안중근".equals(str2)); // 그냥 일반 문자열과 문자열 변수 비교
		// 결과 값의 반대를 출력하고 싶다면
		System.out.println(!str1.equals("안중근")); // 결과값을 출력해주는 코드 앞에 !추가
		
		// 문자열을 scanner로 입력받고 입력한 문자열이 하이미디어와 같은지 확인하는 코드
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		String name = sc.nextLine();
		sc.close();
		System.out.println(name.equals("하이미디어"));
		
		// 문자열을 입력받을때 BufferedReader를 이용해서 같은지 다른지 출력
		System.out.print("문자열을 입력하시오:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		System.out.println(st.equals("하이미디어"));
	
		// 정수 두개를 입력받아 비교연산자를 사용해서 두 숫자를 비교하는 코드
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하시오: ");
		int a = sc.nextInt();
		System.out.print("두번째 정수를 입력하시오: ");
		int b = sc.nextInt();
		sc.close();
		System.out.println(a + "가 " + b + "보다 큰가요? -> " + (a>b));
		System.out.println(a + "가 " + b + "보다 작은가요? -> " + (a<b));
		System.out.println(a + "가 " + b + "보다 크거나 같나요? -> " + (a>=b));
		System.out.println(a + "가 " + b + "보다 작거나 같나요 -> " + (a<=b));
		System.out.println(a + "와 " + b + "이 같나요?  -> "+ (a==b));
		System.out.println(a + "와 " + b + "이 다른가요 -> " + (a!=b));
		
		int a = 3, b = 5, c = 7;
		System.out.println(a < c && a < b); // a가 c보다 작고(참) a가 b보다도 작다.(참) -> 둘다 참이므로 true
		System.out.println(a < b && a > c); // a가 b보다 작고(참) a가 c보다 크다(거짓) -> 하나가 거짓이므로 false
		System.out.println(a < c || a < b); // a가 c보다 작고(참) a가 b보다도 작다.(참) -> 둘다 참이므로 true
		System.out.println(a < b || a > c); // a가 b보다 작고(참) a가 c보다 크다(거짓) -> 하나가 참이므로 true
		System.out.println(a > b || a > c || b < c); // a가 b보다 크고(거짓) a가 c보다 크고(거짓) b가 c보다 작으므로 -> 하나가 참이므로 true
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a값을 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("b값을 입력하세요 : ");
	    int b = sc.nextInt();
	    System.out.print("c값을 입력하세요 : ");
	    int c = sc.nextInt();
	    sc.close();
	    System.out.print("a < b || a < c => ");
	    System.out.print(a < b || a< c);
	    
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 a를 입력하세요 : ");
		int a = sc.nextInt();
		sc.close();
		if(a > 3) { System.out.print("a는 " + a + "이므로 a는 3보다 크다. \n");}
		System.out.println("end");
		
		
		// 정수를 Scanner로 입력받아 2의 배수인지 아닌지 출력하는 코드
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int a = sc.nextInt();
		sc.close();
		if(a % 2 == 0) { System.out.print(a + "는 2의 배수입니다.\n");}
		else if(a % 2 == 1) {System.out.println("end");}
		
		// BufferedReader를 이용해서 2의 배수인지 아닌지 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수를 입력하세요: ");
		int b = Integer.parseInt(br.readLine());
		if(b % 2 == 0) { System.out.println(b + "는 2의 배수입니다.");}
		System.out.println("end");
		
		// 이름을 입력받고 그 이름이 홍길동이면 if문 출력하고 아니면 프로그램 종료하는 코드
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		if(name.equals("홍길동")) {
			System.out.println("이름은 홍길동입니다.");
		} 
		System.out.println("프로그램 종료");

		// 핸드폰 번호를 입력받아 같은지 아닌지 출력하는 프로그램(핸드폰 번호를 String으로 입력받는 경우)
		System.out.print("핸드폰 번호를 입력하세요 : ");
		String mobile = sc.nextLine();
		if(mobile.equals("010-4444-5555")) {
			System.out.println("번호는 010-4444-5555입니다.");
		}
		System.out.println("프로그램 종료");
		
		// 핸드폰 번호를 int로 입력받아 비교하는 경우
		System.out.print("핸드폰 번호를 입력하세요 : ");
		int phonen = sc2.nextInt();
		sc.close();
		sc2.close();
		if(phonen == 44445555) {
			System.out.println("번호는 010-4444-5555입니다.");
		}
		System.out.println("프로그램 종료");
		
		// if-else문 체험1
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		sc.close();
		if(name.equals("홍길동")) {
			System.out.println("이름은 홍길동 입니다.");
		} else {
			System.out.println("이름은 홍길동이 아닙니다.");
		} System.out.println("프로그램 종료");
		
		// if-else문을 이용해서 정수a를 입력받고 a가 5의 배수인지 아닌지 확인하는 코드
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 a를 입력하시오 : ");
		int a = sc.nextInt();
		sc.close();
		if(a % 5 == 0) {
			System.out.println("정수 " + a + "은 5의 배수 입니다.");
		} else {
			System.out.println("정수 " + a + "은 5의 배수가 아닙니다.");
		} 
		System.out.println("프로그램 종료");
		
		// 정수 두개를 입력받고 b가 a의 배수이면 b는 a의 배수입니다 출력
		// b가 a의 배수가 아니라면 b는 a의 배수가 아닙니다 출력	
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 a를 입력하시오 : ");
		int a = sc.nextInt();
		System.out.print("정수 b를 입력하시오 : ");
		int b = sc.nextInt();
		sc.close();
		if(a == 0 || b == 0) {
			System.out.println("0의 배수는 존재하지 않습니다.");
		} else {
			if(b % a == 0) {
				System.out.println(b + "은 " + a + "의 배수입니다.");
			} else {
				System.out.println(b + "은 " + a + "의 배수가 아닙니다.");
			}
		}
		System.out.println("프로그램 종료");
		
		// 위 문제를 BufferedReader로 해결한 코드
		System.out.print("정수 두개를 입력하시오 : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		if(b % a == 0) {
			System.out.println(b + "은 " + a + "의 배수입니다.");
		} else {
			System.out.println(b + "은 " + a + "의 배수가 아닙니다.");
		} 
		System.out.println("프로그램 종료");
		br.close();
		*/
	}
}