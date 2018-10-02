public class BinarySearch {
    int binarySearch(int[] arr,int s){
        int r = -1;
        int L = 0;
        int R = arr.length - 1;
        while (L <= R) {
            int k = (L + R) / 2;
            if (arr[k] == s) {
                r = arr[k];
                break;
            }
            else if (arr[k] < s) {
                R = k - 1;
            }
            else if (arr[k] > s) {
                L = k + 1;
            }
        }

        return r;
    }
}
