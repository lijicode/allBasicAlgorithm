package util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommonUtil {

    //打乱顺序
    public static void shuffle(Comparable[] array) {
        List<Comparable> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.toArray(array);
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void swap(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
