package sort;

/**
 * 堆排序
 * 堆是具有下列性质的完全二叉树：每个非终端结点大于等于它的孩子结点（大根堆）；
 * 或者每个非终端结点小于等于它的孩子结点（小根堆）。
 * 堆排序基本思想：首先将数据元素集合在概念上看成一颗完全二叉树，病将它转换成一个堆。
 * 在堆中，根结点最大，交换根结点和最后一片叶子结点，删去最后一片叶子。
 * 然后将剩下的结点重新调整为一个堆，这样有找出了次大的元素。
 * 反复进行下去，直到堆中只剩下一个结点为止。
 */
public class HeapSort {
    //调整以array[k]为根结点，且其左右子树都是堆的完全二叉树为一个新堆（大根堆的调整）
    private static void adjustHeap(int[] array, int n, int k) {
        int i = k;    //i指向根结点
        int j = 2 * i + 1;   //j指向其左孩子
        int temp = array[i];  //temp暂存根结点的值
        //如果根结点小，只有一直循环才能把这个值放在合适的位置
        while (j < n) {
            if (j + 1 < n && array[j + 1] > array[j])   //j指向左右孩子中的较大者
                j++;
            if (temp >= array[j])       //根结点最大
                break;
            else {                      //j所指结点最大
                array[i] = array[j];    //j所指结点的值存放到根结点中
                i = j;                  //i指向j所指结点
                j = 2 * i + 1;          //j指向i的左孩子
            }
        }
        array[i] = temp;                //根结点存放到i所指的位置
    }

    private static void creatInitHeap(int[] array) {
        //从最后一个非叶子结点array[i](i=(array.length-1-1)/2)开始
        for (int i = (array.length - 2) / 2; i >= 0; i--)
            adjustHeap(array, array.length, i);
    }

    public static void sort(int[] array) {
        creatInitHeap(array);
        int temp;
        for (int i = array.length - 1; i > 0; i--) {
            temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            adjustHeap(array, i, 0);
        }
    }
}
