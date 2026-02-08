import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int []arr={2,9,5,80,30,3,7};
        int temp;
        for (int i=0;i<101;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
