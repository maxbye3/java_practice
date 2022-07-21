public class TrollKata {
    public static void main(String[] args) throws Exception {
        String str = "This website is for losers LOL!";
        System.out.println(disemvowel(str));
        // "Ths wbst s fr lsrs LL!".
    }    

    public static String disemvowel(String str) {
        // str = str.replace("a", "");
        // str = str.replace("e", "");
        // str = str.replace("i", "");
        // str = str.replace("o", "");
        // str = str.replace("u", "");
        return str.replaceAll("[aAeEiIoOuU]", "");
    }
}
