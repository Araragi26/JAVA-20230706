package chapter2;

// 오버로딩
// 같은 이름의 메서드를 여러 개 생성할 수 있도록 해주는 것

// 오버로딩 조건
// 이름이 같아야 함, 매개변수의 조합이 달라야함(매개변수의 이름은영향을 미치지 않음), 반환다입만 다를경우 오버로딩이 성립하지 않음
// 같은 클래스 내에서만 발생함

public class Overloading {
	
	// 물건 금액 입력하면 총 금액
	double purchase(int prdouctPrice) {
		double sum = prdouctPrice * 1.1;
		return sum;
	}
	
	double purchase(int prdouct1Price, int prdouct2Price) {
		double sum = (prdouct1Price + prdouct2Price) * 1.1;
		return sum;
	}
	
	double purchase(double prdouct1Price, int prdouct2Price) {
		double sum = (prdouct1Price + prdouct2Price) * 1.1;
		return sum;
	}
	
	double purchase(int prdouct1Price, double prdouct2Price) {
		double sum = (prdouct1Price + prdouct2Price) * 1.1;
		return sum;
	}
	
	// 매개변수의 이름은 오버로딩에 영향을 미치지 않음
    // double purchase(int price) {
    // 		double sum = price * 1.1;
	// 		return sum;
	// 	}
	
	// 반환타입은 오버로디에 영향을 미치지 않음
	//	int purchase(int prdouctPrice) {
	//		int sum = (int) (prdouctPrice * 1.1);
	//		return sum;
	//	}
	
	//////////////////////////////////////////////////////////////////
	// 메서드의 매개변수가 많아 질떄의 문제
	// 학생 : 학번, 이름, 나이, 전화번호, 수업, 성적
	static void studentInfoPrint(String studenNumber, String name, int age, String telNumber, String course, String grade) {
		System.out.println("학번 : " + studenNumber);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + telNumber);
		System.out.println("수업 : " + course);
		System.out.println("성적 : " + grade);
	}
	
	static void studentInfoPrint(Dto dto) {
		System.out.println("학번 : " + dto.studenNumber);
		System.out.println("이름 : " + dto.name);
		System.out.println("나이 : " + dto.age);
		System.out.println("전화번호 : " + dto.telNumber);
		System.out.println("수업 : " + dto.course);
		System.out.println("성적 : " + dto.grade);
	}

	//////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		studentInfoPrint("123123", "호우", 30, "010-1111-1111", "경영학", "A+");
		
		Dto dto = new Dto();
		dto.studenNumber = "123123";
		dto.name 		 = "호우";
		dto.age 		 = 30;
		dto.telNumber 	 = "010-1111-1111";
		dto.course 		 = "경영학";
		dto.grade 		 = "A+";
		
		studentInfoPrint(dto);
		
	}

}

class Dto {
	String studenNumber; 
	String name; 
	int age; 
	String telNumber; 
	String course; 
	String grade;
} 





