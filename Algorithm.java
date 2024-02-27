import java.util.ArrayList;
import java.util.Arrays;


public class Algorithm {
    public String[] selectionSort(String[] strings) {
        int index;
        for (int i = 0; i < strings.length; i++) {
            index = findMinIndex(i, strings);
            swap(strings, index, i);
        }
        return strings;
    }
    public ArrayList<String> selectionSort(ArrayList<String> strings) {
        String[] strings1 = new String[strings.size()];
        strings1 = strings.toArray(strings1);
        ArrayList<String> result = new ArrayList<>(Arrays.asList(selectionSort(strings1)));
        return result;
    }

    public Integer[] selectionSort(Integer[] integers) {
        int index;
        for (int i = 0; i < integers.length; i++) {
            index = findMinIndex(i, integers);
            swap(integers, index, i);
        }
        return integers;
    }
    public ArrayList<Integer> selectionSortI(ArrayList<Integer> integers) {
        Integer[] integers1 = new Integer[integers.size()];
        integers1 = integers.toArray(integers1);
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(selectionSort(integers1)));
        return result;
    }

    public String[] insertionSort(String[] strings) {
        int index;
        String temp;
        for (int i = 0; i < strings.length; i++) {
            index = i;
            temp = strings[i];
            while(index > 0 && temp.toLowerCase().compareTo(strings[index - 1].toLowerCase()) < 0)
            {
                swap(strings, index, index - 1);
                index--;
            }
        }
        return strings;
    }
    public ArrayList<String> insertionSort(ArrayList<String> strings) {
        String[] strings1 = new String[strings.size()];
        strings1 = strings.toArray(strings1);
        ArrayList<String> result = new ArrayList<>(Arrays.asList(insertionSort(strings1)));
        return result;
    }
    public static int findMinIndex(int index, String[] strings)
    {
        String min = strings[index];
        for(int i = index; i < strings.length; i++)
        {
            if(min.toLowerCase().compareTo(strings[i].toLowerCase()) > 0)
            {
                min = strings[i];
                index = i;
            }
        }
        return index;
    }
    public static int findMinIndex(int index, Integer[] integers)
    {
        int min = integers[index];
        for(int i = index; i < integers.length; i++)
        {
            if(min < integers[i])
            {
                min = integers[i];
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
    public static void swap(Integer[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
