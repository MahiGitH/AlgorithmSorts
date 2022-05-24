package BubbleSorts;

import java.util.Arrays;

public class MainN10 {
    static void bubbleSort(int arrayTen[]) {
        int arraySize = arrayTen.length;

        // loop to access each array element
        for (int i = 0; i < arraySize - 1; i++)

            // loop to compare array elements
            for (int j = 0; j < arraySize - i - 1; j++)

                // compare two adjacent elements
                // change > to < to sort in descending order
                if (arrayTen[j] > arrayTen[j + 1]) {

                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = arrayTen[j];
                    arrayTen[j] = arrayTen[j + 1];
                    arrayTen[j + 1] = temp;
                }
    }

    public static void main(String[] args) {

        int [] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // call method using class name
        MainN5.bubbleSort(array);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(array).replace("[", "")
                .replace("]", "")
                .replace(",", " "));
    }
}
