/**
 * Created by Александр on 24.02.2015.
 */
public class Proga5_1 {
    public static String[] greet(String[] Names) {

        String[] Greetings = new String[Names.length];
        for (int i = 0; i < Names.length; i++) {
            Greetings[i] = "Привет, "+Names[i];
        }
        return Greetings;
    }

    public static void main(String[] args) {
        String[] Names = new String[5];
        Names[0] = "Вася";
        Names[1] = "Саня";
        Names[2] = "Гриша";
        Names[3] = "Петя";
        Names[4] = "Коля";

        String[] G = greet(Names);
        for (int i = 0; i < Names.length; i++) {
            System.out.println(G[i]);
        }
    }
}
