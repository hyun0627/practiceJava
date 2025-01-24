import java.util.*;
import java.io.*;
import java.math.*;

public class Pratice_2025_01_10 { 
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		int a = 10; 
		int b = 7;
		
		int c = a+b; // 덧셈
		int d = a-b; // 뺄셈
		int e = a*b; // 곱하기
		int x = a/b; // 나누기(몫을 출력)
		int y = a%b; // 나누기(나머지 출력)
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(x);
		System.out.println(y);
		*/
		
		/* 
		// 1부터 10까지의 합 
		int a = 1+2+3+4+5+6+7+8+9+10; // 1부터 10까지의 합을 덧셈으로만 출력
		int b = (1+10)*5;  // 1부터 10까지의 합을 곱셈을 이용해서 출력
		System.out.println(a);
		System.out.println(b);
		
		// 1부터 10까지의 합을 반복문을 이용해서 출력
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		*/
		
		/*
		// 1부터 10까지의 곱
		int a = 1*2*3*4*5*6*7*8*9*10; // 1부터 10까지의 곱을 수기로 출력
		System.out.println(a);
		
		// 1부터 10까지의 곱을 반복문을 이용해서 출력
		int sum = 1;
		for(int i = 1; i <= 10; i++) {
			sum *= i;
		}
		System.out.println(sum);
		*/
		
		/*
		// 몇일 살았는지 확인하는 과제
		int a = (2024-2000) * 365;
		System.out.println(a);
		*/
		
		/*
	    // 사칙연산 우선순위 확인하기 위한 과제
		double a = 24/3 + 2*5 - 3%2;
		double b = (3 + 5) - 1*2 + 3/2;
		System.out.println(a);
		System.out.println(b);
		*/
		
		/*
		// 방정식의 근을 구하는 코드(이때 a = 1, b = -3, c = 2)
		int x1, x2;
		int a = 1;
		int b = -3;
		int c = 2;
		
		x1 = (int)((-1 * b + Math.sqrt(b*b -(4*a*c))) / (2*a));
		x2 = (int)((-1 * b - Math.sqrt(b*b -(4*a*c))) / (2*a));
		System.out.println("X1 = " + x1 +"       "+ " X2 = " + x2);
		*/
		
		/*
		// 99줄 코드를 bufferedReader로
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		System.out.println("원금과 이자율과 햇수를 입력하세요");
		st = new StringTokenizer(br.readLine() + " ");
		int p = Integer.parseInt(st.nextToken());
		double r = Double.parseDouble(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		System.out.println("원금은 : " + p/10000 + "만원\n" + "이자율은 : " + (int)r + "%\n" + "햇수: " + y + "년\n" + 
		                       "그러므로 총액은: " + ((int)(p *Math.pow((1 + r/100), y)))/10000 + "만원");
		*/
		
		/*
		// 원금과 이자율을 햇수를 입력하여 총 돈이 얼마가 나오는지 확인하는 코드
		Scanner sc = new Scanner(System.in);
		System.out.print("원금을 입력하시오 : ");
		int p = sc.nextInt();
		System.out.print("이자율을 입력하시오 : ");
		double r = sc.nextInt();
		System.out.print("햇수를 입력하세요 : ");
		int y = sc.nextInt();
		
		System.out.println("원금은: " + p/10000 + "만원\n + "   이자율은:  "+ (int)r + "%\n + "   햇수는: " + y + "년\n");
		
	    int rich; // 총 돈
		double pow = Math.pow((1+ (r/100)), y);
		rich = (int) (p * pow);
		System.out.println("그러므로 총액은 : " + (rich/10000) + "만원");
		*/
		
		/*
		// 구구단을 hard coding이 아닌 다른 방식으로 
		// case 1
		int x = 1;
		int a = 9;
		System.out.println("9 X " + x + " = " + 9*1);
		x = 2;
		System.out.println("9 X " + x + " = " + 9*2);
		x = 3;
		System.out.println("9 X " + x + " = " + 9*x);
		x += 1;
		System.out.println(a + " X " + x + " = " + a*x);
		x += 1;
		System.out.println(a + " X " + x + " = " + a*x);
		x++;
		System.out.println(a + " X " + x + " = " + a*x);
		x++;
		System.out.println(a + " X " + x + " = " + a*x);
		x++;
		System.out.println(a + " X " + x + " = " + a*x);
		x++;
		System.out.println(a + " X " + x + " = " + a*x);
		
		// case2
		for(int i = 1; i < 10; i ++) {
			System.out.println(a + " X " + i + " = " + a*i);
		}
		
		// case3
		int i = 1;
		while(i < 10) {
			System.out.println(a + " X " + i + " = " + a*i);
			i++;
		}
		*/
		
		/*
		// 전위 및 후위연산자 a++ , ++a
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = sc.nextInt();
		System.out.println(b + " X " + (++a) + " = " + a*b);
		System.out.println(b + " X " + (++a) + " = " + a*b);
		System.out.println(b + " X " + (++a) + " = " + a*b);
		System.out.println(b + " X " + (++a) + " = " + a*b);
		System.out.println(b + " X " + (++a) + " = " + a*b);
		System.out.println(b + " X " + (++a) + " = " + a*b);
		System.out.println(b + " X " + (++a) + " = " + a*b);
		System.out.println(b + " X " + (++a) + " = " + a*b);
		System.out.println(b + " X " + (++a) + " = " + a*b);
		*/
		
	}

}
