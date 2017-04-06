package algorithms;

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

    // exchange two elements in an array.
    private static void exchange(Comparable[] array, int x, int y) {
        Comparable temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    // Check if one element in an array is smaller than its former element.
    private static boolean isSorted(Comparable[] array, int low, int high) {
        for(int i = low + 1; i <= high; i++)
            if(less(array[i], array[i - 1])) return false;
        return true;
    }

    /**
     *  Reorder this array, in ascending way.
     *  @param array the array to be sorted.
     */
    public static void sort(Comparable[] array) {
        int length = array.length;

        for(int i = 0; i < length; i++) {
            for(int j = i + 1; j > 0 && less(array[j], array[j - 1]); j--) {
                exchange(array, j, j - 1);
            }
            assert isSorted(array, 0, i);
        }
        assert isSorted(array);
    }

    /**
     *  Reorder the subarray in ascending way.
     *  @param array the array to be ordered.
     *  @param low the index to start the ordering.
     *  @param high the index to stop the ordering.
     */
    public static void sort(Comparable[] array, int low, int high) {
        int length = array.length;

        for(int i = 0; i < length; i++) {
            for(int j = i + 1; j > 0 && less(array[j], array[j - 1]); j--) {
                exchange(array, j, j - 1);
            }
        }
        assert isSorted(array, low, high);
    }
}
