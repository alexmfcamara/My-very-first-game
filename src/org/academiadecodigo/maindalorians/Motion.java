package org.academiadecodigo.maindalorians;


import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Motion {
    public static final int LIMITRIGHT = 1380;
    public static final int LIMITLEFT = 10;
    public Motion(){

    }
/*
    public int getY(){
        return rekt.getY();
    }

    public int getX(){
        return rekt.getX();
    }

*/
    public static void moveRight(Picture rekt){
        if(rekt.getX() <= LIMITRIGHT) {
            rekt.translate(10, 0);
        }
        /*
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */
        if(rekt.getX() > LIMITRIGHT) {
            rekt.translate(-LIMITRIGHT, 0);
        }
    }
    public static void moveLeft(Picture rekt){
        if(rekt.getX() >= LIMITLEFT) {
            rekt.translate(-10, 0);
        }
        /*
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */
        if(rekt.getX() < LIMITLEFT) {
            rekt.translate(LIMITRIGHT, 0);
        }
    }

    public static void moveTrainRight(Picture rekt){
        if(rekt.getMaxX() <= LIMITRIGHT) {
                rekt.translate(10, 0);
        }
        /*
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */
        if(rekt.getMaxX() > LIMITRIGHT) {
            rekt.translate(-900, 0);
        }
    }

}
