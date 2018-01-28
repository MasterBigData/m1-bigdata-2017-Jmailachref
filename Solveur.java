package loop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Solveur {

//Vérificateur de non solution
public static boolean notSolution(File f) throws IOException {
Generateur g=Verificateur.readFile2(f);
if (g.getGrille()[0][0].nbreConex()>2 || g.getGrille()[0][g.getH()-1].nbreConex()>2
		|| g.getGrille()[g.getW()-1][0].nbreConex()>2 || g.getGrille()[g.getW()-1][g.getH()-1].nbreConex()>2) {
	    System.out.println("pas de solution existante");
	    return false;
}
	
	return true ;
}


//Solveur en profondeur d'abord
public static boolean solve(File f) throws IOException {
	if (!notSolution(f)) {
		return notSolution(f);
	}
	Generateur g= Verificateur.readFile2(f);
	if (Verificateur.verificateur(f)) {
	    g.fileCreation();
	    return true;
	}
	else{
		int w=g.getW();
	    int h=g.getH();
	    pieces[][] grille = g.getGrille();
	    State initial = new State(grille,0,0);
	    ArrayList<State> ouvert=new ArrayList<State>();
	    ArrayList<State> fermer=new ArrayList<State>();
	    ouvert.add(initial);
	    fermer.add(initial);
	    while(ouvert.size()>0) {
	    	State current=ouvert.get(ouvert.size()-1);
	    	int i=current.getI();
	    	int j=current.getJ();
	    	ouvert.remove(current);
	    	fermer.add(current);
	    	ArrayList<pieces> famille=current.getFamille(j, i);
	    	for (pieces p:famille) {
	    		State s=current;
	    		s.setGrille(p, i, j);
	    		if (j<w-1) {
	    			s.setJ(j+1);
	    			if (!fermer.contains(s)) {
	    				ouvert.add(s);	
	    			}
	    		}
	    		else if(i<h-1) {
	    			s.setI(i+1);
	    			s.setJ(0);
	    			if(!fermer.contains(s)) {
	    				ouvert.add(s);
	    			}
	    		}
	    		if((Verificateur.verificateurDirect(new Generateur(w,h,s.getGrille())))) {
					   new Generateur(w,h,s.getGrille()).fileCreation();
					   return true;
				   }
	    		
	    			
	    		}
	    
	    		
	    		
	    		
	    	}
	    System.out.println("pas de solution pour ce fichier");
	    return false;	
	    	
	    }
	    
   
	
	
	}


}











	



