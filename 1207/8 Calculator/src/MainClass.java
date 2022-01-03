import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	계산기
		 */
		
		// 1. 입력
		Scanner scan = new Scanner(System.in);
		
			// 1번째 숫자
		System.out.print("첫번째 숫자 : ");
		double firstNumber = scan.nextDouble();
			// 연산자 + - * /
		System.out.print("연산자 : ");
		String operator = scan.next();
		    // 2번째 숫자
		System.out.print("두번째 숫자 : ");
		double secondNumber = scan.nextDouble();
		
		// 2. 연산
		double answer = 0;
		switch(operator) {
			case "+":
				answer = firstNumber + secondNumber;
				break;
			case "-":
				answer = firstNumber - secondNumber;
				break;
			case "*":
				answer = firstNumber * secondNumber;
				break;
			case "/":
				answer = firstNumber / secondNumber;
				break;
			default:
				System.out.print("연산자를 입력하세요");
				break;
		}
		
		// 3. 결과 출력
		System.out.println("계산 결과는 : " + firstNumber + operator + secondNumber + " = " + answer + " 입니다.");

		
	}

}
