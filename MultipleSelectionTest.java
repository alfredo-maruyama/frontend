import javax.swing.JFrame; // importando da biblioteca Javax

public class MultipleSelectionTest // criação da classe MultipleSelectionTest
{ // inicia um bloco de código
   public static void main(String[] args) // criação do parametro de argumento + tipo String
   { 
      MultipleSelectionFrame multipleSelectionFrame = // atribuindo ao MultipleSelectionFrame um objeto
         new MultipleSelectionFrame(); 
      multipleSelectionFrame.setDefaultCloseOperation(  // define um padrão de fechamento
         JFrame.EXIT_ON_CLOSE);
      multipleSelectionFrame.setSize(550, 350); // define o tamanho da caixa
      multipleSelectionFrame.setVisible(true); // define a visibilidade da caixa
   } 
} // fecha o bloco de código