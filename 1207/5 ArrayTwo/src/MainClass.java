import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
	/*
	 Array : ���� �ڷ����� ���� ������
		���� �� ������ index�� �ȴ�. 0 ~ Array.length-1������ index

	 int Arr[] = new int[5];  // 0~4

	 �������� �Ҵ��� �Ŀ� �������� ���
	 1���� 0-0-0-0-0 ��(row)
	 
	 int array[] = {1, 2, 3, 4, 5};
	 
	 2����
	 	0-0-0-0-0  -> ��
	 	0-0-0-0-0
	 	0-0-0-0-0
	 
	 int array2[][] = new int[3][4];  3�࿡ ������ ���� 4��
	 	 []array2[] = new int[3][4];
	 	 [][]array2 = new int[3][4];
	 	 
	 	0-0-0-0
		0-0-0-0
	 	0-0-0-0
	 	
	 	// �ʱ�ȭ
	 	int array2[][] = {
	 		{1, 2, 3, 4},
	 		{5, 6, 7, 8},
	 		{9, 10, 11, 12}
	 	};	 
	 
	 */
		
		int Array2[][] = new int[3][4];  // ���� 4�� ������ �ŵ� ���� ���� ����
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
		
		System.out.println(Arrays.toString(Array2[0]));  // �� �྿
		
		// Array[ū����(��)][������ ���]
		int Array23[][] = {
			{1, 2},
			{3, 4},
			{5, 6},		
		};
		System.out.println(Array23[1][1]);
		System.out.println(Array23[2][1]);
		
		System.out.println(Array23.length);  // ū����
		System.out.println(Array23[0].length);  // 0��° ���� ����
		System.out.println(Arrays.toString(Array23[0]));
		System.out.println(Arrays.toString(Array23[1]));

	}

}
