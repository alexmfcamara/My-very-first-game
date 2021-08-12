package org.academiadecodigo.maindalorians;

import org.academiadecodigo.simplegraphics.graphics.Line;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Handler implements KeyboardHandler {

    private Picture picture;
    private Line leftLine;
    private Line rightLine;
    private Picture car;


    public Handler(){
        picture = new Picture(10, 10, "resources/iv-coffee-yzb-prints.jpeg");
        leftLine = new Line(10, 10, 10, 30);
        leftLine.draw();
        rightLine = new Line(410, 10, 410, 30);
        rightLine.draw();
        car = new Picture(10, 10, "resources/car.jpeg");
        car.draw();
    }

    @Override
    public void keyPressed(KeyboardEvent event){
        switch (event.getKey()){
            case KeyboardEvent.KEY_SPACE :
                picture.draw();
                break;

            case KeyboardEvent.KEY_UP :
                car.translate(0, -10);
                break;

            case KeyboardEvent.KEY_DOWN :
                car.translate(0, 10);
                break;

            case KeyboardEvent.KEY_LEFT :
                car.translate(-10, 0);
                break;

            case KeyboardEvent.KEY_RIGHT :
                car.translate(10, 0);
                break;

            case KeyboardEvent.KEY_D :
                car.delete();
                break;

            case KeyboardEvent.KEY_C :
                car.draw();
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent event) {
        if (event.getKey() == KeyboardEvent.KEY_SPACE) {
            picture.delete();
        }
    }
}
