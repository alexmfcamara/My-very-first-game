package org.academiadecodigo.maindalorians;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class RectFact{

    private Picture rectangles[];

    public RectFact(){
        int randomNum = (int) (Math.random() * 4) + 3;
        rectangles = new Picture[randomNum];
    }

    public void translate(int x, int y){
        //rekt.translate(x, y);
    }

    public Picture[] getRekt() {
        return rectangles;
    }

    public void makeRect(int posX, int posY){
        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new Picture(posX,posY,"resources/car.png");
            switch (rectangles.length) {
                case 3 -> posX += 320;
                case 4 -> posX += 300;
                case 5 -> posX += 280;
                case 6 -> posX += 240;
                case 7 -> posX += 220;
            }
            rectangles[i].draw();
        }

    }

}
