package model;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;

import view.Mydisplay;

public class TestPoint 
{ 
	
    public static void main( String[] args )
    {
Point p1= new Point(1000,50);
Point p2=new Point(300,300);
/*Point p3=new Point(1,2);
System.out.println(p1==p2);
System.out.println(p1==p3);


ArrayList<Point> List = new ArrayList<Point>();
List.add(p1);
System.out.println(List.indexOf(p3));
System.out.println(List.indexOf(p1));

LigneBrisee li1 = new LigneBrisee(3);


li1.contains(p1);
*/

Cercle c1 =new Cercle(p1,200);
Cercle c2 =new Cercle(p2,150);
//c2.translate(1,1);
//System.out.println(c1+" "+c2);
Ring r1 = new Ring(p1,300,100);
Ring r2 = new Ring(p2,300,200);
//System.out.println(r1);
JFrame frame =new JFrame("Java Avancé - Graphic Display");
World w = new World();
w.add(c1);
w.add(c2);
w.add(r1);
w.add(r2);
Mydisplay d=new Mydisplay(w);

w.addObserver(d);
frame.add(d);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(new Dimension(50000,50000));}
    
}

