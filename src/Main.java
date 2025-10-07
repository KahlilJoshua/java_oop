import Characters.Hero;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        gameLoop();
        System.out.println("Byebye");
    }
    //Spel menyerna
    public static boolean mainMenu(int highscore){
        System.out.println("Välkommen till äventyr spelet");
        System.out.println("- För att starta tryck: s + enter");
        System.out.println("- För att avsluta tryck: a + enter");
        System.out.println("Nu variga highscore " + highscore);

        //input från spelaren
        Scanner scanner = new Scanner(System.in);
        String mainMenuChoice = scanner.nextLine();

        //kosekveser av alternativet spelaren har vallt
        switch (mainMenuChoice){
            case "s":

                //Tar input (namn) av spelaren och skapar en ny hero
                System.out.println("Ditt äventyr börjar");
                System.out.println("Vad heter du?");
                String playerName = scanner.nextLine();
                Hero player = new Hero(playerName, 100, 10, 0, 0);
                gamePlay(player, scanner);
                return true;
            case "a":
                return false;
        }
        return false;
    }
    //splet
    public static void gamePlay(Hero player,Scanner scanner){
        System.out.println("Vad ska du göra nu");
        System.out.println("- gå i skogen: 1 + enter");
        System.out.println("- dansa: 2 + enter");
        System.out.println("- Kolla stats: 3 + enter");
        String playerAction = scanner.nextLine();
        switch (playerAction) {
            case "1":
                skogen();
                break;
            case "2":
                break;
            case "3":
                break;
        }
    }

    //Spel looparna
    public static void gameLoop(){
        boolean wantsToPlay = true;
        int highScore = 0;
        while(wantsToPlay == true){
            wantsToPlay = mainMenu(highScore);
        };
    }
    public static void combat(){

    };

    public int encounters(){
        return 0;
    }
    public static void skogen(){

    }


}