// Quick sort in Java

import java.util.Arrays;

class Quicksort {

    // method to find the partition position
    static int partition(int array[], int lowIndex, int highIndex) {

        // choose the rightmost element as pivot
        int pivot = array[highIndex];

        // pointer for greater element
        int i = (lowIndex - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = lowIndex; j < highIndex; j++) {
            if (array[j] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;

                // swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        // swept the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[highIndex];
        array[highIndex] = temp;

        // return the position from where partition is done
        return (i + 1);
    }

    static void quickSort(int array[], int low, int high) {
        if (low < high) {

            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pivot = partition(array, low, high);

            // recursive call on the left of pivot
            quickSort(array, low, pivot - 1);

            // recursive call on the right of pivot
            quickSort(array, pivot + 1, high);
        }
    }
}

// Main class
class Main {
    public static void main(String args[]) {

        int[] numbers = { 2, 1, 6, 10, 4, 1, 3, 9, 7};
        System.out.println("Before Sort");
        System.out.println(Arrays.toString(numbers).replace("[", "")
                .replace("]", "")
                .replace(",", " "));

        int size = numbers.length;

        // call quicksort() on array data
        Quicksort.quickSort(numbers, 0, size - 1);

        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(numbers).replace("[", "")
                .replace("]", "")
                .replace(",", " "));
    }
}