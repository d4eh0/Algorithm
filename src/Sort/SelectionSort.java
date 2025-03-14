package Sort;

public class SelectionSort extends AbstractSort { // O(N^2)
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N - 1; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min]))
                    min = j;
            }
            exch(a, i, min);
        }
        assert isSorted(a); // 조건이 false이면 AssertionError 발생
    };
    public static void main(String[] args) {
        Integer[] a = {10, 4, 5, 2, 1, 8 ,3 ,6};
        SelectionSort.sort(a);
        SelectionSort.show(a);
    }
}