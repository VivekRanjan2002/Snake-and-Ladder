public class simulator {

    // rolling of dice in particular turn
    public static int DiceRoller() {
        return (int) Math.ceil(Math.random() * 6);
    }


    // no of moves to be made by player either 0 or move forward or move backward in a particular turn 
    public static int MovesCalculator() {
        
        int option = (int) (Math.random() * 10) % 3;
        System.out.println("option "+option);
        int move = DiceRoller();
        System.out.println("move "+move);
        switch (option) {
            case 0: // NO PLAY
                move = 0;
                break;

            case 2:  // SNAKE
                move *= -1;
                break;
            default: // LADDER
                break;
        }
        return move;
    }

    public static void main(String[] args) {
         final int START_POS = 0;
         final int FINAL_POS = 100;
        

    }
}