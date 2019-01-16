package lab2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Exterminator extends Simpleplane{	
	
	private Color DopColor;
	public Color getDopColor(){
		return DopColor;
	}
	public void setDopColor(Color value) {

		DopColor = value;

    }
	public Exterminator(int maxSpeed, float weight, Color mainColor, Color dopColor) 
    {      
		super(maxSpeed, weight, mainColor);
        DopColor = dopColor;
    }

	public void DrawExterminator(Graphics g) {
		super.DrawExterminator(g);
		g.setColor(Color.blue);
		g.fillRect((int) _startPosX + 40,(int) _startPosY + 110, 25, 20);
		
		g.setColor(Color.black);
		//10
		g.drawLine((int) _startPosX + 40,(int) _startPosY + 120, (int)_startPosX + 25, (int)_startPosY + 110);
		//11
		g.drawLine((int) _startPosX + 40,(int) _startPosY + 120, (int)_startPosX + 25,(int) _startPosY + 130);
		//12
		g.setColor(Color.red);
		g.fillRect( (int) _startPosX + 61, (int) _startPosY + 90, 10, 10);
		
		//13
		g.setColor(Color.red);
		g.fillRect((int) _startPosX + 61,(int) _startPosY + 140, 10, 10);
	}
}
