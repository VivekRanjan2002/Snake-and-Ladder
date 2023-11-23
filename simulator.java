public class simulator {

    // rolling of dice in particular turn
    public static int DiceRoller() {
        return (int) Math.ceil(Math.random() * 6);
    }


    // no of moves to be made by player either 0 or move forward or move backward in a particular turn 
    public static int MovesCalculator() {

        int option = (int) (Math.random() * 10) % 3;
       // System.out.println("option " + option);
        int move = DiceRoller();
        
        switch (option) {
            case 0: // NO PLAY
                move = 0;
                break;

            case 2: // SNAKE
                move *= -1;
                break;
            default: // LADDER
                break;
        }
        return move;
    }
    
    // single player game simulation method 
    public static void SinglePlayerGameSimulation() {
        int movescnt = 0;
        int currPos = 0;
        while (currPos != 100) {
            int move = MovesCalculator();
        
            int expectedMove = move + currPos; // position to be reached without any condition
            if (expectedMove < 0) {
                currPos=0; // handle if it goes backward and ensure doesn't go on negative side
            }
            else if(expectedMove<=100) currPos=expectedMove; // handle if it goes forward and ensure if 
                //position go above 100, the player stays in the same previous position
                movescnt++;
            
            System.out.println("Movescnt : "+movescnt + "  && CurrPos : "+currPos);
        }
    }

    public static void main(String[] args) {
         
         SinglePlayerGameSimulation();
         

    }
}