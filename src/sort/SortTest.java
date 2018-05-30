package sort;

import util.PrintUtil;

public class SortTest {
    public static void main(String[] args) {
        int[] bubbleSortArray = {6, 5, 4, 3, 2, 1};
        BubbleSort.sort(bubbleSortArray);
        PrintUtil.printByComma(bubbleSortArray, "BubbleSort");

        int[] quickSortArray = {60, 55, 48, 37, 10, 90, 84, 36};
        QuickSort.sort(quickSortArray, 0, quickSortArray.length - 1);
        PrintUtil.printByComma(quickSortArray, "QuickSort");

        Integer[] quickSortArrayNew = {60, 55, 48, 37, 10, 90, 84, 36};
        QuickSortNew.sort(quickSortArrayNew, 0, quickSortArrayNew.length - 1);
        PrintUtil.printByComma(quickSortArrayNew, "QuickSortNew");

        int[] heapSortArray = {10, 50, 32, 5, 76, 9, 40, 88};
        HeapSort.sort(heapSortArray);
        PrintUtil.printByComma(heapSortArray, "HeapSort");

        int[] mergeSortArray = {80, 28, 73, 71, 23, 94, 16, 5, 68, 64, 35};
        MergeSort.sort(mergeSortArray);
        PrintUtil.printByComma(mergeSortArray, "MergeSort");
    }
}
