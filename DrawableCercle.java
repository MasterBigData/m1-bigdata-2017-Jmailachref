package view;

import java.awt.Graphics;
import java.awt.Shape;

import model.Cercle;

public class DrawableCercle extends DrawableShape {
	public DrawableCercle() {
		s=null;
	}
	public DrawableCercle(Shape s) {
	
		super(s);
	}
	
public void draw(Graphics g) {
	
	g.drawOval(((Cercle) s).getCentre().getX(), ((Cercle) s).getCentre().getY(), ((Cercle) s).getRayon(),((Cercle) s).getRayon());
	//g.drawOval( s.getCentre().getX(), ((Cercle) s).getCentre().getY(), 5,5);}
	
}
}
