package project;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Tim");
        System.out.println("Hello World");

        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("it is not an Alien");
            System.out.println("and i am scared of Alien");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got a high score");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either of both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }
    }
}
