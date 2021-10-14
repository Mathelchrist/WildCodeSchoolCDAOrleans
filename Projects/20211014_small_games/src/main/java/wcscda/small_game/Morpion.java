package wcscda.small_game;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

public class Morpion extends Drawable implements SmallGameInterface {
	private static boolean clik = false;
	@Override
	public void draw(Graphics2D g, ImageObserver io) {

		drawGrid(g, io);
		drawClick(g, io);

	}
	public static void drawClick(Graphics2D g, ImageObserver io ){

//		ArrayList position = MouseController.getSavePosXY();
//		for(int i = 0 ;  i < position.size() ; i++){
//			int x = (int) position.get(i);
//			int y = (int) position.get(i+1);
//			//      MouseController.clickForm( g,  x, y);
//			g.setColor(Color.WHITE);
//			System.out.println(x+ " "+y);
//			if (position.size() == 2) {
//				g.drawLine(x - 30, y - 30, x + 30, y + 30);
//				g.drawLine(x + 30, y - 30, x - 30, y + 30);
//				clik = true;
//			} else {
//				g.drawOval(x - 50, y - 50, 100, 100);
//				clik = false;
//			}
//			i++;
//		}
	}

	private void drawGrid(Graphics2D g, ImageObserver io) {
		int x1 = 400;
		int y1 = 0;
		int x2 = 400;
		int y2 = 800;
		for(int i=0;i<4;i++) {
			g.drawLine(x1, y1, x2, y2);
			x2 += 400;
			x1 = x2;

			if (x2 >= 1200) {
				x1 = 0;
				y1+=266;
				y2 = y1;
			}
		}

		g.setFont(new Font("Roboto", Font.BOLD, 50));
		g.drawString("TicTacToe", 50, 50);
	}
}
