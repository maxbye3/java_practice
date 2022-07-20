public class MatchingDna {
    public static void main(String[] args) throws Exception {
        String dna = DnaStrand("ATTGC");
        System.out.println("dna" + dna);
    }

    private static char getComplement(char c) {
        switch (c) {
            case 'A':
                return 'T';
            case 'T':
                return 'A';
            case 'C':
                return 'G';
            case 'G':
                return 'C';
        }
        return c;
    }

    public static String DnaStrand(String dna) {
        String newDna = ""; 
        for (char dnaChar : dna.toCharArray()) {
            newDna += getComplement(dnaChar);
        }

        return new String(newDna);
    }
}
// "ATTGC" --> "TAACG"
// "GTAT" --> "CATA"
