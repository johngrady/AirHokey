//Name -John Grady
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xplace;
	
	private int yplace;
	
	private int scale;
	
	private int length;
	
	private int xvelocity;
	
	private int yvelocity;
	
	private int velocity;
	private Color color;
	public Block()
	{}
	public Block(int x, int y, int w, int h, Color c)
	{xplace = x;
		yplace = y;
		this.scale = w;
		this.length = h;
		this.color = c;}
   public void setplace( int x, int y) {

   {
    	x = xplace;
    	y = yplace;
   }}

   public void setX( int x ) {
}
   {
       int x = xplace;	
   }

   public void setY( int y )
   {
       y = yplace;
   }
   
   public void setscale( int w )
   {
       w = scale;
   }
   
   public void setlength( int h )
   {
       h = length;
   }
   
   public void setColor(Color col)
   {
	   col = color;

   }
   
   public void setYvelocity(int y) 
   {
		y = yvelocity;
   }
   
   public void setXvelocity(int x) 
   {
	    x = xvelocity;	
   }
   
   public int getX()
   {
	   return xplace;
   }
   
   public int getY()
   {
	   return yplace;
   }
   
   public int getscale()
   {
	   return scale;
   }
   
   public int getlength()
   {
	   return length;
   }

   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getscale(), getlength());
   } public void draw(Graphics window, Color col)
   { }public boolean equals(Object obj)
	{return false;
	}   
 
   public String toString()
   {
	   return xplace + " " + yplace + " " + scale + " " + length + " " + color + " ";
   }

@Override
public void setPos(int x, int y) {
}}