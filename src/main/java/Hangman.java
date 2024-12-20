import java.util.Scanner;

public class Hangman {

    public static void main (String[] args) {

        String secret;

        System.out.println("Write the word to guess ! :");

        Scanner scanner = new Scanner(System.in);
        secret = scanner.next();

        System.out.println(secret);

        int remainingTries = 8;
        String userInput = "";

        char[] secretLetters = new char[secret.length()];

        for(int i = 0; i < secret.length(); i++) {
            secretLetters[i] = '_';
        }

        while(!userInput.equals(secret)) {

            System.out.println("Remaining tries : " + remainingTries );
            System.out.println("Pick a letter : ");

            String input = scanner.next();

            char currentLetter = input.charAt(0);

            if(!Character.isLetter(currentLetter)) {
                System.out.println("The letter must be a valid char !!");
                continue;
            }

            if(secret.contains(String.valueOf(currentLetter))) {
                for(int i= 0; i < secret.length(); i++) {
                    if(secret.charAt(i) == currentLetter) {
                        secretLetters[i] = currentLetter;
                    }
                }

                userInput = String.valueOf(secretLetters);
            } else {
                displayHangman(remainingTries);
                remainingTries--;
            }


            System.out.println(userInput);

            if(remainingTries == -1) {
                System.out.println("Game over !");
                break;
            }


            if(userInput.equals(secret)) {
            System.out.println("Good Job you found it !");
            }



        }


    }


    static void displayHangman(int remainingTries) {
        // Simple hangman drawing based on attempts left
        switch (remainingTries) {
            case 8:
                System.out.println("--------");
                System.out.println("|      |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 7:
                System.out.println("--------");
                System.out.println("|      |");
                System.out.println("|      O");
                System.out.println("|");
                System.out.println("|");
                break;
            case 6:
                System.out.println("--------");
                System.out.println("|      |");
                System.out.println("|      O");
                System.out.println("|      |");
                System.out.println("|");
                break;
            case 5:
                System.out.println("--------");
                System.out.println("|      |");
                System.out.println("|      O");
                System.out.println("|     /|\\");
                System.out.println("|");
                break;
            case 4:
                System.out.println("--------");
                System.out.println("|      |");
                System.out.println("|      O");
                System.out.println("|     /|\\");
                System.out.println("|     /");
                break;
            case 3:
                System.out.println("--------");
                System.out.println("|      |");
                System.out.println("|      O");
                System.out.println("|     /|\\");
                System.out.println("|     / \\");
                break;
            case 2:
                System.out.println("--------");
                System.out.println("|      |");
                System.out.println("|      O");
                System.out.println("|     /|\\");
                System.out.println("|     / \\");
                System.out.println("|    /");
                break;
            case 1:
                System.out.println("--------");
                System.out.println("|      |");
                System.out.println("|      O");
                System.out.println("|     /|\\");
                System.out.println("|     / \\");
                System.out.println("|    /   \\");
                break;
            case 0:
                System.out.println("--------");
                System.out.println("|      |");
                System.out.println("|     \\O/");
                System.out.println("|      |");
                System.out.println("|     / \\");
                System.out.println("|    /   \\");
                break;
            default:
                break;
        }
    }


}
