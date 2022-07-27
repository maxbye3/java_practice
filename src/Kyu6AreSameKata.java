import java.util.Arrays;

public class Kyu6AreSameKata {
    public static void main(String[] args) throws Exception {
        // int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        // int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 36100, 25921, 361, 20736, 361};
        System.out.print(comp(a, b));
    }  
    
    public static boolean comp(final int[] a, final int[] b) {
        return a != null && b != null && a.length == b.length && Arrays.equals(Arrays.stream(a).map(i -> i * i).sorted().toArray(), Arrays.stream(b).sorted().toArray());
    }

}
