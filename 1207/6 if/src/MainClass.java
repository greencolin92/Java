
public class MainClass {

	public static void main(String[] args) {
		/* ����
		 	if  -> ����
		 	if, else  -> �ΰ��� �� �ϳ�
		 	if, else if, else if, ...
		 	
		 	switch (���� ����)
		 	
		   ��ȯ(loop) : �ݺ���
		   	for
		   	while
		   	do while
		   	
		   ������ : ��ȯ�� ����(���������� ���Ұ�)
		    beak
		    continue		 	
		 	*/
		
		/*
		  if : ���ǹ�
		  
		  ���� : if(����) {  ���� -> true/false   // ������ true�� ó��, false�� �׳� �Ѿ
		  		   ó��		  
		  		}
		  ���� : ==(����), >(ũ��), <(�۴�), >=(ũ�ų� ����), <=(�۰ų� ����), !=(���� �ʴ�)
		  
		  �ټ��� ���� : �� �����ڿ� ���� ���
		  			 &&(AND), ||(OR), !(NOT, ~�� �ƴ�)
		  			 
		  if(����1 && ����2){}		  
		  
		  */
		
		// if
		int number = 5;
		
		if(number > 0) {  // true
			// ó��
			System.out.println("number�� 0���� Ů�ϴ�");
		}
		
		if(number == 5) {
			System.out.println("number�� 5�Դϴ�");
		}
		
		if(number >= 5) {
			System.out.println("number�� 5���� ũ�ų� �����ϴ�");
		}
		
		
		boolean b = true;
		
		if(b == true) {
			System.out.println("b�� true�Դϴ�");
		}
		
		if(b) {  // boolean�� ��������
			System.out.println("if(b)�� true�Դϴ�");
		}
		
		b = false;
		if (b == false) {
			System.out.println("b�� false�Դϴ�");
		}
		
		if(!b) {  // b==false�� ����
			System.out.println("if(!b)�� false�Դϴ�");
		}
		
		if(number > 0 && number <= 10) {  // and
			System.out.println("number�� 0���� ũ�� 10���� �۰ų� �����ϴ�");
		}
		
		if(number > 0 && number <= 10 && b == false) {
			System.out.println("number�� 0���� ũ�� 10���� �۰ų� ���� b�� false�Դϴ�");
		}
		
		if(number > 0 || number > 10) {  // or
			System.out.println("number�� 0���� ũ�ų� 10���� Ů�ϴ�");
		}
		
		
		// if else
		/*
		  if(����){
		  	ó��1
		  }
		  else{
		  	ó��2
		  }
		  		    
		  */
		int number1 = 69;
		
		if(number1 >= 70) {  // ����
			System.out.println("����Դϴ�");
		}
		else {
			System.out.println("������Դϴ�");
		}
		
		/*���� ������
		  �� = (����) ? ��1 : ��2  -> ���̸� ��1 ����, �����̸� ��2 ����*/
		String result = (number1 >= 70)?"����Դϴ�":"������Դϴ�";
		System.out.println(result);
		
		int num = (number1 > 60)?10:5;
		System.out.println(num);
		
		/*
		  ���Ǻб�
		  if(����1){
		  	 ó��1
		  }
		  else if(����2){
		  		ó��2
		  }
		  else if(����3){
		  		ó��3
		  }
		  else{         <- ���û���
		  		ó��4
		  }
		  */
		int number2 = 90;
		
		if (number2 == 100) {  // ���� ��(�켱����)�� ���Ǻ��� �ۼ�
			System.out.println("A+ �Դϴ�");
		}
		else if (number2 >= 90) {
			System.out.println("A �Դϴ�");
		}
		else if (number2 >= 80) {
			System.out.println("B �Դϴ�");
		}
		else if (number2 >= 70) {
			System.out.println("C �Դϴ�");
		}
		else {
			System.out.println("������Դϴ�");
		}
		
		// ���ǹ� �ȿ� ���ǹ�
		/* 
		 	if(����1){  // ����1�� ������ �� ���¿��� ����2�� ��
		 	
		 		if(����2){
		 			ó��1
		 		}
		 		else{
		 			ó��2
		 		}
		 	
		 	}
		 */
		int number3 = 95;
		// 95�� �̻��� �� A+
		// 95�� ������ �� A
		if(number3 >= 90) {
			if(number3 >= 95) {
				System.out.print("A+");
			}
			else {
				System.out.print("A");
			}
			System.out.println(" �Դϴ�");
		}
		
		// String
		String str1 = "�ȳ��ϼ���";
		String str2 = "�ȳ�";
		str2 = str2 + "�ϼ���";
		System.out.println(str2);
		
		if(str1 == str2) {  // ==�� ����ϸ� ó���� ������ ���� �����ͼ� ��
			System.out.println("���� ���ڿ��Դϴ�");
		}
		else {
			System.out.println("�ٸ� ���ڿ��Դϴ�");
		}
		
		// equals  : ���ڿ����� ��
		if(str1.equals(str2)) {  // str1�� ���ڿ��� str2�� ���ڿ��� ���� (�ϼ��� ���ڿ� ��)
			System.out.println("equals ���� ���ڿ��Դϴ�");
		}
		else {
			System.out.println("equals �ٸ� ���ڿ��Դϴ�");
		}
		

	}

}
