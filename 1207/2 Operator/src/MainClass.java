
public class MainClass {

	public static void main(String[] args) {
		
		/* 
			Operator : ������
			
			+ - * / %
			++		increment
			--		decrement
		 
		  */
		
		int number1, number2;
		int result;
		
		number1 = 25;
		number2 = 7;
		
		result = number1 + number2;  // number1 + number2 ���� ���� result�� �����ϴ� ���� (�� -> ��)
		System.out.println(result);
		
		result = number1 - number2;
		System.out.println(result);
		
		result = number1 * number2;
		System.out.println(result);
		
		result = number1 / number2;  // ��, �и� 0�� �Ǹ� ����(����)�� �߻�
		System.out.println(result);
		
		result = number1 % number2;  // ������, �и� 0�� �Ǹ� ����(����)�� �߻�
		System.out.println(result);
		
		// Arithmetic  == ���, ����
		
		result = (number1 * number2) / number2;  // �̷� ���ĵ� ��� ����
		System.out.println(result);
		
		
		// ++ --
		number1 = 0;
		
		number1 = number1 + 1;  // �ڱ� �ڽ��� ��(number1)�� ����
		System.out.println(number1);
		number1 += 1;  // == number1 = number1 + 1;
		System.out.println(number1);
		
		// increment == ++ == +1
		// decrement == -- == -1
		number1++;
		System.out.println(number1);
		number1--;
		System.out.println(number1);
		++number1;  // ��ġ�� ��� X
		System.out.println(number1);
		--number1;
		System.out.println(number1);
		
		
		int num1, num2;
		num1 = 0;
		num2 = 0;
		
		num2 = num1++;  // num1�� 2�� ���� �����ϰ� ++ ����ó��(������ ���߿�), ()ó�� �ص� ���X
		//num2 = ++num1;  // ++ ����ó�� �����ϰ� ����
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		
		








	}

}
