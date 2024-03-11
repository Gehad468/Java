
public class binarySearch {
    //method
    public static int binarysearch(int[] arr, int searchElement) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == searchElement) {
                return mid;
            }
            if (arr[mid] < searchElement) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; 
    }
public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int searchElement = 10;
    long start = System.nanoTime();
    int result = binarysearch(arr, searchElement);
    long end = System.nanoTime();
    long cur = end - start;
    System.out.println("index "+ result+" Time "+cur);
    
}

}