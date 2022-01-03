
public class MainClass {

	public static void main(String[] args) {
		
		/* 
			Operator : 연산자
			
			+ - * / %
			++		increment
			--		decrement
		 
		  */
		
		int number1, number2;
		int result;
		
		number1 = 25;
		number2 = 7;
		
		result = number1 + number2;  // number1 + number2 계산된 값을 result로 대입하는 과정 (오 -> 왼)
		System.out.println(result);
		
		result = number1 - number2;
		System.out.println(result);
		
		result = number1 * number2;
		System.out.println(result);
		
		result = number1 / number2;  // 몫, 분모가 0이 되면 오류(예외)가 발생
		System.out.println(result);
		
		result = number1 % number2;  // 나머지, 분모가 0이 되면 오류(예외)가 발생
		System.out.println(result);
		
		// Arithmetic  == 산수, 연산
		
		result = (number1 * number2) / number2;  // 이런 공식도 계산 가능
		System.out.println(result);
		
		
		// ++ --
		number1 = 0;
		
		number1 = number1 + 1;  // 자기 자신의 값(number1)을 갱신
		System.out.println(number1);
		number1 += 1;  // == number1 = number1 + 1;
		System.out.println(number1);
		
		// increment == ++ == +1
		// decrement == -- == -1
		number1++;
		System.out.println(number1);
		number1--;
		System.out.println(number1);
		++number1;  // 위치는 상관 X
		System.out.println(number1);
		--number1;
		System.out.println(number1);
		
		
		int num1, num2;
		num1 = 0;
		num2 = 0;
		
		num2 = num1++;  // num1을 2에 먼저 대입하고 ++ 연산처리(연산을 나중에), ()처리 해도 상관X
		//num2 = ++num1;  // ++ 연산처리 먼저하고 대입
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		
		








	}

}
