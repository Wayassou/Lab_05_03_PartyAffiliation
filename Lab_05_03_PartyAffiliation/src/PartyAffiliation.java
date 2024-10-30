import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your party affiliation (Democrat, Republican, Independent, Other): ");
        String affiliation = input.nextLine();

        if (affiliation.equalsIgnoreCase("Democrat")) {
            System.out.println("You chose Donkey.");
        } else if (affiliation.equalsIgnoreCase("Republican")) {
            System.out.println("You chose Elephant.");
        } else if (affiliation.equalsIgnoreCase("Independent")) {
            System.out.println("You chose Person.");
        } else {
            System.out.println("You chose Other.");
        }
    }
}
