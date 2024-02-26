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
    }
}
