package search;
public class SearchTest {
    public static void main(String[] args) {
        int[] array = {0,1, 2, 3,4,5,6};
        int key=5;
        System.out.println(BinarySearch.search(array,key));
        System.out.println(BinarySearch.search(array,0,array.length-1,key));
    }


}
