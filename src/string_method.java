public class string_method {

    public static void main(String[] args) {
        String myText = "supercalifragilisticexpialidocious";

        //aufrufen (--> zwei verschiedene Arten)
        System.out.println(lengthTest("fancy ist hier drin"));
        enthalt(myText);
    }

    public static String lengthTest(String s) {
        if (s.length() >= 20) {
            return "gleich oder länger";
        } else {
            return "kürzer";
        }
    }

    public static void enthalt(String s) {
        if (s.contains("fancy")) {
            System.out.println("super fancy text");
        }
        else {
            System.out.println("not fancy");
        }
    }

    //caller --> geht noch nicht (Screenshot)
    public static boolean bothTrue(String s) {
        return lengthTest(s) && enthalt(s);
    }
}
