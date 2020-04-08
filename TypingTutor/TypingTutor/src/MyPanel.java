
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JComponent;


public class MyPanel extends JComponent{
     int x = 320;
     int y = 280;
     int starttime = 0 ;
     boolean focus = false;
     Font font = new Font(Font.SERIF,Font.PLAIN,22);
     
     ArrayList<Char> ch = new ArrayList<Char>();
     
     String string = "jfjf jfjf jfjf jfjf jfjf jfjf fjfj fjfj fjfj fjfj fjfj";
             
    public MyPanel() {
        
        this.setSize(200, 100);
        this.setFocusable(focus);
       
        for (int i = 0; i < string.length(); i++) {
            
            Char ch = new Char();
            ch.str=String.valueOf(string.charAt(i));
            this.ch.add(ch);
            
        }

    }
    
    public void paint(Graphics g)
    {
        Graphics2D g2d=(Graphics2D)g;
        g2d.setFont(font);
        for(Char z: ch )
        {
            g2d.setColor(z.clr);
            g2d.drawString(z.str, x, y);
            x+= 9;  
        }
        
        x = 320;
        
        
    }
    

      

}
