public class QuickSort {
    public static void insertSort(int[] arr,int start,int end) {
        int i, j,temp;
        for (i = start; i < end+1; i++)
        {
            temp = arr[i];
            j = i-1;
            while (j >= 0 && arr[j] > temp)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
    }
    static void sort(int arr[], int start, int end) {
        if (arr.length == 0)
            return;
        if (start >= end)
            return;
        int mid = start + (end - start) / 2;
        int aMid = arr[mid];
        int i = start, j = end;
        while (i <= j) {
            while (arr[i] < aMid) {
                i++;
            }
            while (arr[j] > aMid) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (start < j)
            if((j-start)<10){
                insertSort(arr, start, j);
            }else{
                sort(arr, start, j);
            }


        if (end > i)
            if((end-i)<10){
                insertSort(arr, i, end);
            }else{
                sort(arr, i, end);
            }

    }
}
