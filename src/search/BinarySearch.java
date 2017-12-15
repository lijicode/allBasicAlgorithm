package search;

//二分法
public class BinarySearch {
    //非递归算法
    public static int search(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    //递归算法
    public static int search(int[] array, int low, int high, int key) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (array[mid] == key) {
            return mid;
        } else if (array[mid] > key) {
            return search(array, low, mid - 1, key);
        } else {
            return search(array, mid + 1, high, key);
        }
    }
}
