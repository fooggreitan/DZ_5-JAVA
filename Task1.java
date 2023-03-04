// 1 Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 
// один человек может иметь несколько телефонов.

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        Map<String, ArrayList<String>> array = new HashMap<String, ArrayList<String>>();
        
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("+ 7 932 231 2312", "+ 7 921 342 2312"));
        array.put("Маслов Константив Викторович",  list1);
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("+ 7 911 243 1231"));
        array.put("Когнатьев Константив Александрович", list2);
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("+ 7 932 212 2341", "+ 7 911 231 2313", "+ 7 921 234 2321"));
        array.put("Помарев Матвей Александрович", list3);
        
        System.out.println(array);

    }
}