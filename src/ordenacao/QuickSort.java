package ordenacao;

public class QuickSort {
    public static int[] quickSort(int[] v, int left, int right) {
        if (left < right) {
            for (int n : v) {
                System.out.print(n);
            }
            System.out.println();
            int pivot = partition(v, left, right);
            quickSort(v, left, pivot - 1);
            quickSort(v, pivot + 1, right);
        }
        return v;
    }

    public static int partition(int[] v, int left, int right) {
        int pivot = v[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (v[j] <= pivot) {
                i++;
                int aux = v[i];
                v[i] = v[j];
                v[j] = aux;
            }
        }
        int aux = v[i + 1];
        v[i + 1] = v[right];
        v[right] = aux;

        return i + 1;
    }
}
