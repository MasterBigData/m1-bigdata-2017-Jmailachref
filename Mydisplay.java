package view;
import java.awt.Dimension; 
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

import controller.MouseController;
import model.World;
public class Mydisplay extends JPanel implements Observer{
	
    public MouseController mcv ;
	public World w;
	public Mydisplay() {
		this.w=null;
	}
	public Mydisplay(World w) {
		this.w=w;
	}
	public void draw(Graphics g) {}
	protected void paintComponent(Graphics g) {for (int i=0;i<w.shapes.size();i++) {
		w.shapes.get(i).ds.draw(g);
		
	}}
  

@Override
public void update(Observable arg0, Object arg1) {
	// TODO Auto-generated method stub
	
}
}