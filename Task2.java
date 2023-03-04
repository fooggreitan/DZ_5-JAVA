// 2 Пусть дан список сотрудников: Иван, Пётр, 
// Антон и так далее. Написать программу, 
// которая найдет и выведет повторяющиеся имена с 
// количеством повторений. Отсортировать по убыванию популярности.

import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        LinkedList<String> array = new LinkedList<>(Arrays.asList("Иван", "Константин", "Матвей", "Константин", "Вера", "Матвей", "Матвей"));
        Map<String, Integer> newarray = new HashMap<>();
        sort(array, newarray);

    }

    private static void sort(LinkedList<String> array, Map<String, Integer> newarray){
        for (String key : array) {
            if (newarray.containsKey(key)) newarray.put(key, newarray.get(key) + 1);
            else newarray.put(key, 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(newarray.entrySet());
        Collections.sort(list, Map.Entry.comparingByValue(Comparator.reverseOrder()));
        System.out.println(list);
    }
}

