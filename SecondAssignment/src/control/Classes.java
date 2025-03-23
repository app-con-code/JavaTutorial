package control;

import java.util.ArrayList;

public class Classes {

    int classRN;
    String className;
    ArrayList<Student> studentList;

    public Classes(int classRN, String className){
        this.classRN = classRN;
        this.className = className;

        studentList = new ArrayList<Student>();
    }

    public void addClasses(String name, int age){
        Student student = new Student();

        student.setName(name);
        student.setAge(age);
        studentList.add(student);
    }

    public void showStudentInfo()
    {
        int total = 0;

        for(Student s : studentList){

            total += s.getAge();
            System.out.println("교실 " + className + "의 " + s.getName() + " 나이는 " +
                    s.getAge() + "입니다.");
        }

        System.out.println("교실 " + className + "의 평균나이는 " + total + " 입니다.");
    }
}