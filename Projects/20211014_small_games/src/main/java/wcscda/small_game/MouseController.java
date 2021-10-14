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
	private static String[] tictactoe = new String[9];
	private static ArrayList<Integer> posX = new ArrayList<>();
	private static ArrayList<Integer> posY = new ArrayList<>();
	private static boolean swipe = true;

	public static boolean isSwipe() {
		return swipe;
	}

	public static void setSwipe(boolean swipe) {
		MouseController.swipe = swipe;
	}

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
				posX.add(x);
				posY.add(y);
				g.setColor(Color.WHITE);
				boolean croix = true;
				for (int i = 0; i < posX.size(); i++) {
					x = posX.get(i);
					y = posY.get(i);
					if (croix) {
						g.drawLine(x - 30, y - 30, x + 30, y + 30);
						g.drawLine(x + 30, y - 30, x - 30, y + 30);
						croix = false;
					} else {
						g.drawOval(x - 50, y - 50, 100, 100);
						croix = true;
					}
				}
				if (mouseEvent.getX() < 400 && mouseEvent.getY() < 266) {
					if (MouseController.isSwipe()) {
						tictactoe[0] = "X";
						MouseController.setSwipe(false);
					} else {
						tictactoe[0] = "O";
						MouseController.setSwipe(true);
					}
				} else if (mouseEvent.getX() > 400 && mouseEvent.getX() < 800 && mouseEvent.getY() < 266) {
					if (MouseController.isSwipe()) {
						tictactoe[1] = "X";
						MouseController.setSwipe(false);
					} else {
						tictactoe[1] = "O";
						MouseController.setSwipe(true);
					}
				} else if (mouseEvent.getX() > 800 && mouseEvent.getY() < 266) {
					if (MouseController.isSwipe()) {
						tictactoe[2] = "X";
						MouseController.setSwipe(false);
					} else {
						tictactoe[2] = "O";
						MouseController.setSwipe(true);
					}
				} else if (mouseEvent.getX() < 400 && mouseEvent.getY() > 266 && mouseEvent.getY() < 532) {
					if (MouseController.isSwipe()) {
						tictactoe[3] = "X";
						MouseController.setSwipe(false);
					} else {
						tictactoe[3] = "O";
						MouseController.setSwipe(true);
					}
				} else if (mouseEvent.getX() > 400 && mouseEvent.getX() < 800 && mouseEvent.getY() > 266 && mouseEvent.getY() < 532) {
					if (MouseController.isSwipe()) {
						tictactoe[4] = "X";
						MouseController.setSwipe(false);
					} else {
						tictactoe[4] = "O";
						MouseController.setSwipe(true);
					}
				} else if (mouseEvent.getX() > 800 && mouseEvent.getY() > 266 && mouseEvent.getY() < 532) {
					if (MouseController.isSwipe()) {
						tictactoe[5] = "X";
						MouseController.setSwipe(false);
					} else {
						tictactoe[5] = "O";
						MouseController.setSwipe(true);
					}
				} else if (mouseEvent.getX() < 400 && mouseEvent.getY() > 532) {
					if (MouseController.isSwipe()) {
						tictactoe[6] = "X";
						MouseController.setSwipe(false);
					} else {
						tictactoe[6] = "O";
						MouseController.setSwipe(true);
					}
				} else if (mouseEvent.getX() > 400 && mouseEvent.getX() < 800 && mouseEvent.getY() > 532) {
					if (MouseController.isSwipe()) {
						tictactoe[7] = "X";
						MouseController.setSwipe(false);
					} else {
						tictactoe[7] = "O";
						MouseController.setSwipe(true);
					}
				} else if (mouseEvent.getX() > 800 && mouseEvent.getY() > 532) {
					if (MouseController.isSwipe()) {
						tictactoe[8] = "X";
						MouseController.setSwipe(false);
					} else {
						tictactoe[8] = "O";
						MouseController.setSwipe(true);
					}
				}
				for (String o : tictactoe) {
					System.out.print(o);
				}
				checkWinner(g);

			}
		});
	}

	static void checkWinner(Graphics2D g) {
		for (int a = 0; a < 8; a++) {
			String line = null;

			// spécial pour Nico
			switch (a) {
				case 0:
					line = tictactoe[0] + tictactoe[1] + tictactoe[2];
					break;
				case 1:
					line = tictactoe[3] + tictactoe[4] + tictactoe[5];
					break;
				case 2:
					line = tictactoe[6] + tictactoe[7] + tictactoe[8];
					break;
				case 3:
					line = tictactoe[0] + tictactoe[3] + tictactoe[6];
					break;
				case 4:
					line = tictactoe[1] + tictactoe[4] + tictactoe[7];
					break;
				case 5:
					line = tictactoe[2] + tictactoe[5] + tictactoe[8];
					break;
				case 6:
					line = tictactoe[0] + tictactoe[4] + tictactoe[8];
					break;
				case 7:
					line = tictactoe[2] + tictactoe[4] + tictactoe[6];
					break;
			}
			if (line.equals("XXX")) {
				g.drawString("Le joueur 1 à gagné", 500, 400);
			} else if (line.equals("OOO")) {
				g.drawString("Le joueur 2 à gagné", 500, 400);
			}
		}

	}

	public void mousePressed(MouseEvent mouseEvent) {

	}

}
