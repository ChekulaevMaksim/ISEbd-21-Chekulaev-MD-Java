package lab1;

import java.awt.Color;
import java.awt.Graphics;


public class Exterm {
	private float _startPosX;
	private float _startPosY;
	private int _pictureWidth;
	private int _pictureHeight;
	private int extermWidth = 160;
	private int extermHeight = 60;
	private int MaxSpeed;
	public int getMaxSpeed(){
		return MaxSpeed;
	}
	private void setMaxSpeed(int value){
		MaxSpeed = value;
	}
	
	private float Weight;
	public float getWeight(){
		return Weight;
	}	
	private void setWeight(float value){
	Weight = value;
	}
	
	private Color MainColor;
	public Color getMainColor(){
		return MainColor;
	}
	private void setMainColor(Color value){
	MainColor = value;
	}
	
	private Color DopColor;
	public Color getDopColor(){
		return DopColor;
	}
	private void setDopColor(Color value){
	DopColor = value;
	}
	
	public Exterm(int maxSpeed, float weight, Color mainColor, Color dopColor) {
		setMaxSpeed (maxSpeed);
		setWeight(weight);
		setMainColor(mainColor);
		setDopColor (dopColor);
	}

	public void SetPosition(int x, int y, int width, int height) {
		_startPosX = x;
		_startPosY = y;
		_pictureWidth = width;
		_pictureHeight = height;
	}

	public void MoveTransport(Direction direction) {

		float step = getMaxSpeed() * 100 / getWeight();
		switch (direction) {
		case Right:
			if (_startPosX + step < _pictureWidth - extermWidth) {
				_startPosX += step;
			}
			break;
		case Left:
			if (_startPosX - step > 0) {
				_startPosX -= step;
			}
			break;
		case Up:
			if (_startPosY - step - 10 > 0) {
				_startPosY -= step;
			}
			break;
		case Down:
			if (_startPosY + step < _pictureHeight - extermHeight) {
				_startPosY += step;
			}
			break;
		}
	}

	public void DrawExt(Graphics g)  {
		g.setColor(Color.black);
		g.drawLine( (int)_startPosX + 100,(int) _startPosY +110,(int) _startPosX + 170, (int)_startPosY + 120);
		g.drawLine( (int)_startPosX + 100,(int) _startPosY + 130,(int) _startPosX + 170,(int) _startPosY + 120);
		g.drawLine( (int)_startPosX + 100,(int)_startPosY + 110, (int)_startPosX + 65,(int) _startPosY + 80);
		g.drawLine((int)_startPosX + 100,(int) _startPosY + 130,(int) _startPosX + 65,(int) _startPosY + 160);
		g.drawLine((int) _startPosX + 65,(int) _startPosY + 80,(int) _startPosX + 50, (int)_startPosY + 95);
		g.drawLine((int) _startPosX + 65,(int) _startPosY + 160,(int) _startPosX + 50,(int) _startPosY + 145);
		g.drawLine( (int)_startPosX + 50, (int)_startPosY + 95, (int)_startPosX + 65, (int)_startPosY + 110);
		g.drawLine( (int)_startPosX + 50, (int)_startPosY + 145,(int) _startPosX + 65,(int) _startPosY + 130);
		g.drawRect((int)_startPosX + 40, (int)_startPosY + 110, 25, 20);
		g.setColor(Color.blue);
		g.fillRect((int) _startPosX + 40,(int) _startPosY + 110, 25, 20);
		g.setColor(Color.black);
		g.drawLine((int) _startPosX + 40,(int) _startPosY + 120, (int)_startPosX + 25, (int)_startPosY + 110);
		g.drawLine((int) _startPosX + 40,(int) _startPosY + 120, (int)_startPosX + 25,(int) _startPosY + 130);
		g.setColor(Color.red);
		g.fillRect( (int) _startPosX + 61, (int) _startPosY + 90, 10, 10);
		g.setColor(Color.red);
		g.fillRect((int) _startPosX + 61,(int) _startPosY + 140, 10, 10);
	
	}   
}
