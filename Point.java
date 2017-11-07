//package tn.dauphine.AshrefJemail.shapes;
package Model;

public class Point {
private float x ;
private float y;
public static int MaxPoint=0;
public float getX() {
	return x;
}
public float getY() {
	return y	;
}
public void setX(float x) {
	this.x=x;
	}
public void setY(float y) {
	this.y=y;
}
public Point(float x,float y) {
	this.x=x;
	this.y=y;
	MaxPoint++;
}
public Point() {
	this(0,0);
}
public static void main( String[] args )
{




}
public Point (Point p) {
	this(p.x,p.y);

}

public String ToString(){
	
	return (this.getX()+","+this.getY());
}
	
public boolean isSameAs(Point p) {
	if ((this.getX()==p.getX())&(this.getY()==p.getY())){
		return true;
	}
	else return false ;
}
public void translate(float dx, float dy) {
	
	setX(getX()+dx);
	setY(getY()+dy);
}
@Override 
public boolean equals(Object p) {
	if (p instanceof Point) {
		Point o = (Point)p;
		return (this.getX()==o.getX())&(this.getY()==(o.getY()));
	}
	return false;
}
}
