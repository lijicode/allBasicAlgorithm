package util;

public class PrintUtil {
    //打印名字以及通过逗号隔开的数组
    public static void printByComma(Object[] array,String name) {
        System.out.print(name+": ");
        for (int i=0;i<array.length-1;i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println(array[array.length - 1]);
    }

    public static void printByComma(int[] array,String name) {
        System.out.print(name+": ");
        for (int i=0;i<array.length-1;i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println(array[array.length - 1]);
    }

}
