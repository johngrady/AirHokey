//Name John Grady -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{ private int velocity;

   private int xplace;
   
   private int yplace;
   
   private int scale;
   
   private int length;
   
    private Color color;
    
    public Paddle()
   {super();
      velocity =5; }
  public Paddle(int x, int y, int w, int h, Color col, int i)
   {   xplace = x;
	   yplace = y;
	   scale = w;
	   length = h;
	   color = col;
	   velocity = i; }
 public void moveUpAndDraw(Graphics window)
   {}

   public void moveDownAndDraw(Graphics window)
   { }

   public int getX()
   {
	   return xplace;
   }
   
   public int getY()
   {
	   return yplace;
   }
   
   
   public String toString()
   {
	   return xplace + " " + yplace + " " + scale + " " + length + " " + color + " ";
   }
}