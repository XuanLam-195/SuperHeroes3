import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Supperhero Universe.");
        Scanner sc = new Scanner(System.in);
        Database database = new Database();
        final int CREATE = 1;
        final int EXIT = 9;
        int userChoice;

        do {
            System.out.println("Press 1 to 'Create a Superhero'");
            System.out.println("Press 9 to 'Exit Program'");

            userChoice = sc.nextInt();
            if (userChoice == CREATE) {
                System.out.println("Create Superhero:");
                System.out.println("Enter Hero name: ");
                String name = sc.next();
                System.out.println("Enter Hero realname: ");
                String realName = sc.next();
                System.out.println("Hero's superpower");
                String superPower = sc.next();
                System.out.println("year of created: ");
                int yearCreated = sc.nextInt();
                System.out.println("Is hero a human: ");
                String isHuman = sc.next();
                System.out.println("What are  the hero's strength: ");
                double strength = sc.nextDouble();

                Superhero superhero = new Superhero(name, realName, superPower,
                        yearCreated, isHuman, strength);
                database.addHero(superhero);
            }
            System.out.println(database.getHeroList().get(0));
        } while (userChoice != EXIT);
    }
}
