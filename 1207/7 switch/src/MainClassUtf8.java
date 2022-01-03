
public class MainClassUtf8 {

	public static void main(String[] args) {
		/*
		 	switch : if문과 비슷
		 			 값이 명확해야 함
		 			 범위를 지정할 수 없다 (>)
		 			 실수를 사용할 수 없다 (소수점)
		 			 코드가 깨끗, 해독 용이
		 			 
		 			 if문이라면
		 			 if(number == 1) {
		 			 
		 			 }else if(number == 2){
		 			 
		 			 }  이런 식으로만 작성해야 함
		 			 
		 	형식 :
		 		switch(대상이 되는 변수){
		 			case 값1:						if(대상이 되는 변수 == 값1)
		 				처리1
		 				break;   // 처리1을 진행하고 switch 블록을 벗어남
		 			case 값2:
		 				처리2
		 				break;
		 				...
		 			default:	// 생략가능			else 생략가능
		 				해당 값이 없을 경우 처리
		 				break;
		 		}
		 	
		*/
		
		int number = 2;
		
		switch(number) {
			case 1:
				System.out.println("number는 1입니다");
				break;
			case 2:
				System.out.println("number는 2입니다");
				break;  // break를 작성하지 않으면 밑의 처리값까지 출력됨
			case 3:
				System.out.println("number는 3입니다");
				break;
			default:  // 생략가능 : 어떤 case도 해당되지 않을 땐 아무것도 출력되지 않음
				System.out.println("number는 " + number);
				break;
		}
		
		
		
		

	}

}
