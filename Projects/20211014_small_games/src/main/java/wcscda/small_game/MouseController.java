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
					System.out.println("case : 1");
					if (MouseController.isSwipe()) {
						System.out.println(MouseController.isSwipe());
						tictactoe[0] = "X";
						MouseController.setSwipe(false);
					} else {
						System.out.println(MouseController.isSwipe());
						tictactoe[0] = "O";
						MouseController.setSwipe(true);
					}
				} else if (mouseEvent.getX() > 400 && mouseEvent.getX() < 800 && mouseEvent.getY() < 266) {
					System.out.println("case : 2");
					if (MouseController.isSwipe()) {
						System.out.println(MouseController.isSwipe());
						tictactoe[1] = "X";
						MouseController.setSwipe(false);
					} else {
						System.out.println(MouseController.isSwipe());
						tictactoe[1] = "O";
						MouseController.setSwipe(true);
					}
				} else if (mouseEvent.getX() > 800 && mouseEvent.getY() < 266) {
					System.out.println("case : 3");
					if (MouseController.isSwipe()) {
						System.out.println(MouseController.isSwipe());
						tictactoe[2] = "X";
						MouseController.setSwipe(false);
					} else {
						System.out.println(MouseController.isSwipe());
						tictactoe[2] = "O";
						MouseController.setSwipe(true);
					}
				} else if (mouseEvent.getX() < 400 && mouseEvent.getY() > 266 && mouseEvent.getY() < 532) {
					System.out.println("case : 4");
					if (MouseController.isSwipe()) {
						System.out.println(MouseController.isSwipe());
						tictactoe[3] = "X";
						MouseController.setSwipe(false);
					} else {
						System.out.println(MouseController.isSwipe());
						tictactoe[3] = "O";
						MouseController.setSwipe(true);
					}
				} else if (mouseEvent.getX() > 400 && mouseEvent.getX() < 800 && mouseEvent.getY() > 266 && mouseEvent.getY() < 532) {
					System.out.println("case : 5");
					if (MouseController.isSwipe()) {
						System.out.println(MouseController.isSwipe());
						tictactoe[4] = "X";
						MouseController.setSwipe(false);
					} else {
						System.out.println(MouseController.isSwipe());
						tictactoe[4] = "O";
						MouseController.setSwipe(true);
					}
				} else if (mouseEvent.getX() > 800 && mouseEvent.getY() > 266 && mouseEvent.getY() < 532) {
					System.out.println("case : 6");
					if (MouseController.isSwipe()) {
						System.out.println(MouseController.isSwipe());
						tictactoe[5] = "X";
						MouseController.setSwipe(false);
					} else {
						System.out.println(MouseController.isSwipe());
						tictactoe[5] = "O";
						MouseController.setSwipe(true);
					}
				} else if (mouseEvent.getX() < 400 && mouseEvent.getY() > 532) {
					System.out.println("case : 7");
					if (MouseController.isSwipe()) {
						System.out.println(MouseController.isSwipe());
						tictactoe[6] = "X";
						MouseController.setSwipe(false);
					} else {
						System.out.println(MouseController.isSwipe());
						tictactoe[6] = "O";
						MouseController.setSwipe(true);
					}
				} else if (mouseEvent.getX() > 400 && mouseEvent.getX() < 800 && mouseEvent.getY() > 532) {
					System.out.println("case : 8");
					if (MouseController.isSwipe()) {
						System.out.println(MouseController.isSwipe());
						tictactoe[7] = "X";
						MouseController.setSwipe(false);
					} else {
						System.out.println(MouseController.isSwipe());
						tictactoe[7] = "O";
						MouseController.setSwipe(true);
					}
				} else if (mouseEvent.getX() > 800 && mouseEvent.getY() > 532) {
					System.out.println("case : 9");
					if (MouseController.isSwipe()) {
						System.out.println(MouseController.isSwipe());
						tictactoe[8] = "X";
						MouseController.setSwipe(false);
					} else {
						System.out.println(MouseController.isSwipe());
						tictactoe[8] = "O";
						MouseController.setSwipe(true);
					}
				}
				for(String o : tictactoe) {
					System.out.print(o);
				}

			}
		});
	}

	public void mousePressed(MouseEvent mouseEvent) {

	}

}
