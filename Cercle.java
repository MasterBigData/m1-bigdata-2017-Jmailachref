
package model;

import view.DrawableCercle;
import view.DrawableShape;
public class Cercle extends Shape{

protected int R;


public Cercle() {
	this(null,0);
	ds = new DrawableCercle();
}
public Cercle (Point p,int R) {
	super(p);
	this.R=R;
	
	ds = new DrawableCercle( this);
}
public Point getCentre() {
	return centre;
}
public int getRayon() {
	return R;
}
public void setCentre(Point p) {
	this.centre= p;
	
}


public String ToString (){
	
	return (this.getCentre().ToString()+","+this.getRayon()+","+this.surface());
}

public void translate(int dx,int dy) {
   Point p = this.getCentre();
	p.translate(dx,dy);
  	this.setCentre(p);
}
public double surface() {
	double s=getRayon()*getRayon()*3.14;
	return s;
    
}
public boolean contains(Point p) {
	if (Math.sqrt(Math.pow(p.getX()-this.centre.getX(),2)+Math.pow(p.getY()-this.centre.getY(), 2))==this.R) {
		return true;
	}
	return false;
}
public boolean contains(Point p,Cercle... Cercles) {
	for ( Cercle C : Cercles) {
		if (C.contains(p)) {return true;}
	}
	return false;
	}
	
	
}