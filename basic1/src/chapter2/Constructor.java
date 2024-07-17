package chapter2;

class Human1 {
	String name;
	int age;
	String gender;
	
	// final로 선언된 인스턴스 변수는 생성자에서 반드시 초기화 해야함
	// 즉, 필수 값6
	final String address;
	
	// 만약 다른 생성자 (매개변수가 있는 생성자)만 존재한다면 
	// 기본 생성자는 자동으로 생성되지 않음
	Human1() {
		// 1. 인스턴스를 생성할 때 특정 작업을 수행하고 싶을 때
		System.out.println("Human1의 인스턴스가 생성되었습니다!");
		
		// 2. *인스턴스를 생성과 동시에 인스턴스 변수를 초기화하고 싶을 때
		// 의존성을 내부에서 주입하는 행위
		name = "홍길동";
		age = 20;
		gender = "남";
		address = "부산";
	}
	
	Human1(String name1) {
		name = name1;
		age = 20;
		gender = "남";
		address = "부산";
		
	}
	
	Human1(String name1, int age1, String gender1) {
		// 의존성을 외부에서 주입하는 행위
		name = name1;
		age = age1;
		gender = gender1;
		
		address = "부산";
	}
	
	void great() {
		// name에 의존하고 있는 형태
		System.out.println(name.concat("이 인사를 합니다."));
	}
}

public class Constructor {

	public static void main(String[] args) {
		
		Human1 human1 = new Human1();
		human1.great();
		
		Human1 human2 = new Human1();
		System.out.println(human2.name);
		
		Human1 human3 = new Human1("이영희", 30, "남");
		System.out.println(human3.name);
		
		Human1 human4 = new Human1();
		
	}

}