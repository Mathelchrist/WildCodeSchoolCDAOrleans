package wcscda.small_game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

public class MouseController extends MouseAdapter {
    private final Board board;
    private static boolean clik = false;
    private static ArrayList<Integer> savePosXY = new ArrayList<Integer>();

    public MouseController(Board board) {
        this.board = board;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        board.redraw(new Drawable() {
            @Override
            public void draw(Graphics2D g, ImageObserver io) {
                int x = mouseEvent.getX();
                int y = mouseEvent.getY();
                g.setColor(Color.WHITE);
                clickForm(g, x, y);
                System.out.println(savePosXY.toString());
            }
        });
    }

    public static ArrayList<Integer> getSavePosXY() {
        return savePosXY;
    }

    public static void setSavePosXY(ArrayList<Integer> savePosXY) {
        MouseController.savePosXY = savePosXY;
    }

    public static void clickForm(Graphics2D g, int x, int y) {
        if (clik == false) {
            g.drawLine(x - 30, y - 30, x + 30, y + 30);
            g.drawLine(x + 30, y - 30, x - 30, y + 30);
            clik = true;
            savePosXY.add(x);
            savePosXY.add(y);
        } else {
            g.drawOval(x - 50, y - 50, 100, 100);
            clik = false;
            savePosXY.add(x);
            savePosXY.add(y);
        }
    }



    public void mousePressed(MouseEvent mouseEvent) {

    }
}
