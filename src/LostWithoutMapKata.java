import java.util.Arrays;

public class LostWithoutMapKata {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,3};
        System.out.println(doubleArr(arr));
    }    

    public static int[] doubleArr(int[] arr) {
        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = arr[i] * 2;
        // }
        // return arr;
        return Arrays.stream(arr).map(x -> x*2).toArray();
    }
}
