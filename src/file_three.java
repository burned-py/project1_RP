import java.util.Arrays;

public class file_three {
    public static void main(String[] args)
    {
        String a = "Katharina";
        String b = "Max";
        String c = "Hozan";

        String[] teilnehmerListe = new String[3];

        teilnehmerListe[0] = a;
        teilnehmerListe[1] = b;
        teilnehmerListe[2] = c;

        //System.out.println(teilnehmerListe[2]);
        System.out.println(Arrays.toString(teilnehmerListe));



    }
}
