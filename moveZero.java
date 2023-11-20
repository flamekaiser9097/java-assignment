import java.util.Arrays;

public class moveZero {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array after moving zeros: " + Arrays.toString(moveZeros(arr)));
    }
    
    public static int[] moveZeros(int[] arr) {
        int i = 0;
        int j = 0;
        int n = arr.length;
        
        while (i < n) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        
        return arr;
    }
}
