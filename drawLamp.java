import java.awt.*;  
import java.applet.*;  


public class drawLamp extends Applet {  


        public void paint(Graphics g)
		{
			g.drawOval(140,50,400,50);
			g.drawLine(140,75,100,270);
			g.drawLine(540,75,580,270);
			g.drawArc(100,245,480,50,0,-180);
			g.drawOval(160,140,40,100);
			g.drawOval(320,130,50,150);
			g.drawOval(480,140,40,100);
			g.drawLine(340,295,300,470);
			g.drawLine(350,295,390,470);
			g.drawRect(140,470,400,30);
			g.setColor(Color.yellow);
			g.fillOval(140,50,400,50);
			g.fillOval(160,140,40,100);
			g.fillOval(320,130,50,150);
			g.fillOval(480,140,40,100);
		}

}