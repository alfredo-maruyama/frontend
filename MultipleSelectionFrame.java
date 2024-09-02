// importação da biblioteca
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// criação da classe MultipleSelectionFrame + herança do JFrame
public class MultipleSelectionFrame extends JFrame 
{
   private final JList<String> colorJList;  
   private final JList<String> copyJList;  
   private final JList<String> copyJList2;  
   private JButton copyJButton;
   private JButton copyJButton2; 
   private static final String[] colorNames = {"Black", "Blue", "Cyan",
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", 
      "Pink", "Red", "White", "Yellow"};

   // construtor do MultipleSelectionFrame
   public MultipleSelectionFrame()
   {
      super("Multiple Selection Lists"); // definindo o titulo
      setLayout(new FlowLayout());

      colorJList = new JList<String>(colorNames); // lista dos nomes das cores
      colorJList.setVisibleRowCount(5); // define a visibilidade das linhas 
      colorJList.setSelectionMode(
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      add(new JScrollPane(colorJList)); // habilita o scroll no painel

      copyJButton = new JButton("Copy >>>"); 
      copyJButton.addActionListener(
         new ActionListener() 
         {  
            
            @Override
            public void actionPerformed(ActionEvent event)
            {
               
               copyJList.setListData(
                  colorJList.getSelectedValuesList().toArray(
                     new String[0]));
            }
         } 
      ); 

      add(copyJButton); // adiciona o botão "copyJButton"

      copyJList = new JList<String>(); 
      copyJList.setVisibleRowCount(5); 
      copyJList.setFixedCellWidth(100); 
      copyJList.setFixedCellHeight(15); 
      copyJList.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      add(new JScrollPane(copyJList)); 


      copyJButton2 = new JButton("Copy >>>"); 
      copyJButton2.addActionListener(
         new ActionListener() 
         {  
            
            @Override
            public void actionPerformed(ActionEvent event)
            {
               
               copyJList2.setListData(
                  copyJList.getSelectedValuesList().toArray(
                     new String[0]));
            }
         } 
      ); 
      
      add(copyJButton2);

      copyJList2 = new JList<String>(); 
      copyJList2.setVisibleRowCount(5); 
      copyJList2.setFixedCellWidth(100); 
      copyJList2.setFixedCellHeight(15); 
      copyJList2.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      add(new JScrollPane(copyJList2)); 
 
   } 
} 