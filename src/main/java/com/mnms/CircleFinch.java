package com.mnms;

public class CircleFinch {
    public static void main(String[] args){
        AdvancedFinch bird = new AdvancedFinch(6); //Instantiate Advanced Finch object with moveDistance parameter

        bird.firstMove(); //Finch object makes its first move by going through the first path of the maze
        bird.secondMove(); //Finch object turns and makes its second move by going through the second path of the maze
        bird.thirdMove(); //Finch object turns and makes its way through the open space which is the third path of the maze
        bird.lastMove(); //Finch object goes through multiple walls but same path of the maze making it's final moves and turns towards the end

        bird.stop();
        bird.disconnect();   
        //Finch object stops and disconnects after the code is runs
    }
}