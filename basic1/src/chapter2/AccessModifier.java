package chapter2;

// 접근 제어자 : 클래스, 메서드, 필드에 대해서 외부 접근에 대한 제어를 하는 것
// poblic : 모든 패키디에서 접근 가능
// protacted : 같은 패키지 내부 혹은 외부 패키지의 자손 클래스에서 접근 가능
// default(package) : 같은 패키지 내부에서만 접근 가능
// private : 같은 클래스 내부에서만 접근 가능

public class AccessModifier {
	public int publicVariable;
	protected int protectedVariable;
	int defaultVariable;
	private int privateVariable;
	
	public static void main(String[] args) {
		
		

	}

}
