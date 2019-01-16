package lab2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Simpleplane extends Plane{
	protected  int extermWidth = 150;
    protected  int extermHeight = 160;
    public Simpleplane(int maxSpeed, float weight, Color mainColor)
    {
        MaxSpeed = maxSpeed;
        Weight = weight;
        MainColor = mainColor;
    }
   
    public  void MoveTransport(Direction direction)
    {
        float step = MaxSpeed * 100 / Weight;
        switch (direction)
        {
            case Right:
                if (_startPosX + step < _pictureWidth - extermWidth)
                {
                    _startPosX += step;
                }
                break;
            case Left:
                if (_startPosX - step > 0)
                {
                    _startPosX -= step;
                }
                break;
            case Up:
                if (_startPosY - step - 10 > 0)
                {
                    _startPosY -= step;
                }
                break;
            case Down:
                if (_startPosY + step < _pictureHeight - extermHeight)
                {
                    _startPosY += step;
                }
                break;
        }
    }
    public void DrawExterminator(Graphics g)
    {
    	g.setColor(Color.black);
		//1
		g.drawLine( (int)_startPosX + 100,(int) _startPosY +110,(int) _startPosX + 170, (int)_startPosY + 120);
		//2
		g.drawLine( (int)_startPosX + 100,(int) _startPosY + 130,(int) _startPosX + 170,(int) _startPosY + 120);
		//3
		g.drawLine( (int)_startPosX + 100,(int)_startPosY + 110, (int)_startPosX + 65,(int) _startPosY + 80);
		//4
		g.drawLine((int)_startPosX + 100,(int) _startPosY + 130,(int) _startPosX + 65,(int) _startPosY + 160);
		//5
		g.drawLine((int) _startPosX + 65,(int) _startPosY + 80,(int) _startPosX + 50, (int)_startPosY + 95);
		//6
		g.drawLine((int) _startPosX + 65,(int) _startPosY + 160,(int) _startPosX + 50,(int) _startPosY + 145);
		//7
		g.drawLine( (int)_startPosX + 50, (int)_startPosY + 95, (int)_startPosX + 65, (int)_startPosY + 110);
		//8
		g.drawLine( (int)_startPosX + 50, (int)_startPosY + 145,(int) _startPosX + 65,(int) _startPosY + 130);
		g.drawRect((int)_startPosX + 40, (int)_startPosY + 110, 25, 20);
    }
}
