package Sort;

public class InsertionSort extends AbstractSort { // O(N) ~ O(N^2)
    public static void sort(Comparable[] a) {
        int N = a.length;
        for(int i = 1; i < N; i++) {
            int min = i;
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
                exch(a, j, j - 1);
        }
        assert isSorted(a);
    }

    public static void main(String[] args) {
        Integer[] a = {10, 4, 5, 2, 1, 8 ,3 ,6};
        InsertionSort.sort(a);
        InsertionSort.show(a);
    }
}
