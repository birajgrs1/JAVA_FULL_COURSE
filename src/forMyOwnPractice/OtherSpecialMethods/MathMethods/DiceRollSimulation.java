package forMyOwnPractice.OtherSpecialMethods.MathMethods;

/*
Simulate a dice roll using Math.random() and display the outcome
(1 to 6).
 */

public class DiceRollSimulation {

    int diceRoll(){
        double randomRoll = Math.random()*6;
        int currentRoll= (int)Math.ceil(randomRoll);
        return currentRoll;
    }
    public static void main(String[] args) {
        DiceRollSimulation diceRollSimulation = new DiceRollSimulation();
        for(int i=1; i<=10; i++){
            System.out.println(diceRollSimulation.diceRoll());
        }
//        diceRollSimulation.diceRoll();

    }
}
