import java.awt.*;
import javax.swing.*; 
class box  
{ 
    public static void main(String[] args)  
 { 
          JFrame j = new JFrame("List Box"); 
          JPanel panel = new JPanel(); 
         
          String[] items = {"Java", "Python", "C++", "JavaScript", "Ruby", "Swift"}; 
          JList<String> list = new JList<>(items); 
 
         list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); 
          list.setVisibleRowCount(5); 
 
          JScrollPane scrollPane = new JScrollPane(list); 
          JButton showButton = new JButton("Show Selected"); 
   
  panel.setLayout(new FlowLayout()); 
          panel.add(scrollPane); 
          panel.add(showButton); 
   
            j.add(panel); 
  j.setSize(400, 300); 
  j.setVisible(true);    
    } 
} 
 
 
 
