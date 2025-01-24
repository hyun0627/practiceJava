import java.util.*;
import java.io.*;
 
public class Practice_2025_01_17 {
	public static void main(String[] args) throws IOException {
		
		//배열 실습1
		// 배열 선언 및 입력 방법1
//		int[] s1 = null;
//		s1 = new int[] { 76,84,72,96,100 };
//		
//		// 배열 선언 및 입력 방법2
//		int[] s2 = new int[5];
//		s2[0] = 72;
//		s2[1] = 89;
//		s2[2] = 70;
//		s2[3] = 94;
//		s2[4] = 100;
//		
//		// 배열 출력 방법1
//		int i = 0;
//		int j = 0;
//		System.out.print("배열 s1출력: ");
//		while(i < 5) {
//			System.out.print(s1[i] + " ");
//			i++;
//		}
//		System.out.println();
//		System.out.print("배열 s2출력: ");
//		while(j < 5) {
//			System.out.print(s2[j] + " ");
//			j++;
//		}
//		
//		// 배열 출력 방법2
//		System.out.print("배열 s1출력: ");
//		System.out.print(Arrays.toString(s1));
		
		// 문자열 배열 선언 및 값 입력 그리고 출력
//		String[] n1 = null;
//		n1 = new String[] {"철수","영미","짱구","훈이", "맹구" };
//		
//		String[] n2 = new String[5];
//		n2[0] = "철수";
//		n2[1] = "영미";
//		n2[2] = "짱구";
//		n2[3] = "훈이";
//		n2[4] = "맹구";
//		
//		System.out.print("배열 n1 출력: ");
//		System.out.print(Arrays.toString(n1));
//		System.out.println();
//		
//		int i = 0;
//		System.out.print("배열 n2 출력: ");
//		while(i < 5) {
//			System.out.print(n2[i] + " ");
//			i++;
//		}
		
		//index값과 배열 안 값을 모두 입력받아 출력하는 코드
//		Scanner s1 = new Scanner(System.in); // index 저장을 위한 스캐너
//		Scanner s2 = new Scanner(System.in); // 배열 안에 넣을 값을 저장하기 위한 스캐너
//		String[] arr = null;
//		int i = 0 , j = 0;
//		System.out.print("index값을 입력하시오 : ");
//		int index = s1.nextInt();
//		arr = new String[index];
//		while(i < index) {
//			System.out.print("이름을 입력하시오 : ");
//			arr[i] = s2.nextLine();
//			i++;
//		}
//		while(j < arr.length) {
//			System.out.print(arr[j] + " ");
//			j++;
//		}
//		s1.close();
//		s2.close();
//		System.out.println();
//		System.out.println("배열 arr : " + Arrays.toString(arr));

		// 배열 실습 3 -> 점수 입력받아 총점과 평균 출력
//		Scanner sc = new Scanner(System.in);
//		int sum = 0, i = 0; // 출력해야하는 총점(sum)과 반복하기 위한 변수i 선언
//		double avg = 0; // 평균을 저장하는 변수
//		int[] arr = null;
//		System.out.print("몇명의 점수를 입력하시겠습니까? : "); // 몇명의 점수를 입력받을 건지 입력
//		final int index = sc.nextInt(); // 변하지 않는 상수는 final 선언
//		arr = new int[index]; // 입력받은 index만큼의 길이를 가진 배열 선언
//		while(i < index ) {
//			// 점수 입력
//			System.out.print((i+1) + "번째 점수를 입력하시오 : ");
//			arr[i] = sc.nextInt();
//			sum += arr[i]; // 총점 계산
//			i++;
//		}
//		avg = (double)sum / index; // 평균 계산
//		sc.close();
//		// 배열 값 + 총점 + 평균 출력
//		System.out.println();
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ점수 입력 끝!ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		System.out.println();
//		System.out.println("모든점수 출력: " + Arrays.toString(arr));
//		System.out.println("총점: " + sum);
//		System.out.printf("평균: " + "%.1f" , avg);
		
		// 다차원 배열 연습
//		int k = 1;
//		int[][] arr = new int[3][5]; // 다 차원 배열 생성
//		// 배열에 값 넣기
//		for(int i = 0; i < 3; i ++) {
//			for(int j = 0; j < 5; j++) {
//				arr[i][j] = k;
//				k++;
//			}
//		}
//		// 배열 출력
//		for(int i = 0; i < 3; i ++) {
//			System.out.print((i+1) + "번째 배열 출력 : ");
//			for(int j = 0; j < 5; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
//		System.out.println(Arrays.deepToString(arr));
		/*
		// ArrayList 연습1 -> 점수를 입력받고 출력
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> as = new ArrayList<>();
		int i = 0; // index
		int n = 0; // 입력받을 숫자
		
		// list에 값 넣기
		while(true) {
			System.out.print("숫자를 입력하시오 : ");
			n = sc.nextInt();
			if(n < 0 || n > 100) {
				break;
			}
			as.add(n);
		}
		// list 출력
		System.out.print("점수 : ");
		while(i < as.size()) {
			System.out.print(as.get(i) + "\t");
			i++;
		}
		System.out.println();
		// list에서 값 찾고 제거
		i = 0;
		System.out.print("바꾸고 싶은 값을 입력하시오 : ");
		n = sc.nextInt();
		while(i < as.size()) {
			if(as.get(i) == n) {
				System.out.print("바꿀 값을 입력하시오 : ");
				n = sc.nextInt();
				as.set(i, n);
				break;
			}
			i++;
		}
		// list에서 값 찾고 제거
		i = 0;
		System.out.print("삭제하고 싶은 값을 입력하시오 : ");
		n = sc.nextInt();
		while(i < as.size()) {
			if(as.get(i) == n) {
				as.remove(i);
				break;
			}
			i++;
		}
		// 마지막 출력
		i = 0;
		int sum = 0;
		while(i < as.size()) {
			System.out.print(as.get(i) + "\t");
			sum += as.get(i);
			i++;
		}
		sc.close();
		System.out.println();
		System.out.println("총점: " + sum);
		System.out.printf("평균: " + "%.1f" , (double) sum / as.size());
		*/
		
		// 히히 실험
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		ArrayList<Integer> arr = new ArrayList<>();
//		int sum = 0;
//		for(int k = 0; k < 3; k++) {
//			System.out.print("점수를 입력하세요 : ");
//			arr.add(Integer.parseInt(br.readLine()));
//		}
//		System.out.print("점수 : ");
//		for(int i = 0; i < arr.size(); i++) {
//			System.out.print(arr.get(i) + "\t");
//			sum += arr.get(i);
//		}
//		System.out.println();
//		System.out.println("총합 : " + sum);
//		System.out.printf("평균 : " + "%.1f", (double) sum / arr.size());
				
	}
}
