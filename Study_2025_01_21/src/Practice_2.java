import java.util.*;
import java.io.*;

public class Practice_2 {
	public static void main(String[] args) {
		/*
		// 2 ~ 100까지의 소수 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("몇까지의 소수를 구하시겠습니까? : ");
		int n = sc.nextInt();
		System.out.print("소수 출력: ");
		for(int i = 2; i <=n; i++) {
			if(i == 2 ) {
				System.out.print(i + ",");
			} else {
				for(int j = 2; j < i; j++) {
					if(i % j == 0) {
						break;
					}
					if(j == i-1) {
						System.out.print(i + ",");
					}
				}
			}
		}
		sc.close();
		*/
		/*
		// 위에 코드를 ArrayList로 변환해서 출력한 코드
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> prnArl = new ArrayList<>(); // 소수인것을 집어넣을 리스트
		ArrayList<Integer> nprArl = new ArrayList<>(); // 소수가 아닌 것을 집어 넣을 리스트
		
		System.out.print("몇까지의 소수를 구하시겠습니까? : ");
		int n = sc.nextInt();
		int psum = 0; // 소수의 총합
		int npsum = 0; // 소수가 아닌 값들의 총합
		for(int i = 2; i <=n; i++) {
			if(i == 2 ) {
				prnArl.add(i);
				psum += i;
			} else {
				for(int j = 2; j < i; j++) {
					if(i % j == 0) {
						nprArl.add(i);
						npsum += i;
						break;
					}
					if(j == i-1) {
						prnArl.add(i);
						psum += i;
					}
				}
			}
		}
		sc.close();
		System.out.print("소수 출력: ");
		System.out.print(prnArl);
		System.out.println();
		System.out.println("소수의 총합: " + psum);
		System.out.print("소수가 아닌 값 출력: ");
		System.out.println(nprArl);
		System.out.println("소수가 아닌 값들의 총합: " + npsum);
		*/
		
		/*
		Scanner s1 = new Scanner(System.in); // 정수를 입력하기 위한 스캐너
		System.out.print("몇칸 짜리 배열을 생성하시겠습니까? : ");
		int index = s1.nextInt(); // 배열에 index를 입력받아 index 변수에 저장
		int[] arr = new int[index]; // index값을 배열의 크기로 하는 배열 생성
		int temp = 0; // 값 변경할 때 사용할 temp변수
		
		// 배열 선언
		for(int i = 0; i < index; i++) {
			System.out.print("값을 입력하세요 : ");
			 arr[i] = s1.nextInt();
		}
		
		// 배열 비교를 위한 출력
		System.out.print("배열 정렬 전: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// 배열 정렬 알고리즘
		for(int i = 0; i < index-1; i++) {
			for(int j = i+1; j < index; j++ ) {
				if(arr[i] > arr[j]) { // 두 값을 변경하기 위한 알고리즘
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} 
			}
		}
		
		// 배열 정렬 후 배열 출력
		System.out.println();
		System.out.print("배열 정렬 후: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// Arrays.sort 이용해서 배열 정렬 및 Arrays.toString()으로 출력
		System.out.println();
		System.out.print("배열 정렬 후2 : ");
		int[] arr1 = {2,5,3,7,4};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		s1.close();
		*/
		String str1 = "hello";
		String str2 = "World";
		System.out.println(str1.compareTo(str2));
	}	
}
