
//package tn.dauphine.AshrefJemail.shapes;
package model;

public class Point {
private int x ;
private int y;
public static int MaxPoint=0;
public int getX() {
	return x;
}
public int getY() {
	return y	;
}
public void setX(int x) {
	this.x=x;
	}
public void setY(int y) {
	this.y=y;
}
public Point(int x,int y) {
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
public void translate(int dx, int dy) {
	
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