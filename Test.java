package loop;
import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException{
		
		
Generateur achref= new Generateur (2,2);
achref.remplissage();
achref.fileCreation();

achref.Shuffle();
achref.fileCreation();

File f= new File("C:\\Users\\acher\\Desktop\\9raya\\Java Avancé\\projet\\file2.txt");
//System.out.println(Verificateur.verificateur(f));
System.out.print( Solveur.solve(f));



}}
