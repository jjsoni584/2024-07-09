package chapter1;

public class Variable {

	public static void main(String[] args) {
	
		// 변수 (variable)
		// 데이터를 메모리에 저장하는데 사용하는 기본요소
		// 변수를 생성(선언)할 때는 반드시 해당 변수가 어떤 형태의 데이터를 가질 수 있는지 지정해야함
		
		// 선언(생성) 방법
		// 데이터타입 변수명;
		int number1; // 정수를 담을 수 있는 number1이라는 이름을 가지는 메모리 공간을 생성
		
		// 초기화(초기값을 넣는) 방법
		// 변수 = 데이터;
		number1 = 9; // number1이라는 메모리 공간에 9라는 데이터를 초기값으로 넣음
		
		// 선언과 동시에 초기화 방법
		// 데이터타입 변수명 = 데이터;
		int number2 = 37; // 정수를 담을 수 있는 number2라는 이름을 가지는 메모리 공간을 생성하고 그 공간에 37을 넣음
		
		System.out.println(number1);
		System.out.println(number2);
		
		// 변수는 선언 후 반드시 초기화 이후에 사용할 수 있음
		// int number3;
		// System.out.println(number3);
		
		// 변수에 지정된 타입의 데이터가 아니면 할당이 불가능
		// int number3 = 3.14;
		
		number1 = 12; // 처음 변수에 값을 할당하는 행위가 아니기 때문에 해당 코드는 초기화가 아님
		System.out.println(number1);
		
		// 비문법상 규칙(암묵적 규칙)
		// 1. 띄어쓰기 규칙
		// web site adress -> webSiteAdress
		// - Camel Case : 띄어쓰기를 표현할 떄 띄어쓰기를 제거하고 바로 뒤 문자를 대문자로 표현
		String webSiteAdress;
		// - Snake Caseb : 띄어쓰기를 표현할 때 씌어쓰기 자리에 _로 표현
		String web_site_adress;
		// -Upper : 대문자
		// -Lower : 소문자
		
		// UpperCamelCase : 클래스, 인터페이스(첫문자를 대문자로 시작)
		// LowerCamelCase : 변수, 함수, 메서드(첫문자를 소문자로 시작)
		// UPPER_SNAKE_CASE : 상수형 변수 (모든 문자를 대문자로 작성)
		// lower_snake_case :변수, 함수, 메서드(모든 문자를 소문자로 작성)
		
		
		
		// 상수 (Constant)
		// 초기화가 이루어진 변경이 불가능한 변수
		// 변수 선언 시에 데이터 타입 앞에 final 키워드를 붙여서 선언
		// final 데이터타입 변수명(상수명);
		final int MAX;
		MAX = 100;
		
		final int MIN = 0;
		
		// 상수는 초기화 이후 재할당 불가능
		// MAX = 999;
		
		double size1 = 146.6 * 70.6;
		
		// 리터럴에 이름을 부여하기 위한 용도로 상수를 많이 사용함
		final double IPHONE_15_PRO_HEIGHT = 146.6;
		final double IPHONE_15_PRO_WIDTH = 70.6;
		
		double size2 = IPHONE_15_PRO_HEIGHT * IPHONE_15_PRO_WIDTH;
		
		// 코드의 유지보수성을 향상시키기위해 사용됨
		final int HEIGHT = 10;
		int sum = HEIGHT + 20;
		int multi = HEIGHT * 20;
		
		// 리터럴 상수 : 값 그 자체 (코드 상에서)
		// int age = 32; 이라는 구문에서 '32'가 리터럴;
		
		
		
		
		
		// 형변환 ㅣ 데이터 타입이 서로 다른 변수를 옮겨 닮는 것
		
		// 강제 형변환 : 큰 데이터 타입의 변수를 작은 데이터 타입의 변수에 옮겨 닮을 때 발생
		// 자동 형변환 : 작은 데이터 타입의 변수를 큰 데이터 타입의 변수에 옮겨 닮을 때 발생
		
		int number = 300;
		long long2 = number;
		number = (int) long2;
		
		char char3 = 100;
		short short2 = char3;
		int int2 = char3
		
		
		// 배열의 요소에 접근할 때는 '인덱스' 사용
		// 인덱스는 0부터 시작, 마지막 인덱스는 길이의 -1번
				
				
		// String : 문자의 배열(문자열)을 표현하는데 사용되는 참조형 데이터 타입
		// 선언
		// String 변수명;
		// 생성
		// new String();
		// 초기화
		// 변수명 = "문자열"
		String string1;
		string1 = new String();
		string1 = "apple";
		System.out.println(string1);
		
		// 문자열(String)의 주요 기능
		
		
		// 참조형 데이터 타입
		// 주소를 가지고 있는 변수의 데이터 타입
		// null을 가질수 있음(null: 아무것도 지정되지 않은 상태)
		// 배열, 클래스, 인터페이스, 열거형이 참조형 데이터 타입에 속함
		String sting2;
		
		}

}
