//package tn.dauphine.AshrefJemail.shapes;
package Model;
import java.util.ArrayList;

public class LigneBrisee  {
private  int nbreMax;
ArrayList<Point> tabDeLigneBrisee=new ArrayList<Point>();

LigneBrisee(int nbreMax){
	this.nbreMax=nbreMax;
	
	}
public int getNbreMax() {
	return nbreMax;
}
public void add ( Point p) {
	
	if (this.tabDeLigneBrisee.size()<this.getNbreMax()) {
		this.add(p);
		
	}
}



	

public boolean contains(Point p ) {
	
	for (Point o : this.tabDeLigneBrisee) {
		if (o.equals(p)==true) {return true;}
		
}
	
	 return true;
}}