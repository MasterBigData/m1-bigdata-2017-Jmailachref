//package tn.dauphine.AshrefJemail.shapes;
package Model;
public class Ring   {
	private float petitR;
	private float r;
	private Point centre;
	
	public Ring(Point C,float petRayon,float R) {
	this.centre=C;
	this.r=R;
	if (petRayon<R) {
	petitR=petRayon;
	}}
	public float getPetitR() {
		return petitR;
	}
	public float getR() {
		return r;
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
	public boolean contains(Point p) {
		Cercle c1= new Cercle(this.getCentre(),this.getPetitR());
		Cercle c2=new Cercle(this.getCentre(),this.getR());
		if ((c1.contains(p)==false) & (c2.contains(p)==true)) {
			return true;
			
		}
		return false;
	}
	public boolean contains(Point p, Ring ...rings ) {
		for (Ring r: rings) {
			if  (r.contains(p)) return true;
			
		}
	return false ;}
	
	}
	


