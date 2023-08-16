package Java8StreamAPI;
import java.util.*;
@FunctionalInterface
interface func
{
    void add();
}
public class LambdaExpressionIml {
    public static void main(String[] args) {
        func f=()->{
            System.out.println("perform addition");
        };
        f.add();


    }

}
