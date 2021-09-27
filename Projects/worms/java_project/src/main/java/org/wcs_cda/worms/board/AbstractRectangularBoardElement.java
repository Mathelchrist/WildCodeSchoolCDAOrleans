package org.wcs_cda.worms.board;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.ImageObserver;

public abstract class AbstractRectangularBoardElement extends AbstractMovable{
	private Rectangle2D innerRect;
	
	public AbstractRectangularBoardElement(
			double x, 
			double y, 
			double rectWidth, 
			double rectHeight) {
		innerRect = new Rectangle2D.Double(x, y, rectWidth, rectHeight);
	}

	public int getX() {
		return (int)getInnerRect().getX();
	}

	public int getY() {
		return (int)getInnerRect().getY();
	}
	
	public double getCenterX() {
		return getInnerRect().getCenterX();
	}
	
	public double getCenterY() {
		return getInnerRect().getCenterY();
	}
	
	public Rectangle2D getInnerRect() {
		return innerRect;
	}

	public Shape getShape() {
		return innerRect;
	}
	
	public boolean isColidingWith(Shape s) {
		return s.intersects(getInnerRect());
	}
	
	@Override
	public void rawMove(double x, double y) {
		GeomUtils.moveRect(innerRect, x, y);
	}
	
	@Override
	protected void drawDebug(Graphics2D g, ImageObserver io) {
		g.setColor(Color.red);
		g.draw(getInnerRect());
	}
}
