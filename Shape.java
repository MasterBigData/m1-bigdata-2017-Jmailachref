package model;
import view.DrawableShape;

public class Shape {
protected Point centre;
public DrawableShape ds;


public Shape() {
	centre = null;
	ds = null;
}
public Shape(Point p) {
	centre=p;
}
public Point getCentre() {
	return centre;
}
public void setCentre(Point p) {
	this.centre=p;
}

}
