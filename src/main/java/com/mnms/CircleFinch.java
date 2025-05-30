package com.mnms;
import com.birdbrain.Finch;
public class CircleFinch {
    public static void main(String[] args){
        Finch bird = new Finch();


        bird.setBeak(170,51,106);
        bird.setMove("F", bird.getDistance() -4, 50);
        bird.setTurn("L", 90, 50);
        bird.stop();
        bird.disconnect();
    }
}