public class sixxx {
    public static void main(String[] args) {
        //
        //
        //
        int a = 3;
        int b = 8;
        int f = 99;
        int g = 101;

        String text = "Summe: ";

        System.out.println(sumOfTwo(a, b));
    }

    public static int sumOfTwo(int a, int b) {
        return a + b;
    }

    public static String functionTwo(int a, int b, String text) {
        return "Summe: " + (a + b);

    }

    /*
    public static void funcThree(int f, int g) {
        if (f > 100 || g > 100) {
            System.out.println("");
        }
    }


    public static void funcBonus(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen Text ein und drücken Sie ENTER:");
        String input = scanner.nextLine();

        System.out.println("\n" + "Ihr Text: " + input);
    }
    */
}
