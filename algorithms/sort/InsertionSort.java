package algorithms.sort;

import java.util.Comparator;
import java.util.Random;

/**
 * Created by Liam on 06/04/2017.
 */
public class InsertionSort {
    // This class should not be instantiated.
    private InsertionSort() {}

    // Check if one element is less than another.
    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    // Overload version of less.
    private static boolean less(Comparator comp, Object a, Object b) {
        return comp.compare(a, b) < 0;
    }

    // Exchange two elements in an array.
    private static void exchange(Object[] array, int x, int y) {
        Object temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    // Check if one element in an array is smaller than its former element.
    private static boolean isSorted(Comparable[] array, int low, int high) {
        for(int i = low + 1; i <= high; i++)
            if(less(array[i], array[i - 1])) return false;
        return true;
    }

    private static boolean isSorted(Object[] array, Comparator comp, int low, int high) {
        for(int i = low + 1; i <= high; i++)
            if(less(comp, array[i], array[i - 1])) return false;
        return true;
    }

    private static void show(Comparable[] array) {
        for(Comparable c : array)
            System.out.print(c + " ");
        System.out.println();
    }

    /**
     *  Reorder this array, in ascending way.
     *  @param array the array to be sorted.
     */
    public static void sort(Comparable[] array) {
        int length = array.length;
        sort(array, 0, length - 1);
    }

    /**
     *  Reorder the subarray in ascending way.
     *  @param array the array to be ordered.
     *  @param low the index to start the ordering.
     *  @param high the index to stop the ordering.
     */
    public static void sort(Comparable[] array, int low, int high) {
        for(int i = low; i < high - 1; i++) {
            for(int j = i + 1; j > low && less(array[j], array[j - 1]); j--) {
                exchange(array, j, j - 1);
            }
        }
        assert isSorted(array, low, high);
    }

    /**
     *  Reorder the array in ascending way, using a comparator.
     *  @param comp the comparator we used to sort the array.
     *  @param array the array to be sorted.
     */
    public static void sort(Object[] array, Comparator comp) {
        int length = array.length;
        sort(array, comp, 0, length - 1);
    }

    /**
     *  Reorder the subarray in ascending way, using a comparator.
     *  @param array the array to be sorted.
     *  @param comp the comparator we used.
     *  @param low the index to start.
     *  @param high the index to stop.
     */
    public static void sort(Object[] array, Comparator comp, int low, int high) {
        for(int i = low; i < high - 1; i++) {
            for(int j = i + 1; j > low && less(comp, array[j], array[j - 1]); j--) {
                exchange(array, j, j - 1);
            }
        }
        assert isSorted(array, comp, low, high);
    }

    public static void main(String[] args) {
        Random rand = new Random(122);
        Integer[] array = new Integer[10];

        for(int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(100);
        }

        show(array);
        sort(array);
        show(array);
    }
}