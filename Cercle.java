//package tn.dauphine.AshrefJemail.shapes;
package Model;
public class Cercle extends Point{
private Point centre;
private float R;

public Cercle (Point p,float R) {
	p.equals(centre);
	this.R=R;
}
public Cercle() {
	this(null,0);
}
public Point getCentre() {
	return centre;
}
public float getRayon() {
	return R;
}
public void setCentre(Point p) {
	this.centre= p;
	
}


public String ToString (){
	
	return (this.getCentre().ToString()+","+this.getRayon()+","+this.surface());
}
@Override
public void translate(float dx,float dy) {
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


