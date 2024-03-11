public class MinMax {

     public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] minmax = {2, 3, 5, 7, 9, 11, 13, 17, 19, 23};
        long stminmax = System.nanoTime();
        int min = findMin(minmax);
        long endminmax = System.nanoTime();

        int max = findMax(minmax);
       // long endminmax = System.nanoTime();
        long time=endminmax-stminmax;
        System.out.println("Minimum " + min +" Maximum "+ max + " Time "+time);
    }

}
