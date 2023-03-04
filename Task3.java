// 3 Реализовать алгоритм пирамидальной сортировки (HeapSort).

import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,23,43,54,100,23,312));
        sortheap(array);
        System.out.println(array);
    }

    private static void sortheap(ArrayList<Integer> array) {

        int size = array.size();

        for (int i = size / 2 - 1; i >= 0; i--) heapify(array, i, size); // деление маасива на части
            
        for (int i = size - 1; i >= 0; i--) {
            int temp = array.get(i);
            array.set(i, array.get(0));
            array.set(0, temp);

            heapify(array, 0, i);
        }
    }

    private static void heapify(ArrayList<Integer> array, int i, int size) {
        int left = i * 2 + 1; 
        int right = i * 2 + 2; 
        int largest = i; 

        if(left < size && array.get(left) > array.get(largest)) {
            largest = left; 
        }

        if(right < size && array.get(right) > array.get(largest)) {
            largest = right; 
        }

        if(largest != i){ 
            int temp = array.get(i);
            array.set(i, array.get(largest));
            array.set(largest, temp);

            heapify(array, largest, size);
        }
    }
}