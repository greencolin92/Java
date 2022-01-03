
public class MainClass {

	public static void main(String[] args) {
		/* 조건
		 	if  -> 성립
		 	if, else  -> 두가지 중 하나
		 	if, else if, else if, ...
		 	
		 	switch (사용빈도 낮음)
		 	
		   순환(loop) : 반복문
		   	for
		   	while
		   	do while
		   	
		   제어자 : 순환을 제어(독립적으로 사용불가)
		    beak
		    continue		 	
		 	*/
		
		/*
		  if : 조건문
		  
		  형식 : if(조건) {  조건 -> true/false   // 조건이 true면 처리, false면 그냥 넘어감
		  		   처리		  
		  		}
		  조건 : ==(같다), >(크다), <(작다), >=(크거나 같다), <=(작거나 같다), !=(같지 않다)
		  
		  다수의 조건 : 논리 연산자와 같이 사용
		  			 &&(AND), ||(OR), !(NOT, ~이 아닌)
		  			 
		  if(조건1 && 조건2){}		  
		  
		  */
		
		// if
		int number = 5;
		
		if(number > 0) {  // true
			// 처리
			System.out.println("number는 0보다 큽니다");
		}
		
		if(number == 5) {
			System.out.println("number는 5입니다");
		}
		
		if(number >= 5) {
			System.out.println("number는 5보다 크거나 같습니다");
		}
		
		
		boolean b = true;
		
		if(b == true) {
			System.out.println("b는 true입니다");
		}
		
		if(b) {  // boolean만 생략가능
			System.out.println("if(b)는 true입니다");
		}
		
		b = false;
		if (b == false) {
			System.out.println("b는 false입니다");
		}
		
		if(!b) {  // b==false와 같음
			System.out.println("if(!b)는 false입니다");
		}
		
		if(number > 0 && number <= 10) {  // and
			System.out.println("number는 0보다 크고 10보다 작거나 같습니다");
		}
		
		if(number > 0 && number <= 10 && b == false) {
			System.out.println("number는 0보다 크고 10보다 작거나 같고 b는 false입니다");
		}
		
		if(number > 0 || number > 10) {  // or
			System.out.println("number는 0보다 크거나 10보다 큽니다");
		}
		
		
		// if else
		/*
		  if(조건){
		  	처리1
		  }
		  else{
		  	처리2
		  }
		  		    
		  */
		int number1 = 69;
		
		if(number1 >= 70) {  // 거짓
			System.out.println("통과입니다");
		}
		else {
			System.out.println("재시험입니다");
		}
		
		/*삼항 연산자
		  값 = (조건) ? 값1 : 값2  -> 참이면 값1 적용, 거짓이면 값2 적용*/
		String result = (number1 >= 70)?"통과입니다":"재시험입니다";
		System.out.println(result);
		
		int num = (number1 > 60)?10:5;
		System.out.println(num);
		
		/*
		  조건분기
		  if(조건1){
		  	 처리1
		  }
		  else if(조건2){
		  		처리2
		  }
		  else if(조건3){
		  		처리3
		  }
		  else{         <- 선택사항
		  		처리4
		  }
		  */
		int number2 = 90;
		
		if (number2 == 100) {  // 제일 위(우선순위)의 조건부터 작성
			System.out.println("A+ 입니다");
		}
		else if (number2 >= 90) {
			System.out.println("A 입니다");
		}
		else if (number2 >= 80) {
			System.out.println("B 입니다");
		}
		else if (number2 >= 70) {
			System.out.println("C 입니다");
		}
		else {
			System.out.println("재시험입니다");
		}
		
		// 조건문 안에 조건문
		/* 
		 	if(조건1){  // 조건1이 성립이 된 상태에서 조건2에 들어감
		 	
		 		if(조건2){
		 			처리1
		 		}
		 		else{
		 			처리2
		 		}
		 	
		 	}
		 */
		int number3 = 95;
		// 95점 이상일 때 A+
		// 95점 이하일 때 A
		if(number3 >= 90) {
			if(number3 >= 95) {
				System.out.print("A+");
			}
			else {
				System.out.print("A");
			}
			System.out.println(" 입니다");
		}
		
		// String
		String str1 = "안녕하세요";
		String str2 = "안녕";
		str2 = str2 + "하세요";
		System.out.println(str2);
		
		if(str1 == str2) {  // ==를 사용하면 처음에 참조한 것을 가져와서 비교
			System.out.println("같은 문자열입니다");
		}
		else {
			System.out.println("다른 문자열입니다");
		}
		
		// equals  : 문자열끼리 비교
		if(str1.equals(str2)) {  // str1의 문자열과 str2의 문자열이 같다 (완성된 문자열 비교)
			System.out.println("equals 같은 문자열입니다");
		}
		else {
			System.out.println("equals 다른 문자열입니다");
		}
		

	}

}
