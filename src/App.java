public class App {
    public static void main(String[] args) throws Exception {
        String number = createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}); 
        System.out.println("number" + number); 
    }
    
    public static String createPhoneNumber(int[] numbers) {
        String phoneString = "(";  
        for (int i = 0; i < numbers.length; i++) {
            phoneString += numbers[i];
            if(i == 2){
                phoneString += ") ";
            } else if (i == 5){
                phoneString += "-";
            }
        }
        // return phoneString;
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
    }
}


