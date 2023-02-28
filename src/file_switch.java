import java.util.Arrays;

public class file_switch {
    public static void main(String[] args)
    {
        int[] dayNum = {0,1,2,3,4,5};
        String[] dayName = {"Montag","Dienstag","Mittwoch","Donnerstag","Freitag"};
        int i=0;

        switch (i) {
            case 1:
                System.out.println(dayName[i] + "Nudeln");
                break;
            case 2:
                System.out.println("Dienstag: Kartoffeln");
                break;
            case 3:
                System.out.println("Mittwoch: Reis");
                break;
            case 4:
                System.out.println("Donnerstag: Salat");
                break;
            case 5:
                System.out.println("Freitag: Fisch");
                break;
            default:
                System.out.println("Wochenende: Hunger, weil zu faul.");
        }





    }
}
