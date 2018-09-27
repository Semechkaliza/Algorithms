class MergeSort {
    private void merge(Object1 arr[], int a, int b, int e) {
        int m = b - a + 1;
        int n = e - b;
        Object1 m1[] = new Object1[m];
        Object1 m2[] = new Object1[n];
        System.arraycopy(arr, a, m1, 0, m);
        for (int j = 0; j < n; ++j)
            m2[j] = arr[b + 1 + j];
        int c = 0, d = 0;
        int s = a;
        while (c < m && d < n) {
            if (m1[c].a <= m2[d].a) {
                arr[s] = m1[c];
                c++;
            } else {
                arr[s] = m2[d];
                d++;
            }
            s++;
        }
        while (c < m) {
            arr[s] = m1[c];
            s++;c++;
        }
        while (d < n) {
            arr[s] = m2[d];
            d++;s++;
        }
    }
    void sort(Object1 arr[], int s, int e) {
        if (s < e) {
            int m = (s + e) / 2;
            sort(arr, s, m);
            sort(arr, m + 1, e);
            merge(arr, s, m, e);
        }
    }
}