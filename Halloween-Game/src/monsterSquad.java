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
        System.out.println("What are you going to do as " + playerName);
        System.out.println("1. Trick or Treat");
        System.out.println();
        System.out.println("2. Go see what the kids are whispering about in the treehouse");


        do {
            if (!myScanner.hasNextInt()) {
                String input = myScanner.nextLine();
                System.out.printf("%s is not a proper input.%n", input);
            }
        } while (!myScanner.hasNextInt());

        choice = myScanner.nextInt();

        if(choice == 1) {
            System.out.println("You got loads of candy");
//            Might want to add randomizer for pieces of candy'
            dracula();
        } else if(choice == 2){
            treehouse();
        } else if (choice != 1 || choice != 2 ) {
            System.out.println("That is not a choice.");
            dracula();
        }

    }

    public void wolfMan () {
        System.out.println("");
        System.out.println("You look like the hairy and ravenous" + playerName);
        System.out.println("What are you going to do as " + playerName);
        System.out.println("1. Trick or Treat");
        System.out.println();
        System.out.println("2. Go see what the kids are whispering about in the treehouse");

        do {
            if (!myScanner.hasNextInt()) {
                String input = myScanner.nextLine();
                System.out.printf("%s is not a proper input.%n", input);
            }
        } while (!myScanner.hasNextInt());

        choice = myScanner.nextInt();

        if(choice == 1) {
            System.out.println("You got loads of candy");
//            Might want to add randomizer for pieces of candy'
            wolfMan();
        } else if(choice == 2){
            treehouse();
        } else if (choice != 1 || choice != 2 ) {
            System.out.println("That is not a choice.");
            wolfMan();
        }



    }

    public void creature () {
        System.out.println("");
        System.out.println("You look like the slimy and scaly " + playerName );
        System.out.println("What are you going to do as " + playerName);
        System.out.println("1. Trick or Treat");
        System.out.println();
        System.out.println("2. Go see what the kids are whispering about in the treehouse");

        do {
            if (!myScanner.hasNextInt()) {
                String input = myScanner.nextLine();
                System.out.printf("%s is not a proper input.%n", input);
            }
        } while (!myScanner.hasNextInt());

        choice = myScanner.nextInt();

        if(choice == 1) {
            System.out.println("You got loads of candy");
//            Might want to add randomizer for pieces of candy'
            creature();
        } else if(choice == 2){
            treehouse();
        } else if (choice != 1 || choice != 2 ) {
            System.out.println("That is not a choice.");
            creature();
        }

    }

    public void mummy () {
        System.out.println("");
        System.out.println("You look like the old and bandaged" + playerName);
        System.out.println("What are you going to do as " + playerName);
        System.out.println("1. Trick or Treat");
        System.out.println();
        System.out.println("2. Go see what the kids are whispering about in the treehouse");

        do {
            if (!myScanner.hasNextInt()) {
                String input = myScanner.nextLine();
                System.out.printf("%s is not a proper input.%n", input);
            }
        } while (!myScanner.hasNextInt());

        choice = myScanner.nextInt();

        if(choice == 1) {
            System.out.println("You got loads of candy");
//            Might want to add randomizer for pieces of candy'
            mummy();
        } else if(choice == 2){
            treehouse();
        } else if (choice != 1 || choice != 2 ) {
            System.out.println("That is not a choice.");
            mummy();
        }


    }

    public void treehouse () {

        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You walk over to the treehouse and hear kids whisper about. As you get closer their whispers turn into shouts");
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("They are talking about monsters and what they fear the most. When they find" + playerName + "That Monster is gonna be Toast");
        System.out.println("You get scared and do not know what to do... you..");
        System.out.println();
        System.out.println("1: Run Far Away down the street");
        System.out.println();
        System.out.println("2: Attack");
        System.out.println("\n------------------------------------------------------------------\n");

    }


}
