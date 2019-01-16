package lab1;

import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelExt extends JPanel {
	public static Exterm exterm;
	public static boolean initialization = false;
	
	@Override 
	public void paint(Graphics g) { 
		super.paint(g); 
		if(initialization) {
			exterm.DrawExt(g);
		}
	}


}
