import java.sql.SQLOutput;

public class Test2 {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(a);
        updater(a);
        System.out.println(a);

        String[] myNumbers = new String[]{"one", "two", "three"};
        for (int b = 0; b < myNumbers[0].length(); b++) {
            System.out.println(myNumbers[0].charAt(b));
            System.out.println(myNumbers[1].charAt(b));
        }
    }

    public static void updater(int b) {
        b=20;
        int score = 69;
        if (score >= 70) {
            System.out.println("Great score");
        } else if (score >= 50) {
            System.out.println("Decent score");
        }
    }
}
