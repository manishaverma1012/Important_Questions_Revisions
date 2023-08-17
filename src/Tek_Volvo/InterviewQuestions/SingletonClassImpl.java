package Tek_Volvo.InterviewQuestions;

public class SingletonClassImpl {

    public static void main(String[] args) {
        Singleton singleton= Singleton.getInstance();
        singleton.Display();
        Singleton singleton1= Singleton.getInstance();
        singleton1.Display();
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());


    }
}
