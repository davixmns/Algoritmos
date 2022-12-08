package ordenacao;

public class InsertionSort {
    public static int[] insertionSort(int[] v) {
        for (int i = 1; i < v.length; i++) {
            int aux = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > aux) {
                v[j + 1] = v[j];
                j -= 1;
            }
            v[j + 1] = aux;
        }
        return v;
    }
}
