import java.util.Arrays;

public class MainClassUtf8 {

	public static void main(String[] args) {

		/*
		 	int num1, num2, num3, num4, num5;
		 	
		 	num1 = 11;  // 변수는 변수명으로 접근
		 	num2 = 22;
		 	num3 = 33;
		 	
		 	Array : 배열. 같은 자료형 변수들의 묶음.  <- 변수들
		 			목적 -> 변수관리, 관리는 index number로 구분
		 			
		 	형식 : 
		 			자료형 배열변수명[] = new 자료형[배열의 총개수];  // new도 예약어
		 			배열변수명[index number]
		 			
		 			int arrName[] = new int[5];  -> 정수형 변수 5개 선언
		 							동적할당(dynamic, []안의 숫자가 변경될 수 있음) / 정적(static)
		 							
		 			arrName[0] = 11;  // 배열변수는 index number로 접근
		 			arrName[1] = 22;
		 			arrName[2] = 33;
		 			arrName[3] = 44;
		 			arrName[4] = 55;  // 마지막 값은 4(개수는 5개)
		 	
		 */
		
		// 메모리는 Stack, Heap, Static, Sys 영역이 있음
		
		// int array[] = new int[5];  // 0~4까지
		// int []array = new int[5];
		int[] array = new int[5];  // 셋 다 똑같음
		
		System.out.println(array);  // @ 뒷부분이 Heap 영역의 주소
		System.out.println(array.length);  // 배열의 길이
		
		// 일반 변수로 접근
		int num1;
		num1 = 333;
		
		System.out.println(num1);
		
		// 배열로 접근
		System.out.println(array[0]);  // 값이 없어도 자동적으로 0의 값 할당(동적할당)
		
		array[0] = 11;
		array[1] = 22;
		array[2] = 33;
		array[3] = 44;
		array[4] = 55;
		
		System.out.println(array[2]);
		
		System.out.println(Arrays.toString(array));  // 한번에 배열값 나열
		
		
		// 선언 & 초기화
		int number = 0;  // 선언과 동시에 초기화
		number = 1;  // 변수 값의 갱신
		
		// 배열 선언 & 초기화
		int Array[] = {111, 222, 333, 444, 555};
		            //  0    1    2    3    4
		System.out.println(Array[1]);
		
		char chArr[] = { 'h', 'e', 'l', 'l', 'o'};
		
		System.out.println(chArr.length);
		System.out.println(Arrays.toString(chArr));
		System.out.println(chArr);  // 자동적으로 문자열로 변환 (int는 주소가 나왔음)
		
		char c = 'A';
		System.out.println(c);
		System.out.println((int)c);  // cast 변환으로 출력, 65 == ASCII https://shaeod.tistory.com/228
		
		// String strArr[] =
			/* 용도에 맞게 둘 중에 사용
			 자료형 배열변수명[] = new 자료형[배열의 총개수];
			 자료형 배열변수명[] = {  };
			 */
		// int Arr[] = {1, 2, 3, 4, 5};
		// int Arr[];
		// Arr = new int[7];  //나중에 개수 지정해줄 수 있음
				
		
		String strArr[] = {"안녕하세요", "반갑습니다", "잘 부탁드립니다"};
		System.out.println(strArr.length);
		System.out.println(Arrays.toString(strArr));
		System.out.println(strArr);		


	}

}
