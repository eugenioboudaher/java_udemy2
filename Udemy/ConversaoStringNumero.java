package Udemy;
import javax.swing.JOptionPane;

public class ConversaoStringNumero {
    public static void main(String[] args) {
       
        String nome = JOptionPane.showInputDialog("Digite o nome");
        String salario = JOptionPane.showInputDialog("Digite o salario");
       

        double salarioDouble = Double.parseDouble(salario);
        double  impostoDouble = salarioDouble * 0.27;
       

        JOptionPane.showMessageDialog(null, "Nome digitado: " + nome);
        JOptionPane.showMessageDialog(null, "Salário digitado: " + salarioDouble);
        JOptionPane.showMessageDialog(null, "Imposto de renda: " + impostoDouble);
    }
    

}
