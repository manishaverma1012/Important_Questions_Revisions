package Tek_Volvo.InterviewQuestions;

public class Singleton {
    private Singleton()
    {

    }
    private static Singleton instance;
    public static Singleton getInstance()
    {
        if(instance==null)
        {
            instance=new Singleton();
      }
        return instance;
    }
    public void Display()
    {
        System.out.println("Singleton");
    }
}

