/* 04 소수판별
    동쪽 끝 바다 너머 숫자들이 모여 사는 자연수 나라가 있다.
    어느 날 자연수 나라에 반역자 무리가 있다는 소문이 퍼졌다.
    반역자 무리의 특징은 1과 자기 자신으로만 나누어 떨어지는 수인 '소수'라는 것!
    자연수 나라의 영웅이 되어 '소수'를 찾아내자!
    변수 number_check에 "소수인가?!"라는 입력창을 만들어
    입력된 숫자가 소수라면 "윽.. 분하구나..", 소수가 아니라면 "충성!!"을 출력해주세요.
        (코드가 돌아가는데 걸리는 시간이나 성능 차이는 고려하지 않습니다.)
    소수 : 1과 자기 자신으로만 나누어 떨어지는 수로 2, 3, 5, 7 등이 있습니다.
*/

// 출력 예시 (1)
// 소수인가?! 6
// No
// 출력 예시 (2)
// 소수인가?! 7
// Yes
// 아래의 클래스 FindingPrimes의 pass를 지운 후 코드를 작성해 주세요.

import java.io.IOException;

public class FindingPrimes {
    public static void main(String[] args) throws IOException {
        System.out.println("소수인가?!");

        int currentNumber;
        try {
            currentNumber = System.in.read();
            //System.out.println(currentNumber);

            // pass 다음 라인에 코드를 작성 해 주세요.

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}