package loop;
import java.io.BufferedWriter; 
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;



public class Generateur {
	private int w; //largeur
	private int h;//hauteur
	public static int nbre=1; // pour nom d'un nouveau fichier
	
	private pieces[][] grille;//la grille de stockage 
	
    /*creation du fild pour un nouveau niveau
      en donnant l'hauteur et la largeur*/
	public Generateur(int w, int h) {
    this.w=w;
    this.h=h;
   
      grille= new pieces[w][h];
      
	}
	public pieces[][] getGrille() {
		return this.grille;
	}
	//constructeur pour un niveau à partir d'un fichier donnée 
public Generateur (int w, int h, pieces[][] b) {
		this.w=w;
		this.h=h;
		 if ((b.length==w)&&(b[0].length==h))
		grille=b;
		 else 
			 throw new ArrayIndexOutOfBoundsException("dimention non compatible");
	}
	//tableau de tt les piéces:
public static pieces[] tabDeTout(){
		 pieces[]	tabDePieces = new pieces[16];
			tabDePieces[0]=pieces.VIDE;
			tabDePieces[1]=pieces.ONE_CON_N;
					tabDePieces[2]=pieces.ONE_CON_E;
					tabDePieces[3]=pieces.ONE_CON_S;
					tabDePieces[4]=pieces.ONE_CON_O;
					tabDePieces[5]=pieces.TWO_CON_NS;
					tabDePieces[6]=pieces.TWO_CON_EO;
					tabDePieces[7]=pieces.THREE_CON_NEO;
					tabDePieces[8]=pieces.THREE_CON_NSE;
					tabDePieces[9]=pieces.THREE_CON_ESO;
					tabDePieces[10]=pieces.THREE_CON_OSN;
					tabDePieces[11]=pieces.FOUR_CON;
					tabDePieces[12]=pieces.L_NE;
					tabDePieces[13]=pieces.L_ES;
					tabDePieces[14]=pieces.L_SO;
					tabDePieces[15]=pieces.L_ON;

		return tabDePieces;
	}
	// pour donner les pieces qui ont le méme numéro
public ArrayList<pieces> getFamille(int i, int j) {
	ArrayList<pieces> s = new ArrayList<pieces>();
	pieces[] b=tabDeTout();
	for (pieces p:b) {
		if (p.getNum()==this.getGrille()[i][j].getNum())
			s.add(p);
	}
	return s;
}	
//Getteur de largeur
public int getW() {
	return w;
}
//Getteur de l'hauteur
public int getH() {
	return h;
}	
	// création d'un niveau
public void remplissage() {
	pieces[] tab= this.tabDeTout(); // tab des piéces
	for(int i=0;i<this.getH();i++) {
         for (int j=0;j<this.getW();j++) {
        	 
        	 
        	 ArrayList<pieces> b= new ArrayList<pieces>();
        	 if (i==0) {
        		if (j==0) {
        			for (pieces p: tab) {
        				if (p.getNord()==false && p.getOuest()==false)
        					b.add(p);
        			}
        			
        		}
        		else if(j==this.getW()-1) {
        			for (pieces p:tab) {
        				if (p.getNord()==false && p.getEst()==false &&
        						p.getOuest()==grille[j-1][i].getEst())
        					b.add(p);
        			}
        		}
        		else {
        			for (pieces p:tab) {
        				if (p.getNord()==false && 
        						p.getOuest()==grille[j-1][i].getEst())
        					b.add(p);
        			}
        		}
        		
                grille[j][i]=b.get((new Random()).nextInt(b.size()));

        	 }
        	 
        	 
        	 else if (i==this.getH()-1) {
        		 if (j==0) {
         			for (pieces p: tab) {
         				if (p.getSud()==false && p.getOuest()==false &&
         						p.getNord()==grille[j][i-1].getSud())
         					b.add(p);
         			}
         			
         		}
         		else if(j==this.getW()-1) {
         			for (pieces p:tab) {
         				if (p.getSud()==false && p.getEst()==false &&
         						p.getNord()==grille[j][i-1].getSud() &&
         						p.getOuest()==grille[j-1][i].getEst())
         					b.add(p);
         			}
         		}
         		else {
         			for (pieces p:tab) {
         				if (   p.getSud()==false &&
         						p.getNord()==grille[j][i-1].getSud() && 
         						p.getOuest()==grille[j-1][i].getEst())
         					b.add(p);
         			}
         		}
        	 
                 grille[j][i]=b.get((new Random()).nextInt(b.size()));

        	 }
        	 else {
        		 if (j==0) {
        			 for (pieces p:tab) {
        				 if(p.getOuest()==false && 
        						 p.getNord()==grille[j][i-1].getSud())
        					 b.add(p);
        			 }
        		 }
        		 else if (j==this.getW()-1) {
        			 for (pieces p:tab) {
        				 if(p.getEst()==false && p.getNord()==grille[j][i-1].getSud()
        						 && p.getOuest()==grille[j-1][i].getEst())
        					 b.add(p);
        			 }
        		 }
        		 else {
        			 for (pieces p:tab) {
        				 if (p.getNord()==grille[j][i-1].getSud() && 
        						 p.getOuest()==grille[j-1][i].getEst())
        					 b.add(p);
        			 }
        		 }
        	 
        	 
                 grille[j][i]=b.get((new Random()).nextInt(b.size()));

        	 }
        	 
        	
        	 
         }
	
	
	
	
	}
}
	
	
	
	
			
//Creation d'un ficher à partir d'une grille 			
public void fileCreation() throws IOException  {  
	
	try {
		
	FileWriter file=new FileWriter("projet\\file"+String.valueOf(nbre)+".txt");
	BufferedWriter output=new BufferedWriter(file);
	output.write(String.valueOf(this.getW()));
	output.newLine();
	output.write(String.valueOf(this.getH()));
	output.newLine();
	for (int i=0;i<this.getH();i++) {
		for (int j=0;j<this.getW();j++) {
			output.write(String.valueOf(this.grille[j][i].getNum())+" ");
			output.write(String.valueOf(this.grille[j][i].getOrientation())+" ");
		   output.newLine();
		}
		
	}
	nbre++;	
	output.close();}
	catch(FileNotFoundException e1) {
		System.out.println(e1.toString());
	}
	catch(NumberFormatException e1) {
		System.out.println(e1.toString());
		}
	catch(Exception e1) {
		System.out.println(e1.toString());
		}
	
	
}
	//fin de la création du fichier 
	
//methode pour melonger les positions initiales
public void Shuffle () throws IOException {
	pieces[] tab= tabDeTout();
	pieces[][] shuffled = new pieces[this.getW()][this.getH()];
	
	for (int i=0;i<this.getH();i++) {
		for (int j=0;j<this.getW();j++) {
			ArrayList<pieces> b=getFamille(j,i);
			
				
	
            shuffled[j][i]=b.get((new Random()).nextInt(b.size()));
      
		}
		    } 
	new Generateur(w,h,shuffled).fileCreation();
	
	
}
//fin* de la méthode

	
		}
		
	
	
	
	
	

