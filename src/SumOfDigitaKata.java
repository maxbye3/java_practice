public class SumOfDigitaKata {
    public static void main(String[] args) throws Exception {
        System.out.println(digital_root(132189));
       
    }    

    public static int digital_root(int n) {
        while(n > 9){
            n = n/10 + n % 10;
        }
        // int total = 0; 
        // while(n >= 1)
		// {
        //     int temp = n;
		// 	n /= 10;
        //     int accumulator = temp - (n*10);
        //     total += accumulator;
		// }
        // while(total >= 10){
        //     total = digital_root(total);
        // }
        return n;        
    }
}
