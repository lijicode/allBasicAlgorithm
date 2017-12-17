package util;

public class PrintUtil {
    public static void printByComma(int[] array,String sortName) {
        System.out.print(sortName+": ");
        for (int i=0;i<array.length-1;i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println(array[array.length - 1]);
    }
}
