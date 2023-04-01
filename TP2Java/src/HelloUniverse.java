public class HelloUniverse {
    public static void main(String[] args) {
//        exo 1
        int annee = 2003, nbrePlanete;
        String phrase = "En %d, les planètes du système solaire étaient au nombre de : %d\n";
        if (annee < 2006) {
            nbrePlanete = 9;
            System.out.printf(phrase,annee,nbrePlanete);
        }
        if (annee >= 2006) {
            nbrePlanete = 8;
            System.out.printf(phrase,annee,nbrePlanete);
        }
    }
}
