package sort;

public class MergeSort {

    //把数组A中两个相邻的有序序列array[low]~array[mid]和array[mid+1]~array[high]
    //归并为数组swap中对应位置上的一个有序序列swap[low]~swap[high]
    private static void twoMerge(int[] array, int[] swap, int low, int mid, int high) {
        //分别给指示每个有序序列元素位置的指针赋初值
        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {     //两个有序序列均存在未归并元素
            if (array[i] < array[j])
                swap[k++] = array[i++];
            else
                swap[k++] = array[j++];
        }
        while (i <= mid)
            swap[k++] = array[i++];     //第一个有序序列存在未归并元素
        while (j <= high)
            swap[k++] = array[j++];     //第二个有序序列存在未归并元素
    }

    //把数组array中每个长度为len的有序子序列两两归并到数组swap中
    //若剩余的元素个数大于len而小于2*len，把前len个元素作为一个子序列，
    //把其他剩余元素作为另一个子序列，并对这两个子序列进行二路归并。
    //如剩余的元素个数小于等于len，则直接归并。
    private static void mergePass(int[] array, int[] swap, int len) {
        int p = 0;      //p指向每一对等待归并的第一个元素的下标
        int n = array.length;
        //或者使用 while (p + 2 * len - 1 <= n- 1)
        while (n - p >= 2 * len) {      //两两归并长度均为len的有序子序列
            twoMerge(array, swap, p, p + len - 1, p + 2 * len - 1);
            p += 2 * len;
        }
        //或者使用 if (p + len - 1< n - 1)
        if (n - p > len) {          //归并最后两个长度不等的有序子序列
            twoMerge(array, swap, p, p + len - 1, n - 1);
        } else {
            for (int i = p; i < n; i++) {       //把剩下的最后一个有序子序列复制到swap中
                swap[i] = array[i];
            }
        }
    }

    //为了将最后的结果仍置于数组array中，需要进行的趟数为偶数；
    //如果实际只需奇数趟完成，那么最后还要进行一趟，把所有swap中的值直接复制到array中。
    public static void sort(int[] array) {
        int len = 1;
        int n = array.length;
        int[] swap = new int[n];
        while (len < n) {
            mergePass(array, swap, len);    //从array归并到swap中
            len = 2 * len;
            mergePass(swap, array, len);    //从swap归并到array中
            len = 2 * len;
        }
    }
}
