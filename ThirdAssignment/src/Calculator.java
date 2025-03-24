/* 06 메서드
    사칙연산인 더하기, 빼기, 곱하기, 나누기를 add, sub, mul, div라고 가정한다. 아래의 함수 calculate의 pass를 지우고 코드를 작성한 후
    주어진 입력 값을 차례로 입력했을 때 출력 결과와 같은 출력을 해주세요.
    (만약, 오타를 입력하면 '잘못 입력하셨습니다. 다시 입력해 주세요.'를 출력한 후 다시 시작하는 코드를 작성해 주세요.)

    첫 번째 입력 값 : ddd 1 2
    두 번째 입력 값 : mul 4 4
*/
//calculate()메서드의 pass를 지운 후 코드를 작성해 주세요.
//주어진 변수(oper, num1, num2) 및 calculate()메서드 직접 변경 불가
//출력 결과 :
//계산 할 사칙연산, 첫 번째 숫자, 두 번째 숫자를 입력해 주세요.(공백을 기준으로 분리)ddd 1 2
//잘못 입력하셨습니다. 다시 입력해 주세요.
//계산 할 사칙연산, 첫 번째 숫자, 두 번째 숫자를 입력해 주세요.(공백을 기준으로 분리)mul 4 4
//16
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("계산 할 사칙연산, 첫 번째 숫자, 두 번째 숫자를 입력해 주세요.(공백을 기준으로 분리)");
        String oper = scanner.next();
        String num1 = scanner.next();
        String num2 = scanner.next();

        calculate(oper, num1, num2);

        scanner.close();
    }

    public static void calculate(String oper, String num1, String num2) {
        // pass
    }
}