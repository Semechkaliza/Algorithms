public class InterpolSearch {
    int InterpolSearch(int A[], int s)
    {
        int mid, left=0, right=14;
        while (A[left]<=s && A[right]>=s)
        {
            mid=left+((s-A[left])*(right-left))/(A[right]-A[left]);
            if (A[mid]<s) left=mid+1;
            else if (A[mid]>s) right=mid-1;
            else return mid;
        }
        if (A[left]==s) return left;
        else return -1;
    }
}
