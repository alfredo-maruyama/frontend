import javax.swing.JOptionPane; // importa Javax: biblioteca, swing: módulo, JOptionPane: componente

public class Addition  //criação da classe "Addition"
{ // declara o início de um bloco de códigos
   public static void main(String[] args) // criação de um método executor main
   { // declara o inicio de um bloco de códigos
      String firstNumber = // declaração de uma variável
         JOptionPane.showInputDialog("Enter first integer"); // compotente + invocação de um método + parâmetro + mensagem que aparecerá ao usuario
      String secondNumber = // declaração de uma variável
         JOptionPane.showInputDialog("Enter second integer"); // compotente + invocação de um método + parâmetro + mensagem que aparecerá ao usuario

      int number1 = Integer.parseInt(firstNumber); // forma de armazenamento da variável
      int number2 = Integer.parseInt(secondNumber); // forma de armazenamento da variável

      int sum = number1 + number2; // somatória das variáveis
      JOptionPane.showMessageDialog(null, "The sum is " + sum, // componente + invocação de um método + mensagem que aparecerá ao usuário + a somatória das variáveis
         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE); // mensagem que aparece ao usuário
   } // declara o fim de um bloco de código
} // declara o fim de um bloco de código

