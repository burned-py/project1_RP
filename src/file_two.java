import java.security.spec.RSAOtherPrimeInfo;

public class file_two {
    public static void main(String[] args)
    {

        int deineGröße = 166;
        int meineGröße = 178;

        if (deineGröße > meineGröße) {
            System.out.println("du bist mit " + deineGröße +
                    " cm genau " + (deineGröße - meineGröße) + " cm" + " größer als ich");
        } else if (deineGröße < meineGröße) {
            System.out.println("du bist mit " + deineGröße +
                    " cm genau " + ((-1)*(deineGröße-meineGröße)) + " cm" + " kleiner als ich");
        } else {
            System.out.println("Wert ist kleiner als 3");
        }

    }
}
