package view;

import java.awt.Graphics;

import model.Cercle;
import model.Ring;
import model.Shape;

public class DrawableRing extends DrawableCercle{
public DrawableRing() {
	this.s=null;
}
public DrawableRing(Shape s) {
	super(s);
}
public void draw(Graphics g) {
    super.draw(g);
	g.drawOval(((Ring) s).getCentre().getX()-(((Ring) s).getPetitR()), ((Ring) s).getCentre().getY()-(((Ring) s).getPetitR()), ((Ring) s).getPetitR()*2,((Ring) s).getPetitR()*2);
	//g.drawOval(((Ring) s).getCentre().getX(), ((Ring) s).getCentre().getY(), ((Ring) s).getRayon(),((Ring) s).getRayon());

	}

}
