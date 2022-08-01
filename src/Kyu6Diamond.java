public class Kyu6Diamond {
    public static void main(String[] args) throws Exception {
        System.out.print(printDiamond(5));
    }  
    
    public static String printDiamond(int n) {
        if (n % 2  == 0 || n <= 0) {
            return null;
        }

        StringBuffer expected = new StringBuffer();

        for (int i = 1; i <= n; i+=2) {
        expected.append(" ".repeat((n - i) / 2) + "*".repeat(i) + "\n");
        }
        for (int i = n - 2; i >= 1; i-=2) {
        expected.append(" ".repeat((n - i) / 2) + "*".repeat(i) + "\n");
        }
        
        return expected.toString();
    }

}
