//John Grady-
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{private int xVelocity;

	private int yVelocity;
	
	private int xplace;
	
	private int yplace;
	
	private int scale;
	
	private int length;
	
	private Color color;
	
	public Ball()
	{super(200,200,10,10, Color.BLACK);
		xVelocity = 3;
		yVelocity = 1;
	}
	public Ball(int x, int y, int w, int h, Color col, int i, int j)
	{	xplace = x;
		yplace = y;
		scale = w;
		length = h;
		color = col;
		xVelocity = i;
		yVelocity = j;
	} public void setYVelocity(int y) 
	 {  y = yVelocity;
	 }public void setXVelocity(int x) 
	 {
		  x = xVelocity;	
	 }public void moveAndDraw(Graphics window)
   { window.setColor(Color.WHITE);
	      window.drawOval(xplace, yplace, scale, length);     setX(getX()+xVelocity);
      setX(getY()+yVelocity);
      window.setColor(color);
      window.fillOval(xplace, yplace, scale, length);
   }
	public boolean equals(Object obj)
	{return false;
	}  public int getXVelocity()
	   {  return xVelocity;
	   } public int getYVelocity()
	   {return yVelocity;
	   }
	public String toString()
	   {  return xplace + " " + yplace + " " + scale + " " + length + " " + color + " ";
	   }
	
}