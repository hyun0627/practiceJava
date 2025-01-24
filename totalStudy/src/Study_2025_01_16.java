public class Study_2025_01_16 {
	public static void main(String[] args) {  
	
		/*2025_1월_16일 필기
		 * while문 안에서 쓸 수 있는 것 
		 * 1. break 
		 * - while문 안에 있는 if문에서 break하더라도 while문 종료시킴
		 * 2. continue;
		 * - while문 안에 있는 if문에서 continue쓰면 다시 while문의 조건문으로 돌아감
		 * 이때 break문과 continue문은 자기가 속해있는 가장 가까운 while문에 영향을 끼침
		 * 
		 * 2025_1월_17일 필기
		 * 1.배열
		 * 1-1. 정의 : 이름이 같은 index로 구분되는 여러개의 변수
		 *                            -> index 시작은 0
		 * 1-2. 선언 : int[] arr = new int[index]; 또는 int[] arr = null; arr = new int[index];
		 *               int arr[] = new int[index];
		 * 1-3. 값 입력: arr[0] = x; arr[1] = y; / arr = new int[] { x, y, z }; << 이 방법은 int[] arr = null;로 초기화 해놓고 입력하는 방식
		 * 
		 * 2. 다차원배열
		 * 2-1. 정의 : int[][] arr = new int[3][5] <- 가로로 5칸 세로로는 3줄짜리 배열 생성, 앞에 숫자가 줄 뒤에 숫자가 칸
		 *               int[][][] arr = new int[5][3][2] <- 여러 차원의 배열이 가능하나 보통 주로 쓰이는 것은 2차원
		 * 3. ArrayList
		 * 3-1. 선언 : ArrayList<Integer> al = new ArrayList<>();
		 *               ArrayList<String> al = new ArrayList<String>(); // 뒤에는 굳이 자료형을 쓸 필요 X
		 * 3-2. 기능 : 1. 추가 -> al.add(추가할 값); 
		 *               2. 검색 -> al.get(index 번호);
		 *               3. 수정 -> al.set(바꿀 위치의 index번호 , 변경할 값)
		 *               4. 삭제 -> al.remove(index번호 or 삭제할 값) << 특정 값 삭제
		 *                            al.clear() << 모두 삭제 
		 * 2025_1월_20일 필기
		 * 1. For문
		 * 1-1. 문법: for(초기화; 조건; 변화(증감식) {
		 *                   실행문
		 *                   }
		 *  ArrayList << while문이랑 많이 쓰임 , Index랑은 for문이 어울림
		 *  
		 *  2. do-while문
		 *  2-1. 문법 : do { 실행문 } while(조건문) : << 콜론 없으면 에러남
		 *                -> 일단 do 안에 있는 실행문을 실행함, 만약 while이 참이면 다시 do 안에 있는 실행문으로 돌아감
		 *                -> 그러므로 do-while문은 최소한 한번은 실행됨
		 *                
		 * 3. for(int point : (ArrayList) score) { // 향상된 for문, score 자리에 들어갈 수 있는 것은 배열랑 리스트만 가능
		 *         실행문
		 *         } -> score에 첫번째 값이 point에 입력되서 실행되고 그다음 값이 또 point에 입력되고 실행되고 반복
		 *         => 향상된 for문은 출력용으로만 사용 가능, 입력용으로는 불가능!!
		 *    향상된 for문 문법: for(임시변수(타입명 변수명) : 배열 or 리스트) { 실행문 }
		 *                                 -> 배열 또는 리스트에 있는 값을 임시변수에 저장한다.
		 *    장점: index outOfBounds가 일어날 일이 적음(컴퓨터가 index를 계산해주기 때문에)
		 *    단점: 두개 이상의 값을 한번에 출력하거나 둘 다 한번에 사용하는 경우 사용하기 힘듦. 
		 *           그래서 두개 이상의 값을 사용하는 경우에는 향상된 for문을 사용하지 않음
		 */
	}
}
