public class Kyu7ExesAndOhs {
    public static void main(String[] args) throws Exception {
        System.out.println(getXO("zzoo"));
    }   
    
    public static boolean getXO (String str) {
        return str.toLowerCase().chars().filter(ch -> ch == 'x').count() == str.chars().filter(ch -> ch == 'o').count();
    }
  }

