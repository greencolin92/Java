import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
	/*
	 Array : 같은 자료형의 묶음 변수들
		접근 및 관리는 index로 된다. 0 ~ Array.length-1까지가 index

	 int Arr[] = new int[5];  // 0~4

	 동적으로 할당한 후에 정적으로 사용
	 1차원 0-0-0-0-0 행(row)
	 
	 int array[] = {1, 2, 3, 4, 5};
	 
	 2차원
	 	0-0-0-0-0  -> 행
	 	0-0-0-0-0
	 	0-0-0-0-0
	 
	 int array2[][] = new int[3][4];  3행에 원소의 개수 4개
	 	 []array2[] = new int[3][4];
	 	 [][]array2 = new int[3][4];
	 	 
	 	0-0-0-0
		0-0-0-0
	 	0-0-0-0
	 	
	 	// 초기화
	 	int array2[][] = {
	 		{1, 2, 3, 4},
	 		{5, 6, 7, 8},
	 		{9, 10, 11, 12}
	 	};	 
	 
	 */
		
		int Array2[][] = new int[3][4];  // 뒤의 4는 생략이 돼도 오류 나지 않음
		Array2[0][0] = 1;
		Array2[0][1] = 2;
		Array2[0][2] = 3;
		Array2[0][3] = 4;
		
		Array2[1][0] = 5;
		Array2[1][1] = 6;
		Array2[1][2] = 7;
		Array2[1][3] = 8;
		
		Array2[2][0] = 9;
		Array2[2][1] = 10;
		Array2[2][2] = 11;
		Array2[2][3] = 12;
		
		System.out.println(Arrays.toString(Array2[0]));  // 한 행씩
		
		// Array[큰묶음(행)][각각의 요소]
		int Array23[][] = {
			{1, 2},
			{3, 4},
			{5, 6},		
		};
		System.out.println(Array23[1][1]);
		System.out.println(Array23[2][1]);
		
		System.out.println(Array23.length);  // 큰묶음
		System.out.println(Array23[0].length);  // 0번째 행의 길이
		System.out.println(Arrays.toString(Array23[0]));
		System.out.println(Arrays.toString(Array23[1]));

	}

}
