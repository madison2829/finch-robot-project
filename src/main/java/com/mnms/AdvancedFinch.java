package com.mnms;
import com.birdbrain.Finch;
public class AdvancedFinch extends Finch{
    public int moveDistance; //Variable used in the parmeter when intiating Advanced Finch to determine moveDistance

    //Advanced Finch sets a number for move distance as it's instiated
    //Using its sensor and subtracting it by the moveDistance parameter
    public AdvancedFinch(int moveDistance){
    this.moveDistance = this.getDistance() - moveDistance;
    }

    //Goes through first hall by moving forward
    //And turning left at the end
    public void firstMove(){
        setMove("F", moveDistance, 45);
        setTurn("L", 88, 3);
    }

    //Goes through the second path by moving forward
    //And turning left
    public void secondMove(){
        setMove("F", 42, 45);
        setTurn("L", 90, 7);
    }

    //Goes through third path by moving forward
    //And turning right
    public void thirdMove(){
        setMove("F", 30, 50);
        setTurn("R", 90, 7);
    }

    //Goes through the last move by moving forward, turning right
    //Moving forward, turning right, moving forward, turning left, moving forward, turning left, and moving forward to reach the end
    public void lastMove(){
            setMove("F", 47, 45);
            setTurn("R", 90, 7);
            setMove("F", 109, 45);
            setTurn("R", 90, 7);
            setMove("F",14, 10);
            setTurn("L", 90, 7);
            setMove("F", 22, 10);
            setTurn("L", 75, 7);
            setMove("F",10, 10);
    }
}