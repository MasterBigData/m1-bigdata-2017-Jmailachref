package tn.dauphine.AshrefJemail.shapes;

public class LigneBrisee  {
private int nbreMax;
Point[] tabDeLigneBrisee;
static int j=0;
LigneBrisee(int nbreMax,Point p[]){
	this.nbreMax=nbreMax;
	Point[] tabDeLigneBrisee = new Point[nbreMax];
	}
public int getNbreMax() {
	return nbreMax;
}
public void add(Point p,LigneBrisee l) {
	if (j<l.getNbreMax()) {l.tabDeLigneBrisee[j]=p;
}
	else System.out.println("Vous avez depassé le nbreMax");
	j++;
}
public int nbrePoint() {
	int x = 1;
	for (int i=0;i<getNbreMax();i++) {
		if (tabDeLigneBrisee[i]==null) {return i+1;
	}
		x=i+1;
}
 return x;

}
public int pointCapacity() {
	int s=getNbreMax()-this.nbrePoint();
	return s;
	
	
}
/*public boolean contains(Point p) {
	int i=0;
	for (this.tabDeLigneBrisee : p) {
		i++;
}
	if (i==0) return false;
	else return true;
}*/}