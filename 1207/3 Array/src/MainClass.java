import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

		/*
		 	int num1, num2, num3, num4, num5;
		 	
		 	num1 = 11;  // ������ ���������� ����
		 	num2 = 22;
		 	num3 = 33;
		 	
		 	Array : �迭. ���� �ڷ��� �������� ����.  <- ������
		 			���� -> ��������, ������ index number ����
		 			
		 	���� : 
		 			�ڷ��� �迭������[] = new �ڷ���[�迭�� �Ѱ���];  // new�� �����
		 			�迭������[index number]
		 			
		 			int arrName[] = new int[5];  -> ������ ���� 5�� ����
		 							�����Ҵ�(dynamic, []���� ���ڰ� ����� �� ����) / ����(static)
		 							
		 			arrName[0] = 11;  // �迭������ index number�� ����
		 			arrName[1] = 22;
		 			arrName[2] = 33;
		 			arrName[3] = 44;
		 			arrName[4] = 55;  // ������ ���� 4(������ 5��)
		 	
		 */
		
		// �޸𸮴� Stack, Heap, Static, Sys ������ ����
		
		// int array[] = new int[5];  // 0~4����
		// int []array = new int[5];
		int[] array = new int[5];  // �� �� �Ȱ���
		
		System.out.println(array);  // @ �޺κ��� Heap ������ �ּ�
		System.out.println(array.length);  // �迭�� ����
		
		// �Ϲ� ������ ����
		int num1;
		num1 = 333;
		
		System.out.println(num1);
		
		// �迭�� ����
		System.out.println(array[0]);  // ���� ��� �ڵ������� 0�� �� �Ҵ�(�����Ҵ�)
		
		array[0] = 11;
		array[1] = 22;
		array[2] = 33;
		array[3] = 44;
		array[4] = 55;
		
		System.out.println(array[2]);
		
		System.out.println(Arrays.toString(array));  // �ѹ��� �迭�� ����
		
		
		// ���� & �ʱ�ȭ
		int number = 0;  // ����� ���ÿ� �ʱ�ȭ
		number = 1;  // ���� ���� ����
		
		// �迭 ���� & �ʱ�ȭ
		int Array[] = {111, 222, 333, 444, 555};
		            //  0    1    2    3    4
		System.out.println(Array[1]);
		
		char chArr[] = { 'h', 'e', 'l', 'l', 'o'};
		
		System.out.println(chArr.length);
		System.out.println(Arrays.toString(chArr));
		System.out.println(chArr);  // �ڵ������� ���ڿ��� ��ȯ (int�� �ּҰ� ������)
		
		char c = 'A';
		System.out.println(c);
		System.out.println((int)c);  // cast ��ȯ���� ���, 65 == ASCII https://shaeod.tistory.com/228
		
		// String strArr[] =
			/* �뵵�� �°� �� �߿� ���
			 �ڷ��� �迭������[] = new �ڷ���[�迭�� �Ѱ���];
			 �ڷ��� �迭������[] = {  };
			 */
		// int Arr[] = {1, 2, 3, 4, 5};
		// int Arr[];
		// Arr = new int[7];  //���߿� ���� �������� �� ����
				
		
		String strArr[] = {"�ȳ��ϼ���", "�ݰ����ϴ�", "�� ��Ź�帳�ϴ�"};
		System.out.println(strArr.length);
		System.out.println(Arrays.toString(strArr));
		System.out.println(strArr);		


	}

}