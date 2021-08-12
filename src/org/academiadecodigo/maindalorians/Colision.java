package org.academiadecodigo.maindalorians;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Colision {
    public static int vel = 200;

    public static void colision(Picture rectangle, Player player){
        /*
        if(){
            player.explode();
            return;
        }
         */
    }
    public static void winVerification(Player player) {
        if(player.getY() < 60){
            vel -= 20;
            player.setLevel(player.getLevel() + 1);
            Sandbox.level.setText("Level: " + player.getLevel());
            player.traslate(0,730);
        }
    }
    public static void hardMode(){
        vel = 0;
    }
}
