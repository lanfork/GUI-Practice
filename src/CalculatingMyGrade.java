//********************************************************************
//  CalculatingMyGrade.java       Author: Kimberly Lanford
//
//  Demonstrates the use of text fields.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatingMyGrade extends JPanel
{
   private JLabel inputLabel, inputLabel2,outputLabel, resultLabel;
   private JTextField uncalculated, calculated;

   //-----------------------------------------------------------------
   //  Constructor: Sets up the main GUI components.
   //-----------------------------------------------------------------
   public CalculatingMyGrade()
   {
      inputLabel = new JLabel("Enter how many you got right:");
      outputLabel = new JLabel("Calculated grade is: ");
      resultLabel = new JLabel("---");

      uncalculated = new JTextField(5);
      uncalculated.addActionListener(new TempListener());
      calculated = new JTextField(5);
      calculated.addActionListener(new TempListener());

      add(inputLabel);   
      add(uncalculated);
      add(calculated);
      add(outputLabel);
      add(resultLabel);

      setPreferredSize(new Dimension(500, 75));
      setBackground(Color.green);
   }

   //*****************************************************************
   //  Represents an action listener for the numerator in input field
   //	and denominator in input2 field. 
   //*****************************************************************
   private class TempListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Performs the conversion when the enter key is pressed in
      //  the text field.
      //--------------------------------------------------------------
      public void actionPerformed(ActionEvent event)
      {
         double right, numOfQuestions, answer;

         String text = uncalculated.getText();
         String text2 = calculated.getText();

         right = Integer.parseInt (text);
         numOfQuestions = Integer.parseInt (text2);
         answer = (right / numOfQuestions) * 100;

         resultLabel.setText(Double.toString(answer));
      }
   }
}


