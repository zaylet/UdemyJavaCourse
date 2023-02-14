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

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;  //this example is to demonstrate the ternary operator, but is not proper code
        //boolean isDomestic = (makeOfCar != "Volkswagen"); simpler way to write the code
        if (isDomestic){
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "this car is domestic" : "This car is not domestic";
        System.out.println(s);

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("My values total = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("The remainder = " + theRemainder);
        boolean isNotRemainder = (theRemainder == 0) ? true : false;
        System.out.println("is not remainder = " + isNotRemainder);
        if (!isNotRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
