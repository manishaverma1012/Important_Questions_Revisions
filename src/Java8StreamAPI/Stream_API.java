package Java8StreamAPI;
import java.util.*;
import java.util.stream.Collectors;

public class Stream_API {
//    Q1. Print the avg age of all the people
//    Ans1: Double result= people.stream().collect(Collectors.averagingInt(Person::getAge));
    //---------------------------------------------------------------------------
//Q2. Create a list of all the people who are either greater than 20 or contain any vowel in their name (uppercase or lowercase)
// Ans2: List<Person> result= people.stream().filter(p->p.getAge()>20 || containsVowel(p.getName())).collect(Collectors.toList());
public static boolean containsVowel(String name)
{
    for (char c : name.toLowerCase().toCharArray()) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
    }
    return false;
}
    //-----------------------------------------------------------------------------
    // Q3. Create a list of people, sorted in ascending order on the basis of age, if age is the same then sort in descending order of name
    // Ans:
}
