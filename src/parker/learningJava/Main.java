package parker.learningJava;

public class Main {

    public static void main(String[] args) {
	    //expressions are building blocks of all programs.
        //a mile is equal to 1.609344 kilometers
        //expressions are variables, values and operators
        double kilometers = (100 * 1.609344);
        int highScore = 50;
        if (highScore > 50) {
            System.out.println("You got thee high ");
        }

        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("this is a test");
        System.out.println("This is " +
                " another " +
                " still more.");
        //************************
//        Game
//        boolean gameOver = true;
//        int score = 5000;
//        int levelCompleted = 5;
//        int bonus = 100;
//        //the code block isn't necessary, really.
//        if (score <5000){
//            System.out.println("Your score was less 5000");
//        } else {
//            System.out.println("At least you had fun.");
//        }
//            if (gameOver == true){
//                //if you create a variable in a codeblock you can't access that variable outside the codeblock. Scope
//                int finalScore = score + (levelCompleted * bonus);
//                System.out.println("Your final score was " + finalScore);
//            }
        boolean newGameOver = true;
        int score = 1000;
        int levelCompleted = 8;
        int bonus = 200;
            if (newGameOver){
                int finalScore = score + levelCompleted * bonus);
                System.out.println("Your final score was " + finalScore);
            }
    }
}
