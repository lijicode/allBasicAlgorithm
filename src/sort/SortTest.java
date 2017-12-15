package sort;

public class SortTest {
    public static void main(String[] args) {
        int[] array1 = {6, 5, 4, 3, 2, 1};
        int[] array2 = {60, 55, 48, 37, 10, 90, 84, 36};
        int[] array = {10, 50, 32,5,76,9,40,88};
//        BubbleSort.sort(array);
//        QuickSort.sort(array,0,array.length-1);
        HeapSort.sort(array);
        for (int i=0;i<array.length-1;i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println(array[array.length - 1]);
    }
}
