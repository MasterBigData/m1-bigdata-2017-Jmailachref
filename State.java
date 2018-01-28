package loop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//Classe state qu'on va utiliser dans le solveur pour différencier les différents status de recherche
public class State {
private pieces[][] grille; // la grille dans la quelle on fait la recherche
// les indices qu'on va tester les pieces voisines
private int i;
private int j;
//Constructeur par défaut
public State() {
	grille=null;
	i=0;
	j=0;
}
//Constructeur d'un statut
public State(pieces[][] grille, int i,int j) {
	this.grille=grille;
	if (grille[0].length>=i && grille.length>=j) {
		this.i=i;
		this.j=j;
	}
	else throw new IndexOutOfBoundsException();
}
//Les getteur et Setteurs
public int getI() {
	return i;
}
public void setI(int i) {
	this.i=i;
}
public void setJ(int j) {
	this.j=j;
}


public int getJ() {
	return j;
}



public void setGrille(pieces p,int i,int j) {
	this.grille[j][i]=p;
}
public pieces[][] getGrille(){
	return grille;
}
//Pour chaque i,j d'un état , on cherche les piéces de méme numéro que celui de Grille[j][i]
public ArrayList<pieces> getFamille(int i, int j) {
	ArrayList<pieces> s = new ArrayList<pieces>();
	pieces[] b=Generateur.tabDeTout();
	for (pieces p:b) {
		if (p.getNum()==this.getGrille()[i][j].getNum())
			s.add(p);
	}
	Collections.sort(s, new Comparator<pieces>() { //Pour trier la liste on commence par celui qui a le moin de conx possible
		@Override
		public int compare(pieces tc1, pieces tc2) {
	    Integer i=(Integer)tc1.nbreConex();
	    Integer j=(Integer)tc2.nbreConex();
	    i.compareTo(j);
		return (i.compareTo(j));
		}
		});
	return s;
}	
//Redéfinition de equals pour utiliser contains
@Override
public boolean equals(Object o) {
	if (o instanceof State) {
		if (!(this.getI()==((State)o).getJ() && this.getJ()==((State)o).getJ())) {
			return false;
		}
		for (int i=0;i<this.getGrille()[0].length;i++) {
		for (int j=0;j<this.getGrille().length;j++) {
			if (this.getGrille()[j][i]!=(((State) o).getGrille()[j][i]))
				return false;
		}
	}
	}
	return true;
}	



}


