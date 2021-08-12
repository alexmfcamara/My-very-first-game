package org.academiadecodigo.maindalorians;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Player implements KeyboardHandler {
    private Rectangle car;
    private Boolean crash;
    public static final int CELLSIZE = 20;
    private int level;

    public Player(){
        car = new Rectangle(760, 780, CELLSIZE, CELLSIZE);
        car.fill();
        crash  = false;
        level = 1;
    }

    public void keyPressed(KeyboardEvent event){
        switch (event.getKey()){

            case KeyboardEvent.KEY_SPACE:
                Colision.hardMode();
                level = 9000;
                Sandbox.level.setText("Level: Over " + level);
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
                car.fill();
                break;

            case KeyboardEvent.KEY_R :
                resetGame();
                break;
            case KeyboardEvent.KEY_W :
                resetGame();
                break;

        }
    }
    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int lvl){
        level = lvl;
    }
    public Boolean isCrash() {
        return crash;
    }
    public void explode(){
        crash = true;
    }
    public void resetGame(){
        crash = false;
    }
    public int getX(){
        return car.getX();
    }
    public int getY(){
        return car.getY();
    }
    public int getMaxY(){
        return car.getY() + car.getHeight();
    }
    public int getMaxX(){
        return car.getX() + car.getWidth();
    }
    public void traslate(int x, int y){
        car.translate(x, y);
    }

}
