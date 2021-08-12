package org.academiadecodigo.maindalorians;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Sandbox {
        static Text level;
    public static void main(String[] args) {
        Picture mainRect = new Picture(10, 10, "resources/road.png");
        mainRect.draw();
        //Handler handler = new Handler();
        RectFact rectLine1 = new RectFact();
        rectLine1.makeRect(80,720);
        RectFact rectLine2 = new RectFact();
        rectLine2.makeRect(80,620);
        RectFact rectLine3 = new RectFact();
        rectLine3.makeRect(80,520);
        RectFact rectLine4 = new RectFact();
        rectLine4.makeRect(80,420);
        Picture train = new Picture(80,180,"resources/train.png");
        train.draw();
        RectFact rectLine6 = new RectFact();
        rectLine6.makeRect(80,100);
        Player pl1 = new Player();
        Keyboard keyboard = new Keyboard(pl1);
        level = new Text(1300,20,"Level: " + pl1.getLevel());
        level.setColor(Color.WHITE);
        level.draw();
        KeyboardEvent spaceDepressed = new KeyboardEvent();


/*
        spaceDepressed.setKey(KeyboardEvent.KEY_SPACE);
        spaceDepressed.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        keyboard.addEventListener(spacePressed);
        keyboard.addEventListener(spaceDepressed);
*/

        KeyboardEvent arrowUpPressed = new KeyboardEvent();
        arrowUpPressed.setKey(KeyboardEvent.KEY_UP);
        arrowUpPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(arrowUpPressed);

        KeyboardEvent arrowDownPressed = new KeyboardEvent();
        arrowDownPressed.setKey(KeyboardEvent.KEY_DOWN);
        arrowDownPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(arrowDownPressed);

        KeyboardEvent arrowLeftPressed = new KeyboardEvent();
        arrowLeftPressed.setKey(KeyboardEvent.KEY_LEFT);
        arrowLeftPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(arrowLeftPressed);

        KeyboardEvent arrowRightPressed = new KeyboardEvent();
        arrowRightPressed.setKey(KeyboardEvent.KEY_RIGHT);
        arrowRightPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(arrowRightPressed);

        KeyboardEvent dPressed = new KeyboardEvent();
        dPressed.setKey(KeyboardEvent.KEY_D);
        dPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(dPressed);

        KeyboardEvent cPressed = new KeyboardEvent();
        cPressed.setKey(KeyboardEvent.KEY_C);
        cPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(cPressed);

        KeyboardEvent wPressed = new KeyboardEvent();
        wPressed.setKey(KeyboardEvent.KEY_W);
        wPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(wPressed);

        KeyboardEvent spacePressed = new KeyboardEvent();
        spacePressed.setKey(KeyboardEvent.KEY_SPACE);
        spacePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(spacePressed);


        int pos1 = 20;

        while (!pl1.isCrash()) {
            int difficulty = Colision.vel;
            Colision.winVerification(pl1);
            for (Picture rectangle : rectLine1.getRekt()) {
                Motion.moveRight(rectangle);
            }
            for (Picture rectangle : rectLine2.getRekt()) {
                Motion.moveLeft(rectangle);
            }
            for (Picture rectangle : rectLine3.getRekt()) {
                Motion.moveRight(rectangle);
            }
            for (Picture rectangle : rectLine4.getRekt()) {
                Motion.moveLeft(rectangle);
            }
            Motion.moveTrainRight(train);
            for (Picture rectangle : rectLine6.getRekt()) {
                Motion.moveLeft(rectangle);
            }

            try {
                Thread.sleep(difficulty);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (Picture rectangle : rectLine1.getRekt()) {
                Colision.colision(rectangle, pl1);
            }
            for (Picture rectangle : rectLine2.getRekt()) {
                Colision.colision(rectangle, pl1);
            }
            for (Picture rectangle : rectLine3.getRekt()) {
                Colision.colision(rectangle, pl1);
            }
            for (Picture rectangle : rectLine4.getRekt()) {
                Colision.colision(rectangle, pl1);
            }
            Colision.colision(train,pl1);
            for (Picture rectangle : rectLine6.getRekt()) {
                Colision.colision(rectangle, pl1);
            }
        }
        // DO OTHER STUFF
    }
}
