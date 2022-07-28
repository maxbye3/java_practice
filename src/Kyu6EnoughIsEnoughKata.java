import java.util.Arrays;
import java.util.HashMap;

public class Kyu6EnoughIsEnoughKata {
    public static void main(String[] args) throws Exception {
        int[] input = {1,2,3,1,2,1,2,3};
        System.out.println(deleteNth(input, 2));
        // [1,2,3,1,2]
        // [1,2]
    }   
    
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return Arrays.stream(elements)
                .filter(element -> map.merge(element, 1, Integer::sum) <= maxOccurrences)
                .toArray();
  }

}

