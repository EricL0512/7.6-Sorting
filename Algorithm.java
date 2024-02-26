import java.util.ArrayList;


public class Algorithm {
    public String[] selectionSort(String[] strings) {
        int index;
        for (int i = 0; i < strings.length; i++) {
            index = findMinIndex(i, strings);
            swap(strings, index, i);
        }
        return strings;
    }
    public static int findMinIndex(int index, String[] arr)
    {
        String min = arr[index];
        for(int i = index; i < arr.length; i++)
        {
            if(min.toLowerCase().compareTo(arr[i].toLowerCase()) > 0)
            {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
    public static void swap(String[] arr, int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public ArrayList<String> selectionSort(ArrayList<String> strings) {

    }
}
