
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
		 �ڷ���     byte                �켱���� (�׸��� ���� ���� ����)
		 boolean   1                    ����
		 byte      1
		 short	   2
		 int	   4
		 long      8
		 float     4 (�Ҽ����� ���� �κ��� long���� �켱���� ����)
		 double    8				    ����
		 
		 char      2
		 String    "ABC" -> 6 byte	 
		 
		 (�ڷ�)�� ��ȯ
		 �ڵ� (�ڷ�)�� ��ȯ  -> ���� �׸����� ū �׸����� �Ѵ�(��ġ��X, �ڿ�����)
		 ���� (�ڷ�)�� ��ȯ -> Cast ��ȯ  ū �׸��� ���� ���� �׸��� �Ѵ�
		 
		 */
		
		// �ڵ�
		short sh = 12345;  // 2byte
		int num;  // 4byte
		
		num = sh;  // �ڵ� (�ڷ�)�� ��ȯ, ���� ������ �� -> ��
		System.out.println(num);
		
		num = 23456;  // �� ������ ���� �Ѿ�� �ʴ� �������� �ۼ�
		sh = (short)num;  // ���� (�ڷ�)�� ��ȯ
		System.out.println(sh);
		
		
		long l = 123456789L;
		float f;
		
		f = l;
		System.out.println(f);
		
		// �Ҽ����� �ִ� e�� �ǹ�
		double d = 1.23e3;
		/*
		 1.23e3;		e3 == 10�� 3�� == 1000  -> 1.23 * 1000 = 1230
		  */
		System.out.println(d);
		
		d = 2.34e-2;
		/*
		 2.34e-2;		e-2 == 1/10�� 2�� == 0.
		 */
		System.out.println(d);
		
		int number1, number2;
		float fnum;
		
		number1 = 3;
		number2 = 2;
		
		fnum = (float)number1 / number2;  // float�� ���� ����(3.0)�ǰ� ������ ����
		System.out.println(fnum);  // number1, number2�� int�� ��ȯ(�ڵ��������� ���������� ��ȯ)
		
		// ������ �ڷ������� ��ȯ������, ���߿� Ŭ���������� cast ��ȯ ���
		
	}

}