
public class MainClassUtf8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
		 자료형     byte                우선순위 (그릇이 작을 수록 낮다)
		 boolean   1                    낮음
		 byte      1
		 short	   2
		 int	   4
		 long      8
		 float     4 (소수점이 들어가는 부분이 long보다 우선순위 높음)
		 double    8				    높음
		 
		 char      2
		 String    "ABC" -> 6 byte	 
		 
		 (자료)형 변환
		 자동 (자료)형 변환  -> 작은 그릇에서 큰 그릇으로 붇는(넘치지X, 자연스럽)
		 강제 (자료)형 변환 -> Cast 변환  큰 그릇의 물을 작은 그릇에 붇는
		 
		 */
		
		// 자동
		short sh = 12345;  // 2byte
		int num;  // 4byte
		
		num = sh;  // 자동 (자료)형 변환, 대입 방향은 우 -> 좌
		System.out.println(num);
		
		// 강제
		num = 23456;  // 그 범위의 값이 넘어가지 않는 범위에서 작성
		sh = (short)num;  // 강제 (자료)형 변환
		System.out.println(sh);
		
		
		long l = 123456789L;
		float f;
		
		f = l;
		System.out.println(f);
		
		// 소수점에 있는 e의 의미
		double d = 1.23e3;
		/*
		 1.23e3;		e3 == 10의 3승 == 1000  -> 1.23 * 1000 = 1230
		  */
		System.out.println(d);
		
		d = 2.34e-2;
		/*
		 2.34e-2;		e-2 == 1/10의 2승 == 0.
		 */
		System.out.println(d);
		
		int number1, number2;
		float fnum;
		
		number1 = 3;
		number2 = 2;
		
		fnum = (float)number1 / number2;  // float가 먼저 실행(3.0)되고 나눗셈 실행
		System.out.println(fnum);  // number1, number2가 int라서 변환(자동형이지만 강제형으로 변환)
		
		// 지금은 자료형끼리 변환되지만, 나중엔 클래스에서도 cast 변환 사용
		
	}

}
