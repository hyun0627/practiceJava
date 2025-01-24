import java.util.*;
import java.io.*;

public class Practice_2025_01_20 {
	public static void main(String[] args) throws IOException { 
		
		// 20일 실습1_문자열 배열 생성 및 값 입력
//		int i = 0; // 값 입력할 때 반복문에서 쓸 변수
//		int index = 0;
//		Scanner sc1 = new Scanner(System.in); // index값을 입력받을 메소드
//		Scanner sc2 = new Scanner(System.in); // 배열에 넣을 값을 입력받을 메소드
		
//		System.out.print("인덱스 값을 입력하세요 : "); // index 값 입력
//		index = sc1.nextInt(); // index 값 저장
//		String[] strArr = new String[index]; // 입력한 index값으로 문자열 배열 생성
//		
//		// while문을 이용해서 배열에 값 입력
//		while(i < strArr.length) {
//			System.out.print("배열에 넣을 이름을 입력하세요 : ");
//			String name = sc2.nextLine();
//			if(name.equals(" ")) { //입력값이 공백이면 while문을 멈추는 코드
//				break;
//			}
//			strArr[i] = name; // 배열에 값 입력
//			i++;
//		}
//		i = 0; // 다시 while문을 써야 하기 때문에 0으로 초기화
//		System.out.print("배열 출력: ");
//		while(i < strArr.length) {
//			System.out.print(strArr[i] + " "); // 배열 출력
//			i++;
//		}
//		sc1.close(); // 정수를 저장하기 위해 사용한 스캐너 종료
//		sc2.close(); // 문자열을 저장하기 위해 사용한 스캐너 종료
		
		// 실습2_정수 배열 생성 후 안에 값이 10~50까지 자동으로 들어가도록
//		int index = 0; // 배열의 index값 저장을 위한 변수
//		int i = 0; // while문 사용할 때 조건으로 쓸 변수
//		Scanner sc = new Scanner(System.in);
//		
//		// 배열 선언 및 생성
//		System.out.print("index값을 입력하시오 : ");
//		index = sc.nextInt();
//		int[] nArr = new int[index]; // 입력받은 index값을 길이로 하는 배열 생성
//		
//		// 배열 값 저장 및 출력
//		System.out.print("배열 값 출력: ");
//		while(i < nArr.length) {
//			nArr[i] = (i + 1) * 10; // 배열 값 저장
//			//nArr[i] = (i * 10) + 10; // 위에 것도 가능하고 이 코드도 가능함
//			System.out.print(nArr[i] + "\t"); // 배열 출력
//			i++;
//		}
//		sc.close(); // 스캐너 종료
		
		// 실습3_
//		ArrayList<String> strAl = new ArrayList<>(); // 배열 선언
//		Scanner sc = new Scanner(System.in); // 문자열 값을 입력할 스캐너 선언
//		Scanner sc2 = new Scanner(System.in); // 정수 값을 입력할 스캐너 선언
//		String name; // 이름을 입력할 변수
//		String rename; // 바꿀 이름을 저장할 변수
//		int index = 0; // index값으로 찾을 때 저장하기 위한 변수
//		int i = 0; // while문을 사용하기 위해 선언한 변수
//		
//		// 값 입력 및 list에 저장
//		while(true) {
//			System.out.print("이름을 입력하시오 : ");
//			name = sc.nextLine();
//			if(name.equals("")) { // 빈칸이 입력되면 종료되는 코드
//				System.out.println("빈칸이 입력되었습니다. 입력을 종료합니다.");
//				break;
//			}
//			strAl.add(name); // list에 값 저장
//		}
//		
//		// 1차 배열 출력
//		i = 0;
//		System.out.println();
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		System.out.print("배열 출력 : ");
//		while(i < strAl.size()) { 
//			System.out.print(strAl.get(i) + " "); // 값 출력
//			i++;
//		}
//		System.out.println();
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		
//		// 이름 바꾸기 1 - 인덱스 값으로 변경
//		i = 0;
//		System.out.println("");
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		System.out.print("index값을 입력하시오 : ");
//		index = sc2.nextInt();
//		System.out.print("index에 해당하는 값을 무엇으로 바꾸시겠습니까? : ");
//		name = sc.nextLine(); // 바꿀 이름을 입력
//		while(i < strAl.size()) {
//			if(i == index) {
//				System.out.println("바뀌기 전: " + strAl.get(i));
//				strAl.set(i, name); // 값을 변경
//				System.out.println("바뀌기 후: " + strAl.get(i));
//				break;
//			}
//			i++;
//		}
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		
//		// 이름 바꾸기 2 - 값을 비교해서 변경
//		i = 0;
//		System.out.println();
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		System.out.print("또 바꾸고 싶은 이름을 입력하세요 : ");
//		name = sc.nextLine();
//		System.out.print("바꿀 이름을 입력하세요 : ");
//		rename = sc.nextLine();
//		while(i < strAl.size()) { // 반복문을 돌면서 입력값을 찾고 발견하면 rename으로 변경 후 break
//			if(strAl.get(i).equals(name)) { // 문자열 비교는 equals 사용!!!!
//				strAl.set(i, rename);
//				break;
//			}
//			i++;
//		}
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		
//		// 인덱스 값으로 제거
//		i = 0;
//		System.out.print("index값을 입력하시오 : ");
//		index = sc2.nextInt();
//		while(i < strAl.size()) {
//			if(i == index) { // i가 입력받은 index라면 제거
//				strAl.remove(i);
//				break;
//			}
//			i++;
//		}
//		
//		// 값을 찾아서 제거
//		i = 0;
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		System.out.print("제거하고 싶은 값의 이름을 입력하시오 : ");
//		name = sc.nextLine();
//		while(i < strAl.size()) {
//			if(strAl.get(i).equals(name)) { // 반복문을 도는 동안 값을 찾고 발견하면 그에 해당하는 index 값을 제거
//				strAl.remove(i);
//				break;
//			}
//			i++;
//		}
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		
//		sc.close();
//		sc2.close();
//		
//		// 배열 값 출력
//		i = 0;
//		System.out.println();
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		System.out.print("배열 출력 : ");
//		while(i < strAl.size()) {
//			System.out.print(strAl.get(i) + " "); // 배열 출력
//			i++;
//		}
//		System.out.println();
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		// 실습4_리스트 두개 선언 후 출력
//		String name = ""; // 이름을 저장할 변수
//		String yon = ""; // 예 아니오를 저장할 변수
//		int age = 0; // 나이를 저장할 변수
//		int index = 0; // index값을 저장하기 위한 변수
//		Scanner s1 = new Scanner(System.in); // 문자열을 입력할 스캐너
//		Scanner s2 = new Scanner(System.in); // 정수를 입력할 스캐너
//		ArrayList<String> naArr = new ArrayList<>(); // 이름을 저장할 리스트
//		ArrayList<Integer> ageArr = new ArrayList<>(); // 나이를 저장할 리스트
//		
//		// 리스트에 값 입력
//		while(true) {
//			System.out.print("이름을 입력하세요 : ");
//			name = s1.nextLine();
//			if(name.equals("")) { // 입력값이 빈칸이면 break
//				break;
//			} else {
//				System.out.print("나이를 입력하세요 : ");
//				age = s2.nextInt();
//				if(age < 1 || age > 150) { // 나이가 1살 미만 150살 초과일경우에 break;
//					break;
//				}
//			}
//			naArr.add(name);
//			ageArr.add(age);
//		}
//		System.out.println("ㅡㅡㅡㅡㅡㅡ입력을 종료합니다.ㅡㅡㅡㅡㅡㅡ");
//		
//		// 리스트 출력
//		System.out.println();
//		System.out.println("ㅡㅡㅡㅡㅡㅡ배열 출력ㅡㅡㅡㅡㅡㅡ");
//		for(int j = 0; j < naArr.size(); j++) {
//			System.out.println("|Index." + j + "\t\t\t     |" );
//			System.out.println( "|이름: " + naArr.get(j) + " 나이: " + ageArr.get(j) + "\t\t     |");
//		}
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ ㅡㅡㅡㅡㅡㅡㅡㅡ");
//		System.out.println();
//		
//		// 리스트 값 수정
//		System.out.print("리스트를 수정하시겠습니까? : ");
//		yon = s1.nextLine();
//		if(yon.equals("예")) {
//			System.out.print("나이 값을 변경하시겠습니까? 이름을 변경하시겠습니까?");
//			yon = s1.nextLine();
//			if(yon.equals("이름")) {
//				System.out.print("찾고 싶은 이름을 입력하세요 : ");
//				name = s1.nextLine();
//				for(int j = 0; j < naArr.size(); j++) {
//					if(naArr.get(j).equals(name)) {
//						index = j; // 찾고 싶은 이름의 index값을 저장해놓고 삭제하거나 변경하기
//						break;
//					}
//				}
//				System.out.print("어떤 값으로 변경하시겠습니까? : ");
//				name = s1.nextLine();
//				naArr.set(index, name);
//				
//			} else if(yon.equals("나이")) {
//				System.out.print("누구의 나이를 변경하시겠습니까? : ");
//				name = s1.nextLine();
//				for(int j = 0; j < naArr.size(); j++) {
//					if(naArr.get(j).equals(name)) {
//						index = j; // 찾고 싶은 이름의 index값을 저장해놓고 삭제하거나 변경하기
//						break;
//					}
//				}
//				System.out.print("어떤 값으로 변경하시겠습니까? : ");
//				age = s2.nextInt();
//				ageArr.set(index, age);
//			}
//			
//		}
//		System.out.print("값을 제거하시겠습니까? : ");
//		yon = s1.nextLine();	
//		if(yon.equals("예")) {
//			System.out.print("Index값으로 제거하시겠습니까? : ");
//			yon = s1.nextLine();
//			if(yon.equals("예")) {
//				System.out.print("몇번 인덱스를 없애시겠습니까? : ");
//				index = s2.nextInt();
//				naArr.remove(index);
//				ageArr.remove(index);
//			} else {
//				System.out.print("누구의 값을 제거하시겠습니까? : ");
//				name = s1.nextLine();
//				for(int j = 0; j < naArr.size(); j++) {
//					if(naArr.get(j).equals(name)) {
//						naArr.remove(j);
//						ageArr.remove(j);
//						break;
//					}
//				}
//			}
//		}
//		s1.close();
//		s2.close();
//		System.out.println();
//		System.out.println("ㅡㅡㅡㅡㅡㅡ배열 출력ㅡㅡㅡㅡㅡㅡ");
//		for(int j = 0; j < naArr.size(); j++) {
//			System.out.println("|Index." + j + "\t\t\t     |" );
//			System.out.println( "|이름: " + naArr.get(j) + " 나이: " + ageArr.get(j) + "\t\t     |");
//		}
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ ㅡㅡㅡㅡㅡㅡㅡㅡ");
//		System.out.println();
		
	} 
}
