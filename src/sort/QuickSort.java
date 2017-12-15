package sort;

/**
 * 快速排序（C++书上的思想）
 * 基本思想：每一轮结束后，前面单元中所有元素都小于基准元素，
 * 后面单元中所有元素都大于等于基准元素，
 * 基准元素的当前位置就是排序后的最终位置
 */
public class QuickSort {
    public static void sort(int[] array, int low, int high) {
        int i = low;   //i从区间最左端开始
        int j = high;  //j从区间最右端开始
        int temp = array[low];  //取区间中第一个元素为基准元素
        while (i < j) {
            while (i < j && array[j] >= temp)  //在区间右端寻找小于基准元素的元素
                j--;
            if (i < j) {
                array[i] = array[j];
                i++;
            }
            while (i < j && array[i] < temp)   //在区间左端寻找大于等于基准元素的元素
                i++;
            if (i < j) {
                array[j] = array[i];
                j--;
            }
        }
        array[i] = temp;   //i或j的位置就是基准元素的最终位置
        if (i - low > 1) sort(array, low, i - 1);   //左区间中不止一个元素，递归处理左区间
        if (high - i > 1) sort(array, i + 1, high);  //右区间中不止一个元素，递归处理右区间
    }
}
