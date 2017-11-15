package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import model.World;
import view.Mydisplay;

public class MouseController implements MouseMotionListener {
	protected Mydisplay vue ;

	public MouseController() {
		this.vue=null;
		
		
	
	}
	public MouseController(Mydisplay vue) {
		this.vue=vue;
		vue.addMouseMotionListener(this);
	}
	
	public void mouseMoved(MouseEvent e) {
		 this.vue.w.shapes.get(0).getCentre().setX(e.getX());
		 this.vue.w.shapes.get(0).getCentre().setY(e.getY());
		 this.vue.repaint();
	}
	public void mouseDragged(MouseEvent e) {}
}