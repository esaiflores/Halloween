import java.util.Scanner;

public class monsterSquad {
    Scanner myScanner = new Scanner(System.in);
    String playerName;
    int choice;

    public static void main(String[] args) {
        monsterSquad game = new monsterSquad();
        game.intro();
        game.startGame();

    }

    public void intro () {
        System.out.println("\n"
                );
    }

    public void startGame (){

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("The air is cool and full of fright. Kids in costumes trick or treat in the moons silver light ");
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("They stare at you, fear in their eyes, for you are the scariest monster, and they are scared they might die..");
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You look like...");
        System.out.println();
        System.out.println("1. Dracula");
        System.out.println("2. The Wolf Man");
        System.out.println("3. The Creature from the Black Lagoon");
        System.out.println("4. The Mummy");

        do {
            if (!myScanner.hasNextInt()) {
                String input = myScanner.nextLine();
                System.out.printf("%s is not a proper input.%n", input);
            }
        } while (!myScanner.hasNextInt());

        choice = myScanner.nextInt();
        if (choice == 1) {
            dracula();
            playerName = "Dracula";
        }else if (choice == 2) {
            wolfMan();
            playerName = "Wolf Man";
        }else if (choice == 3) {
            creature();
            playerName = "Creature from the Black Lagoon";
        }else if (choice == 4) {
            mummy();
            playerName = "Mummy";

        }else if (choice != 1 || choice != 2 || choice !=3 || choice != 4 ) {
            System.out.println("That's not what you're dressed as...");
            startGame();
        }
    }

    public void dracula () {
        System.out.println("");
        System.out.println("You look like the dark and mysterious Count" + playerName);

    }

    public void wolfMan () {
        System.out.println("");
        System.out.println("You look like the hairy and ravenous" + playerName);

    }

    public void creature () {
        System.out.println("");
        System.out.println("You look like the slimy and scaly " + playerName );

    }

    public void mummy () {
        System.out.println("");
        System.out.println("You look like the old and bandaged" + playerName);

    }


}
