
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyGradeCalculator {
   //-----------------------------------------------------------------
   //  Creates and displays the Grade converter GUI.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Grade Calculator");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
      CalculatingMyGrade panel = new CalculatingMyGrade();
     
      JPanel subPanel1 = new JPanel();
      subPanel1.setPreferredSize(new Dimension(150, 100));
      subPanel1.setBackground(Color.green);
      JLabel label11 = new JLabel("One");
      subPanel1.add(label11);
      
      
     
      
      JPanel primary = new JPanel();
      primary.setBackground(Color.cyan);
    //  primary.add(subPanel1);
      primary.add(panel);
      primary.add(new LeftRightPanel());
      
     
      frame.getContentPane().add(primary);
      frame.pack();
      frame.setVisible(true);
    

      
   }
}