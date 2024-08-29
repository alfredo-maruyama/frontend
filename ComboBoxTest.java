import javax.swing.JFrame; // importação de uma biblioteca

public class ComboBoxTest // criação de uma classe 
{ // inicio do bloco de código
   public static void main(String[] args) // criação de um parametro/argumento
   { 
      ComboBoxFrame comboBoxFrame = new ComboBoxFrame();  // define a atribuição de um metodo
      comboBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define um padrão de operação de fechamento
      comboBoxFrame.setSize(350, 150); // define o tamanho da caixa
      comboBoxFrame.setVisible(true);  // define a visibilidade da caixa
   } 
} // fecha o bloco de código