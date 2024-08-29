import javax.swing.JFrame; // importação de uma biblioteca/módulo/componente

public class RadioButtonTest  // criação de uma classe
{ // inicio de um bloco de código
   public static void main(String[] args) // criação de um argumento
   {
      RadioButtonFrame radioButtonFrame = new RadioButtonFrame(); // definindo uma atribuição ao método
      radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define um padrão de operador de fechamento
      radioButtonFrame.setSize(300, 100);  // define o tamanho da caixa
      radioButtonFrame.setVisible(true);  // define a visibilidade da caixa
   } 
} // fechamento do bloco de código