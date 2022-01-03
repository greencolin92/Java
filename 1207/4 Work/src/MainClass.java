
public class MainClass {

	public static void main(String[] args) {
		/*
		 	편의점
		 	지불금액 : 3,210원
		 	본인금액 : 10,000원
		 	
		 	거스름돈 -> ?
		 	
		 	5000원 -> ?장
		 	1000원 -> ?장
		 	 500원 -> ?개
		 	 100원 -> ?개
		 	  50원 -> ?개
		 	  10원 -> ?개
		 */
		
		int myMoney = 10000;
		int price = 3210;
		
		// 거스름돈
		int changeMoney;
		changeMoney = myMoney - price;
		
		System.out.println("거스름돈은 " + changeMoney + "원 입니다.");
		
		// 5000원
		int m5000 = changeMoney/5000;
		System.out.println("5000원은 " + m5000 + "장");
		
		// 1000원
		int m1000 = changeMoney%5000/1000;  // 5000원은 없어지고 1000원 단위만 남음
		System.out.println("1000원은 " + m1000 + "장");
		
		// 500원
		int m500 = changeMoney%1000/500;
		System.out.println("500원은 " + m500 + "개");
		
		// 100원
		int m100 = changeMoney%500/100;
		System.out.println("100원은 " + m100 + "개");
		
		// 50원
		int m50 = changeMoney%100/50;
		System.out.println("50원은 " + m50 + "개");
		
		int m10 = changeMoney%50/10;
		System.out.println("10원은 " + m10 + "개");
		
		
		

	}

}
