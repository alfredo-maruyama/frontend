import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseTrackerFrame extends JFrame
{
   private final JPanel mousePanel; 
   private final JLabel statusBar; 


   public MouseTrackerFrame()
   {
      super("Demonstrating Mouse Events"); // titulo

      mousePanel = new JPanel(); 
      mousePanel.setBackground(Color.WHITE); 
      add(mousePanel, BorderLayout.CENTER); 

      statusBar = new JLabel("Mouse outside JPanel"); 
      add(statusBar, BorderLayout.SOUTH); 

      MouseHandler handler = new MouseHandler(); 
      mousePanel.addMouseListener(handler); 
      mousePanel.addMouseMotionListener(handler); 

   } 

   private class MouseHandler implements MouseListener, 
      MouseMotionListener 
   {

      @Override
      public void mouseClicked(MouseEvent event)
      {
         statusBar.setText(String.format("Clicked at [left: %d, top: %d, right: %d, bottom: %d]",  // [d,d] referencia a double (um atribuido ao getX e o outro ao getY)
            event.getX(), event.getY(), mousePanel.getWidth() - event.getX(), mousePanel.getHeight() - event.getY()));
      } 

      @Override
      public void mousePressed(MouseEvent event) // "mouse pressionado"
      {
         statusBar.setText(String.format("Pressed at [left: %d, top: %d, right: %d, bottom: %d]", 
            event.getX(), event.getY(), mousePanel.getWidth() - event.getX(), mousePanel.getHeight() - event.getY()));
      }
 
      @Override
      public void mouseReleased(MouseEvent event) // "ao soltar o mouse"
      {
         statusBar.setText(String.format("Released at [left: %d, top: %d, right: %d, bottom: %d]", 
            event.getX(), event.getY(), mousePanel.getWidth() - event.getX(), mousePanel.getHeight() - event.getY()));
      }

      @Override
      public void mouseEntered(MouseEvent event) 
      {
         statusBar.setText(String.format("Mouse entered at [left: %d, top: %d, right: %d, bottom: %d]",
            event.getX(), event.getY(), mousePanel.getWidth() - event.getX(), mousePanel.getHeight() - event.getY()));
         mousePanel.setBackground(Color.GREEN);
      }

      @Override
      public void mouseExited(MouseEvent event) // mouse ao sair do painel
      {
         statusBar.setText("Mouse outside JPanel");
         mousePanel.setBackground(Color.WHITE); // ao sair do painel, o plano de fundo volta a ser branco
      }


      @Override
      public void mouseDragged(MouseEvent event) // mouse ao ser arrastado/puxado
      {
         statusBar.setText(String.format("Dragged at [left: %d, top: %d, right: %d, bottom: %d]",
            event.getX(), event.getY(), mousePanel.getWidth() - event.getX(), mousePanel.getHeight() - event.getY()));
      } 

      @Override
      public void mouseMoved(MouseEvent event) // mouse ao ser movido
      {
         statusBar.setText(String.format("Moved at [left: %d, top: %d, right: %d, bottom: %d]", 
            event.getX(), event.getY(), mousePanel.getWidth() - event.getX(), mousePanel.getHeight() - event.getY()));
      } 
   } 
} 
