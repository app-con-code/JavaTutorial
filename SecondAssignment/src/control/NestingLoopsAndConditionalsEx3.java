/* 08 반복문과 조건문 활용(3)
    아래의 Classes 클래스 안에 있는 학생들 중 20세 이상인 학생들을 students_20s에 담는 코드를 작성한 후 출력 결과와 동일한 출력을 해주세요.
*/

// 주어진 변수(Classes, students_20s) 및 System.out.println(students_20s) 직접 수정 불가
// 출력 결과 :
// 세종대왕
// 신사임당
// 왕건
// 하정우
package control;

public class NestingLoopsAndConditionalsEx3 {
    public static void main(String[] args) {

        Classes class1001 = new Classes(1001, "Class01");
        class1001.addClasses("홍길동", 14);
        class1001.addClasses("세종대왕", 24);
        class1001.addClasses("신사임당", 27);
        class1001.addClasses("이순신", 9);
        class1001.addClasses("왕건", 21);

        Classes class1002 = new Classes(1002, "Class02");
        class1002.addClasses("하정우", 24);
        class1002.addClasses("이병헌", 9);
        class1002.addClasses("강동원", 11);
        class1002.addClasses("이민정", 12);
        class1002.addClasses("한효주", 14);

        //class1001.showStudentInfo();
        //System.out.println("======================================");
        //class1002.showStudentInfo();
        int[] students_20s = {};
        // 다음 라인에 코드를 작성 해 주세요.
    }
}
