package sort;

import util.CommonUtil;

/**
 * 全新的快速排序，用的是《算法 第四版》的思想
 *
 * 基本思想：
 * 取 a[lo] 作为切分元素，然后从数组的左端向右扫描直到找到第一个大于等于它的元素，
 * 再从数组的右端向左扫描找到第一个小于等于它的元素，
 * 交换这两个元素，并不断进行这个过程，就可以保证左指针 i 的左侧元素都不大于切分元素，
 * 右指针 j 的右侧元素都不小于切分元素。当两个指针相遇时，将切分元素 a[lo] 和 a[j] 交换位置。
 */
public class QuickSortNew {
    public static void sort(Comparable[] a) {
        CommonUtil.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    public static void sort(Comparable[] a, int low, int high) {
        if (high <= low)
            return;
        int j = partition(a, low, high);
        sort(a, low, j - 1);
        sort(a, j + 1, high);
    }

    private static int partition(Comparable[] a, int low, int high) {
        int i = low, j = high + 1;
        Comparable v = a[low];
        while (true) {
            while (CommonUtil.less(a[++i], v) && i != high) ;
            while (CommonUtil.less(v, a[--j]) && j != low) ;
            if (i >= j)
                break;
            CommonUtil.swap(a, i, j);
        }
        CommonUtil.swap(a, low, j);
        return j;
    }

}
