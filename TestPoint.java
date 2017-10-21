package tn.dauphine.AshrefJemail.shapes;

import java.util.ArrayList;

public class TestPoint 
{ 
	
    public static void main( String[] args )
    {
Point p1= new Point(1,2);
Point p2=p1;
Point p3=new Point(1,2);
System.out.println(p1==p2);
System.out.println(p1==p3);


ArrayList<Point> List = new ArrayList<Point>();
List.add(p1);
System.out.println(List.indexOf(p3));
System.out.println(List.indexOf(p1));

LigneBrisee li1 = new LigneBrisee(3);


li1.contains(p1);


Cercle c1 =new Cercle(p1,2);
Cercle c2 =new Cercle(p1,1);
//c2.translate(1,1);
//System.out.println(c1+" "+c2);
Ring r1 = new Ring(p1,3,1);
System.out.println(r1);




 
}}