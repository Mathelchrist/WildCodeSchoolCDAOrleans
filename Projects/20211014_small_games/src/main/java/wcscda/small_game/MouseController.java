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
    private static boolean click = true;
    private static String[] tictactoe = new String[9];

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
            }
        });
    }

    public static void clickForm(Graphics2D g, int x, int y) {
        if (click) {
            g.drawLine(x - 30, y - 30, x + 30, y + 30);
            g.drawLine(x + 30, y - 30, x - 30, y + 30);
            click = false;
            
        } else {
            g.drawOval(x - 50, y - 50, 100, 100);
            click = true;
        }
    }

    public void mousePressed(MouseEvent mouseEvent) {
        
    	if(mouseEvent.getX() < 400 && mouseEvent.getY() < 266) {
			System.out.println("case : 1");
			if(click) {
				System.out.println("case : 1 true");
				tictactoe[0] = "X";
			}else {
				System.out.println("case : 1 false");
				tictactoe[0] = "O";
			}
    	}else if(mouseEvent.getX() > 400 && mouseEvent.getX() < 800 && mouseEvent.getY() < 266) {
    		System.out.println("case : 2");
			if(click) {
				System.out.println("case : 1 true");
				tictactoe[1] = "X";
			}else {
				System.out.println("case : 1 false");
				tictactoe[1] = "O";
			}
    	}else if(mouseEvent.getX() > 800 && mouseEvent.getY() < 266) {
    		System.out.println("case : 3");
			if(click) {
				System.out.println("case : 1 true");
				tictactoe[2] = "X";
			}else {
				System.out.println("case : 1 false");
				tictactoe[2] = "O";
			}
    	}else if(mouseEvent.getX() < 400 && mouseEvent.getY() > 266 && mouseEvent.getY() < 532) {
    		System.out.println("case : 4");
			if(click) {
				System.out.println("case : 1 true");
				tictactoe[3] = "X";
			}else {
				System.out.println("case : 1 false");
				tictactoe[3] = "O";
			}
    	}else if(mouseEvent.getX() > 400 && mouseEvent.getX() < 800 && mouseEvent.getY() > 266 && mouseEvent.getY() < 532) {
    		System.out.println("case : 5");
			if(click) {
				System.out.println("case : 1 true");
				tictactoe[4] = "X";
			}else {
				System.out.println("case : 1 false");
				tictactoe[4] = "O";
			}
    	}else if(mouseEvent.getX() > 800 && mouseEvent.getY() > 266 && mouseEvent.getY() < 532) {
    		System.out.println("case : 6");
			if(click) {
				System.out.println("case : 1 true");
				tictactoe[5] = "X";
			}else {
				System.out.println("case : 1 false");
				tictactoe[5] = "O";
			}
    	}else if(mouseEvent.getX() < 400 && mouseEvent.getY() > 532) {
    		System.out.println("case : 7");
			if(click) {
				System.out.println("case : 1 true");
				tictactoe[6] = "X";
			}else {
				System.out.println("case : 1 false");
				tictactoe[6] = "O";
			}
    	}else if(mouseEvent.getX() > 400 && mouseEvent.getX() < 800 && mouseEvent.getY() > 532) {
    		System.out.println("case : 8");
			if(click) {
				System.out.println("case : 1 true");
				tictactoe[7] = "X";
			}else {
				System.out.println("case : 1 false");
				tictactoe[7] = "O";
			}
    	}else if(mouseEvent.getX() > 800 && mouseEvent.getY() > 532) {
    		System.out.println("case : 9");
			if(click) {
				System.out.println("case : 1 true");
				tictactoe[8] = "X";
			}else {
				System.out.println("case : 1 false");
				tictactoe[8] = "O";
			}
    	}
    }
}
