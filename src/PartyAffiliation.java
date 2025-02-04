import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PartyAffiliation {
    public static void main(String[] args) {
        System.out.println("Pick a political party (enter R, D, I or Other)");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.equals("R")) {System.out.println("You got republican.");}
        if (input.equals("D")) {System.out.println("You got...DEMOCRAT DONKEY!");}
        if (input.equals("I")) {System.out.println("You got...INDEPENDENT MAN!");}
        if (input.equals("Other")) {System.out.println("You got...OTHER!");}
    }
}