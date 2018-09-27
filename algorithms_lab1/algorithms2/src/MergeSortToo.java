class MergeSortToo {
        private void merge(Object2[] arr, int a, int b, int e, Object1[] list) {
            int m = b - a + 1;
            int n = e - b;
            Object2 m1[] = new Object2[m];
            Object2 m2[] = new Object2[n];
            System.arraycopy(arr, a, m1, 0, m);
            for (int j = 0; j < n; ++j)
                m2[j] = arr[b + 1 + j];
            int c = 0, d = 0;
            int s = a;
            while (c < m && d < n) {
                if ((find(m1[c].b,list)).a <=(find(m2[d].b,list).a)) {
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
                s++;d++;

            }
        }
    void sort(Object2 arr[], int s, int e,Object1[] list) {
        if (s < e) {
            int m = (s + e) / 2;
            sort(arr, s, m,list);
            sort(arr, m + 1, e,list);
            merge(arr, s, m, e,list);
        }
    }
        static Object1 find(String b,Object1[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].b == b) {
                    return arr[i];
                }
            }
            return null;
        }
}
