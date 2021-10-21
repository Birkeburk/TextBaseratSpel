import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TextSpel {

   static boolean gameRunning = true;

    public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {

        Scanner myScanner = new Scanner(System.in);

       /* File file = new File("Diablo2Theme.wav");

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);


        clip.start();


        */
        printMenu();

    }
    public static int getUserInt(){
        Scanner myScanner = new Scanner(System.in);

        int myInt;

        while(true){
            try{

                myInt = Integer.parseInt(myScanner.nextLine());
                break;

            }catch(Exception e){

                System.out.println("Felaktigt val");
            }
        }
        return myInt;
    }
    public static String getUserString(){
        Scanner myScanner = new Scanner(System.in);

        return myScanner.nextLine();
    }

    public static void printMenu() {

        System.out.println("D2");
        System.out.println("[1] Choose character");
        System.out.println("[2] Exit game");
        System.out.print("> ");
        int userChoice = getUserInt();

        switch (userChoice){
            case 1: characterOptions();
            break;
            case 2: gameRunning = false;
            break;
        }
    }
    public static void characterOptions() {

        System.out.println("[1] Barbarian");
        System.out.println("[2] Paladin");
        System.out.println("[3] Sorceress");
        System.out.print("> ");
        int characterChoice = getUserInt();
        if(characterChoice == 1){
            Barbarian barb1 = new Barbarian(100,100,100, 2,1);
            System.out.println("You chose the Barbarian class!");
            System.out.println("Loading game...");
        }
        if(characterChoice == 2){
            Paladin pala1 = new Paladin(100,100,100, 2,1);
            System.out.println("You chose the Paladin class!");
            System.out.println("Loading game...");
        }
        if(characterChoice == 3){
            Sorceress sorc1 = new Sorceress(50,70,150,5, 1);
            System.out.println("You chose the Sorceress class!");
            System.out.println("Loading game...");
        }
    }
}
