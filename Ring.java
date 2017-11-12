
package model;

import view.DrawableRing;


public class Ring extends Cercle   {
	private int petitR;
	
	
	
	public Ring(Point C,int petRayon,int R) {
	this.centre=C;
	this.R=R;
	ds = new DrawableRing(this);
	if (petRayon<R) {
	petitR=petRayon;
	}}
	public int getPetitR() {
		return petitR;
	}
	public int getR() {
		return R;
	}
	public Point getCentre() {
		return centre;
		
	}
	public boolean equals(Ring C) {
		if (C instanceof Ring) {
			Ring o =(Ring) C;
			return (this.getCentre()==o.getCentre())&(this.getPetitR()==o.getPetitR())&(this.getR()==o.getR());
		}
		return false;
	}
	/*public boolean contains(Point p) {
		Cercle c1= new Cercle(this.getCentre(),this.getPetitR());
		Cercle c2=new Cercle(this.getCentre(),this.getR());
		if ((c1.contains(p)==false) & (c2.contains(p)==true)) {
			return true;
			
		}
		return false;
	}*/
	public boolean contains(Point p, Ring ...rings ) {
		for (Ring r: rings) {
			if  (r.contains(p)) return true;
			
		}
	return false ;}
	
	}