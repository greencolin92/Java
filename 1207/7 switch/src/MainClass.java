
public class MainClass {

	public static void main(String[] args) {
		/*
		 	switch : if���� ���
		 			 ���� ��Ȯ�ؾ� ��
		 			 ������ ������ �� ���� (>)
		 			 �Ǽ��� ����� �� ���� (�Ҽ���)
		 			 �ڵ尡 ����, �ص� ����
		 			 
		 			 if���̶��
		 			 if(number == 1) {
		 			 
		 			 }else if(number == 2){
		 			 
		 			 }  �̷� �����θ� �ۼ��ؾ� ��
		 			 
		 	���� :
		 		switch(����� �Ǵ� ����){
		 			case ��1:						if(����� �Ǵ� ���� == ��1)
		 				ó��1
		 				break;   // ó��1�� �����ϰ� switch ����� ���
		 			case ��2:
		 				ó��2
		 				break;
		 				...
		 			default:	// ��������			else ��������
		 				�ش� ���� ���� ��� ó��
		 				break;
		 		}
		 	
		*/
		
		int number = 2;
		
		switch(number) {
			case 1:
				System.out.println("number�� 1�Դϴ�");
				break;
			case 2:
				System.out.println("number�� 2�Դϴ�");
				break;  // break�� �ۼ����� ������ ���� ó�������� ��µ�
			case 3:
				System.out.println("number�� 3�Դϴ�");
				break;
			default:  // �������� : � case�� �ش���� ���� �� �ƹ��͵� ��µ��� ����
				System.out.println("number�� " + number);
				break;
		}
		
		
		
		

	}

}
