package com.mnms;
import com.birdbrain.Finch;
public class CircleFinch {
    public static void main(String[] args){
        Finch bird = new Finch();

        bird.setMove("F", 10, 50)
        bird.stop();
        bird.disconnect();
    }
}