
public class MainClass {

	public static void main(String[] args) {
		/*
		 	������
		 	���ұݾ� : 3,210��
		 	���αݾ� : 10,000��
		 	
		 	�Ž����� -> ?
		 	
		 	5000�� -> ?��
		 	1000�� -> ?��
		 	 500�� -> ?��
		 	 100�� -> ?��
		 	  50�� -> ?��
		 	  10�� -> ?��
		 */
		
		int myMoney = 10000;
		int price = 3210;
		
		// �Ž�����
		int changeMoney;
		changeMoney = myMoney - price;
		
		System.out.println("�Ž������� " + changeMoney + "�� �Դϴ�.");
		
		// 5000��
		int m5000 = changeMoney/5000;
		System.out.println("5000���� " + m5000 + "��");
		
		// 1000��
		int m1000 = changeMoney%5000/1000;  // 5000���� �������� 1000�� ������ ����
		System.out.println("1000���� " + m1000 + "��");
		
		// 500��
		int m500 = changeMoney%1000/500;
		System.out.println("500���� " + m500 + "��");
		
		// 100��
		int m100 = changeMoney%500/100;
		System.out.println("100���� " + m100 + "��");
		
		// 50��
		int m50 = changeMoney%100/50;
		System.out.println("50���� " + m50 + "��");
		
		int m10 = changeMoney%50/10;
		System.out.println("10���� " + m10 + "��");
		
		
		

	}

}
