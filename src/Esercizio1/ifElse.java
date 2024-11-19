package Esercizio1;

public class ifElse {
    public static boolean stringaPariDispari(String str) {
        if (str.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                if (anno % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }



    public static void main(String[] args) {

        System.out.println("***********************************************************");

        String string1 = "Riccardo";
        String string2 = "Santilli";


        System.out.println("numero parole pari o dispari:");
        System.out.println("La stringa '" + string1 + "' contiene lettere pari ? " + stringaPariDispari(string1));
        System.out.println("La stringa '" + string2 + "' contiene lettere pari ? " + stringaPariDispari(string2));


        System.out.println("***********************************************************");

        int anno1 = 2024;
        int anno2 = 2008;
        int anno3 = 2035;
        int anno4 = 2865;

        System.out.println("Test annoBisestile");
        System.out.println("L'anno" + anno1 + " e' bisestile ? " + annoBisestile(anno1));
        System.out.println("L'anno" + anno2 + " e' bisestile ? " + annoBisestile(anno2));
        System.out.println("L'anno" + anno3 + " e' bisestile ? " + annoBisestile(anno3));
        System.out.println("L'anno" + anno4 + " e' bisestile ? " + annoBisestile(anno4));



    }

}
