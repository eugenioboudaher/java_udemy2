package UdemyIfElse;

import javax.swing.JOptionPane;

public class Else {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe o numero");

        double valorDouble = Double.parseDouble(valor);

        if (valorDouble % 2 == 0) {
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
    }
}
