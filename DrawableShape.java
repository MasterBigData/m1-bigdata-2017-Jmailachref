package view;

import java.awt.Graphics; 
import model.Shape;

public class DrawableShape{
	protected Shape s;
	public DrawableShape() {
		s=null;
	}
	public DrawableShape(Shape s) {
		this.s=s;
	}
public void draw(Graphics g) {
	
}
}