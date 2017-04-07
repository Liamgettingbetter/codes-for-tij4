package algorithms;

import java.util.Comparator;

/**
 * Created by Liam on 06/04/2017.
 */
public class SelectionSort {
    // This class should not be initialized.
    private SelectionSort() {
    }

    // Check if the first elements is less than the second one.
    private static boolean less(Comparable x, Comparable y) {
        return x.compareTo(y) < 0;
    }

    // Check if the first elements is less than the second one.
    private static boolean less(Comparator comp, Object a, Object b) {
        return comp.compare(a, b) < 0;
    }

    // exchange two elements in an array.
    private static void exchange(Object[] array, int x, int y) {
        Object temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    /**
     * Reorder this array in ascending way, using the natural order.
     *
     * @param a the array to be ordered.
     */
    public static void sort(Comparable[] a) {
        int length = a.length;

        for (int i = 0; i < length; i++) {
            int min = i;

            // Find the smallest element's index, then assign it to min.
            for (int j = i + 1; j < length; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exchange(a, i, min);
            assert isSorted(a, 0, i);
        }
        assert isSorted(a);
    }

    /**
     * Reorder this array in ascending way, using a comparator.
     *
     * @param a          the array
     * @param comparator the comparator specifying the order.
     */
    public static void sort(Object[] a, Comparator comparator) {
        int length = a.length;

        for (int i = 0; i < length; i++) {
            int min = i;

            // Find the smallest element's index, then assign it to him.
            for (int j = i + 1; j < length; j++) {
                if (less(comparator, a[j], a[min])) min = j;
            }
            exchange(a, i, min);
            assert isSorted(a, comparator, 0, i);
        }
        assert isSorted(a, comparator);
    }

    private static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }

    private static boolean isSorted(Comparable[] a, int low, int high) {
        for(int i = low + 1; i <= high; i++) {
            if(less(i, i - 1)) return false;
        }
        return true;
    }

    private static boolean isSorted(Object[] a, Comparator comp) {
        return isSorted(a, comp, 0, a.length - 1);
    }

    private static boolean isSorted(Object[] a, Comparator comp, int low, int high) {
        for(int i = low + 1; i <= high; i++) {
            if(less(comp, i, i - 1)) return false;
        }
        return true;
    }
}