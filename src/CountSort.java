import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int []arr= {1,30,14,6,9,20,8,2,70,80,33};
        countSort(arr);
        }
    public static void countSort(int[] arr) {
        int []arr2 = new int[101];
        for (int i=0;i<101;i++) {
            arr2[i] = i;
        }
        for (int j : arr) {
            arr2[j] = -1;
        }
        int j=0;
        for (int i=0; i < arr2.length; i++) {
          if (arr2[i] == -1)
              arr[j++] = i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
