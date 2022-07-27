import java.util.ArrayList;

public class Kyu7BusKata {
    public static void main(String[] args) throws Exception {
        ArrayList<int[]> myList = new ArrayList<int[]>();

        myList.add(new int[] { 10, 0 });
        myList.add(new int[] { 3, 5 });
        myList.add(new int[] { 2, 5 });
        myList.add(new int[] { 7, 5 });

        int remainingPassangers = countPassengers(myList);
        System.out.println("remainingPassangers" + remainingPassangers);
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        // int count = 0;
        // for(int[] passangers : stops){
        // count += passangers[0];
        // count -= passangers[1];
        // }
        // return count;

        return stops.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
    }

}
