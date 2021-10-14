package wcscda.small_game;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

public class Morpion extends Drawable implements SmallGameInterface {
    @Override
    public void draw(Graphics2D g, ImageObserver io) {

        drawGrid(g, io);

        g.setFont(new Font("Roboto", Font.BOLD, 50));

        drawClick(g, io);



    }
    public static void drawClick(Graphics2D g, ImageObserver io ){

        ArrayList position = MouseController.getSavePosXY();
        for(int i = 0 ;  i < position.size() ; i++){
            int x = position.indexOf(i);
            int y = position.indexOf(i+1);
            MouseController.clickForm( g,  x, y);


            i++;
        }
    }

    private void drawGrid(Graphics2D g, ImageObserver io) {
        int verticalLoops = 2;
        int horizontaleLoops = 2;
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        // utilisation de la methode g.drawLine pour faire les différentes lignes du jeux du morpions
        // celle-ci comporte 2 boucles une boucle verticale et une autre horizontale et j'incremente les différentes valeurs
        // a chaque tour de boucle

        for (int i = 0; i < verticalLoops; i++) {
            g.drawLine(x1 += 400, y1 = y1, x2 += 400, y2 += 800);
        }
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;

        for (int j = 0; j < horizontaleLoops; j++) {
            g.drawLine(x1, y1 += 266, x2 = 1200, y2 += 266);

        }
    }
}
