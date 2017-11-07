package View;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.*;
public class Mydisplay extends JPanel{
	
	protected void paintComponent(Graphics g) {
		g.drawLine(6, 60, 600, 6000);
	}
public static void main(String []args) {
	JFrame frame =new JFrame("Java Avancé - Graphic Display");
	//Construction d'un frame invisible avec un nom 
	frame.setSize(new Dimension(500,500));
	//Changer la dimension du frame
	frame.setVisible(true);
	// rendre le frame visible ( méthode hérité de l'interface accecible)
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//assurer la ferméture ma défaut quand l'utilisateur ferme le frame.
	Mydisplay d = new Mydisplay();
	//creation d'un nouveau objet Mydisplay
	frame.add(d);
	
}
}
