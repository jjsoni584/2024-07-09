package chapter1;

public class ControllFor {

	public static void main(String[] args) {
		
		// 반복문 : 특정 조건을 만족하면 지정한 코드 블럭을 반복 실행하도록 하는 것
		
		// for문 : 일반적으로 반복 횟수가 정해져 있을때 사용하는 반복문
		// for (조건에사용할변수초기화; 조건; 조건에사용할변경변수) {반복할 코드블럭}
		
//		System.out.println("안녕하세요.");
		for(int count = 1; count <= 0; count++) {
			System.out.println("안녕하세요.");
		}
		
		for(int count = 1; count <= 9; count+=2) {
			System.out.println("4 * " + count + " = " +(count*4));
		}
		
		String[] fruites = new String[] {"apple", "banana", "cacao"};
		System.out.println(fruites[0]);
		System.out.println(fruites[1]);
		System.out.println(fruites[2]);
		
		for (int index = 0; index <= 2; index++) {
			System.out.println(fruites[index]);
		}
		
		for(int index = 0; index < fruites.length; index++) {
			fruites[index] += " add ";
		}
		
		// foreach: 컬렉션(배열)의 각 요소를 하나씩 변수에 복사하여 사용하는 반복문
		// 컬렉션 실제 요소에 대해서 읽기전용, 복사한 요소를 변경하더라도 실제 요소에는 영향이 없음
		for (String fruite: fruites) {
			System.out.println(fruite);
		}
		for (String fruite: fruites) {
			fruite += " add";
		}
		for (String fruite: fruites) {
			System.out.println(fruite);
		}
	}

}
