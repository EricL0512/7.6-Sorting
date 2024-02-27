import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void printArray(String[] s) {
        for (String str: s) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Algorithm a = new Algorithm();
        System.out.println("Z".compareTo("A"));
        System.out.println("Array Selection Sort");
        printArray(a.selectionSort(new String[]{"Zebra", "alpha"}));
        printArray(a.selectionSort(new String[]{"A", "B", "C", "D", "E", "F"}));
        printArray(a.selectionSort(new String[]{"F", "E", "D", "C", "B", "A"}));
        System.out.println("ArrayList Selection Sort");
        System.out.println(a.selectionSort(new ArrayList<>(Arrays.asList("Zebra", "alpha"))));
        System.out.println(a.selectionSort(new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"))));
        System.out.println(a.selectionSort(new ArrayList<>(Arrays.asList("F", "E", "D", "C", "B", "A"))));
        System.out.println("Array Insertion Sort");
        printArray(a.insertionSort(new String[]{"Zebra", "alpha"}));
        printArray(a.insertionSort(new String[]{"A", "B", "C", "D", "E", "F"}));
        printArray(a.insertionSort(new String[]{"F", "E", "D", "C", "B", "A"}));
        System.out.println("ArrayList Insertion Sort");
        System.out.println(a.insertionSort(new ArrayList<>(Arrays.asList("Zebra", "alpha"))));
        System.out.println(a.insertionSort(new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"))));
        System.out.println(a.insertionSort(new ArrayList<>(Arrays.asList("F", "E", "D", "C", "B", "A"))));
        System.out.println();
    }
}
