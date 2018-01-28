package loop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Verificateur {

//vérifie si c'est une solution a partir d'un fichier	
public static boolean verificateur(File file) throws IOException {
	boolean b = true ;
	Generateur g=readFile2(file);
	pieces[][] p= g.getGrille();
	for (int i=0;i<g.getH();i++) {
		for(int j=0;j<g.getW();j++) {
			
			if (i==0 && j==0) {
				
				if(p[j][i].getEst()!=p[j+1][i].getOuest()
				    || p[j][i].getSud()!=p[j][i+1].getNord() )
					return false;
			}
			else if(i==0 && j==g.getW()-1) {
				if(p[j][i].getOuest()!=p[j-1][i].getEst()
					|| p[j][i].getSud()!=p[j][i+1].getNord())
			   return false;
			}
			else if (i==0) {
				if (p[j][i].getEst()!=p[j+1][i].getOuest() || 
					p[j][i].getOuest()!=p[j-1][i].getEst() ||
					p[j][i].getSud()!=p[j][i+1].getNord())
					return false;
			}
			else if(i==g.getH()-1 && j==0) {
				if(p[j][i].getEst()!=p[j+1][i].getOuest()
					    || p[j][i].getNord()!=p[j][i-1].getSud() )
						return false;
				}
			else if(i==g.getH()-1 && j==g.getW()-1) {
				if(p[j][i].getOuest()!=p[j-1][i].getEst()
					    || p[j][i].getNord()!=p[j][i-1].getSud() )
						return false;
		
			}
			else if(i==g.getH()-1){
				if(p[j][i].getNord()!=p[j][i-1].getSud()|| 
						p[j][i].getOuest()!=p[j-1][i].getEst()||
						p[j][i].getEst()!=p[j+1][i].getOuest())
					return false;
			}
			else if(j==0) {
				if(p[j][i].getEst()!=p[j+1][i].getOuest() ||
						p[j][i].getNord()!= p[j][i-1].getSud()
						|| p[j][i].getSud()!= p[j][i+1].getNord())
			           return false;
			}
			else if(j==g.getW()-1) {
				if(p[j][i].getOuest()!=p[j-1][i].getEst() ||
						p[j][i].getNord()!= p[j][i-1].getSud()
						|| p[j][i].getSud()!= p[j][i+1].getNord())
			           return false;
			}
			else {
				if(p[j][i].getOuest()!=p[j-1][i].getEst() ||
						p[j][i].getEst()!=p[j+1][i].getOuest()||
						p[j][i].getNord()!= p[j][i-1].getSud()
						|| p[j][i].getSud()!= p[j][i+1].getNord())
			           return false;
			}
	       
		
		}
}
	


return b;
}
	
//lecture d'un fichier	
public static Generateur readFile2(File f) throws IOException {
	InputStream flux=new FileInputStream(f);
	InputStreamReader lecture=new InputStreamReader(flux);
	BufferedReader buff=new BufferedReader(lecture);
	String ligne;
	ligne=buff.readLine();
	int width=Integer.parseInt(ligne);
	ligne=buff.readLine();
	int height=Integer.parseInt(ligne);
	pieces[][] grille = new pieces[width][height];
	pieces[] tab= Generateur.tabDeTout();
	for(int i=0; i<height;i++)
		{
		for(int j=0; j<width;j++)
		{
		ligne=buff.readLine();
		String t[]=ligne.split(" ");
		int num =Integer.parseInt(t[0]);
		int orien= Integer.parseInt(t[1]);
		for (pieces p: tab) {
			if (p.getNum()==num && p.getOrientation()==orien)
				grille[j][i]=p;
		}
		}
		
}
	
	
	return new Generateur(width,height,grille);
}



// verificateur a partir d'une grille, sert dans le solveur pour verifier directement si c'est une solution
public static boolean verificateurDirect(Generateur g) {
	
	boolean b=true;
	pieces[][] p= g.getGrille();
	for (int i=0;i<g.getH();i++) {
		for(int j=0;j<g.getW();j++) {
			
			if (i==0 && j==0) {
				
				if(p[j][i].getEst()!=p[j+1][i].getOuest()
				    || p[j][i].getSud()!=p[j][i+1].getNord() )
					return false;
			}
			else if(i==0 && j==g.getW()-1) {
				if(p[j][i].getOuest()!=p[j-1][i].getEst()
					|| p[j][i].getSud()!=p[j][i+1].getNord())
			   return false;
			}
			else if (i==0) {
				if (p[j][i].getEst()!=p[j+1][i].getOuest() || 
					p[j][i].getOuest()!=p[j-1][i].getEst() ||
					p[j][i].getSud()!=p[j][i+1].getNord())
					return false;
			}
			else if(i==g.getH()-1 && j==0) {
				if(p[j][i].getEst()!=p[j+1][i].getOuest()
					    || p[j][i].getNord()!=p[j][i-1].getSud() )
						return false;
				}
			else if(i==g.getH()-1 && j==g.getW()-1) {
				if(p[j][i].getOuest()!=p[j-1][i].getEst()
					    || p[j][i].getNord()!=p[j][i-1].getSud() )
						return false;
		
			}
			else if(i==g.getH()-1){
				if(p[j][i].getNord()!=p[j][i-1].getSud()|| 
						p[j][i].getOuest()!=p[j-1][i].getEst()||
						p[j][i].getEst()!=p[j+1][i].getOuest())
					return false;
			}
			else if(j==0) {
				if(p[j][i].getEst()!=p[j+1][i].getOuest() ||
						p[j][i].getNord()!= p[j][i-1].getSud()
						|| p[j][i].getSud()!= p[j][i+1].getNord())
			           return false;
			}
			else if(j==g.getW()-1) {
				if(p[j][i].getOuest()!=p[j-1][i].getEst() ||
						p[j][i].getNord()!= p[j][i-1].getSud()
						|| p[j][i].getSud()!= p[j][i+1].getNord())
			           return false;
			}
			else {
				if(p[j][i].getOuest()!=p[j-1][i].getEst() ||
						p[j][i].getEst()!=p[j+1][i].getOuest()||
						p[j][i].getNord()!= p[j][i-1].getSud()
						|| p[j][i].getSud()!= p[j][i+1].getNord())
			           return false;
			}
	       
		
		}
}
	


return b;
}
	
	
}








