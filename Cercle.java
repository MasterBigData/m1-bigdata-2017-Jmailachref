package tn.dauphine.AshrefJemail.shapes;

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
public String ToString (Cercle C){
	return (C.ToString(getCentre())+","+C.getRayon()+","+C.surface());
}
public void translate (float dx,float dy) {
   this.centre.setX(dx);
   this.centre.setY(dy);
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

}