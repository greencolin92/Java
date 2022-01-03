import java.util.Scanner;

public class MainClassT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 이거 보고 복습하기
		/*
	 	계산기
	    */
		
		// 변수 선언
		int number1, number2;
		String oper;
		int result = 0;
	
	// 명확하게 기획해놓기
	// 1. 입력
		// 연산자에 연산자가 오지 않을 때 경고, 2번째 숫자에 0이 올 때 경고하는 것
		// 1번째 숫자
		System.out.print("첫번째 수 = ");
		number1 = sc.nextInt();
		// 연산자 + - * /
		System.out.print("연산(+, -, *, /) = ");
		oper = sc.next();
		// 2번째 숫자
		System.out.print("두번째 수 = ");
		number2 = sc.nextInt();
		
	 //2. 연산
//		switch(oper) {
//			case "+":
//				result = number1 + number2;
//				break;
//			case "-":
//				result = number1 - number2;
//				break;
//			case "*":
//				result = number1 * number2;
//				break;
//			case "/":
//				result = number1 / number2;
//				break;
//		}
		
		if(oper.equals("+")) {			
			result = number1 + number2;
		}
		else if(oper.equals("-")) {
			result = number1 - number2;
		}
		else if(oper.equals("*")) {
			result = number1 * number2;
		}
		else if(oper.equals("/")) {
			result = number1 / number2;
		}
					
	// 3. 결과 출력
		System.out.println(number1 + " " + oper + " " + number2 + " = " + result);  // 이대로하면 오류 -> 초기화 필요(result값을 지정해야함)

	}

}
