import java.awt.*;
import javax.swing.*; 
public class shape extends JPanel
{ 
   public void paintComponent (Graphics g) 
   { 
       Graphics2D g2d = (Graphics2D) g; 
       g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
RenderingHints.VALUE_ANTIALIAS_ON); 
       // Draw a line 
       g2d.setColor(Color.BLUE); 
       g2d.drawLine(50, 50, 200, 50); 
       // Draw a rectangle 
       g2d.setColor(Color.GREEN); 
       g2d.drawRect(50, 80, 150, 100); 
       // Fill the rectangle with color 
       g2d.setColor(Color.YELLOW); 
       g2d.fillRect(50, 80, 150, 100); 
       // Draw an ellipse 
       g2d.setColor(Color.RED); 
       g2d.drawOval(50, 200, 150, 100); 
       // Fill the ellipse with color 
 
       g2d.setColor(Color.CYAN); 
       g2d.fillOval(50, 200, 150, 100); 
   } 
   public static void main(String[] args) { 
       JFrame frame = new JFrame("Shape Drawer"); 
       shape panel = new shape(); 
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       frame.setSize(600, 600); 
       frame.add(panel); 
       frame.setVisible(true); 
   } 
}