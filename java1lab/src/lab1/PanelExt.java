package lab2;

import java.awt.Graphics;

import javax.swing.JPanel;
public class PanelPlane extends JPanel{
	public static ITransport exterminator;
	public static boolean initialization = false;
	
	void setShip(ITransport transport) 
	{
        exterminator = transport;
    }

	
	@Override  
	public void paint(Graphics g) { 
		super.paint(g); 
		if(exterminator != null) {
			exterminator.DrawExterminator(g);
		}
	}
	
	
}
