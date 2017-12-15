package sort;


/**
 * 冒泡排序
 * 基本思想：通过相邻元素之间的比较和交换，
 * 每一轮把最小或者最大的元素移到顶部，
 * 下一轮移动除去已经确定位置的元素的剩余的元素
 */
public class BubbleSort {
    public static void sort(int[] array) {
        int temp;
        //如果进行某一趟冒泡排序的过程中，如果没有出现元素的交换，则表明数据元素集合已经全部排好序，此时应该提前结束排序过程。
        int flag = 1;

        for (int i = 1; i < array.length && flag == 1; i++) {
            flag = 0;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    flag = 1;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
