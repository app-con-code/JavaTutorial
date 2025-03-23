/* 03 별 찍기(3)
숫자 N(1 ≤ N ≤ 100)을 입력 받아 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 출력해 보세요.
*/

//# 출력 예시
//
// N : 7
// *******
// ******
// *****
// ****
// ***
// **
// *

import java.io.IOException;

public class TriangleEx3 {
    public static void main(String[] args) throws IOException{
        System.out.println("N : ");

        int Number;
        try {
            Number = System.in.read();
            //System.out.println(Number);

            // 다음 라인에 코드를 작성 해 주세요.

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
