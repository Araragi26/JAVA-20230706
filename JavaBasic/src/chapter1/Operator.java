package chapter1;

public class Operator {

	public static void main(String[] args) {
		// 연산자
		// 산술연산자, 대입연산자, 비교연산자, 논리연산자, 삼항연산자

		// 1. 산술연산자 : 사칙연산과 관련된 연산자
		int result;
		int a = 15;
		int b = 9;

		// + (더하기) : 좌항에 우항을 더한 값을 반환
		result = 10 + 20; // result : 30
		result = a + b; // result : 24
		// - (빼기) : 좌항에 우항의 뺀 값을 반환
		result = 10 - 20; // result : -10
		result = a - b; // result : 6
		// * (곱하기) : 좌항에 우항을 곱한 값을 반환
		result = 10 * 20; // result : 200
		result = a * b; // result : 135
		// / (나누기) : 좌항에 우항을 나눈 값을 반환
		// 두항이 모두 정수일 때는 나눈 값의 정수부만 반환
		// 두 항 중 하나라도 실수이면 나눈 값이 그대로 저장
		result = 16 / 5;
		System.out.println(result);
		System.out.println(16 / 5.0);
		// % (나머지) : 좌항에 우항을 나눈 나머지를 반환
		result = 16 % 5; // result : 1

		// ++, -- : 증감 연산자로 피 연사자를 1 증가 혹은 감소 함
		// 증감 연산자가 피연산자의 앞에 오느냐 뒤에 오냐에 따라 연산되어지는 순서가 다름
		// 증감 연사자는 피연산자가 반드시 일반 변수이어야함
		int c = 10;
		System.out.println(c);
		System.out.println(++c);
		System.out.println(c);
		System.out.println(c++);
		System.out.println(c); // c : 12

		result = 10 + ++c; // result : 23 / c : 13
		result = 20 - c++; // result : 7 / c : 14
		result = 20 - c-- + 10; // result : 16 / c : 13
		// result = ++10; 리터럴 값의 변수는 값을 변경할 수 없다

		// 2. 대입연산자 : 변수의 값을 할당할 때 사용하는 연산자
		// 좌항은 무조건 변수이어야 된다
		// = : 좌항에 우항의 결과를 대입
		result = 5;
		// +=, -=, *=, /=, %= : 좌항에 우항과 좌항을 연산한 결과를 대입
		result += 3; // result : 8 result = result + 3; 과 같은 연산식이다.
		result -= 2; // result : 6
		result *= 2; // result : 12
		result /= 5; // result : 2
		result %= 3; // result : 2

		// 3. 비교연산자 : 두 값을 비교하여 논리값의 결과를 반환하는 연산자
		boolean compareResulr;
		// == : 좌항이 우항과 같은지를 비교
		compareResulr = a == b;
		System.out.println(compareResulr);

		// != : 좌항이 우항과 다른지를 비교
		compareResulr = a != b;
		System.out.println(compareResulr);

		// >, >= : 좌항이 우항보다 큰지, 크거나 같은지를 비교
		compareResulr = a >= b;
		System.out.println(compareResulr);

		// <, <= : 좌항이 우항보다 작은지, 작거나 같은지를 비교
		compareResulr = a <= b;
		System.out.println(compareResulr);

		// 4. 논리 연산자 : 논리 값을 조합혹은 반전할 때 사용하는 연산자

		final boolean TRUE = true;
		final boolean FALSE = false;

		// && : 좌항과 우항이 모두 true일 때 true, 하나라도 false면 false 반환
		compareResulr = TRUE && TRUE;
		System.out.println(compareResulr);
		compareResulr = TRUE && FALSE;
		System.out.println(compareResulr);
		compareResulr = FALSE && TRUE;
		System.out.println(compareResulr);

		// || : 좌항과 우항 중 하나라도 true면 true, 모두 false면 false 반환
		compareResulr = TRUE || TRUE;
		System.out.println(compareResulr);
		compareResulr = TRUE || FALSE;
		System.out.println(compareResulr);
		compareResulr = FALSE || FALSE;
		System.out.println(compareResulr);

		// ! : 논리값을 반전 시키는 연산자
		compareResulr = !TRUE;
		System.out.println(compareResulr);
		compareResulr = !FALSE;
		System.out.println(compareResulr);

		// 5. 삼항연산자 : 논리 표현식의 결과에 따라 서로 다른 결과를 반환하는 연산자
		// 논리표현식 ? 참일때 결과(표현식) : 거짓일때 결과(표현식);
		a = 9;
		String message = a > b ? "a는 b보다 큽니다." : (a < b ? "a는 b보다 작습니다." : "a는 b와 같습니다.");
		System.out.println(message);

	}

}
