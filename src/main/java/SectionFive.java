public class SectionFive {

    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);   //this is an example of an expression

        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore;   //add bonus points
        }

        int health = 100; //starting from health is an expression

        if ((health < 25) && (highScore > 1000)) {  // in here there are 3 expressions; one is the health parenthesis, the other one is the &&, and finally the third one is the highScore parenthesis
            highScore = highScore - 1000;   //in here there are two, one is highScore =, the other one is highScore - 1000
        }
    }
}
