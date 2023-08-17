package Tek_Volvo.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
    int marks;
    int age;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Student(int marks, int age)
    {
        this.marks=marks;
        this.age=age;
    }


}

public class StreamClass {
    public static void main(String[] args) {
        List<Student> student=new ArrayList<>();
        student.add(new Student(45 ,18));
        student.add(new Student(65 ,19));
        student.add(new Student(55 ,16));
        student.add(new Student(75 ,17));
        student.add(new Student(95 ,12));
        List<Student> marklist=student.stream().filter(item->item.getMarks()>60 && item.getAge()>18).collect(Collectors.toList());
        for(Student item:marklist)
        {
            System.out.println(item.getAge()+" "+ item.getMarks());
        }
    }
}
