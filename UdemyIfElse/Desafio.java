package UdemyIfElse;

import javax.swing.JOptionPane;

public class Desafio {
    public static void main(String[] args) {
        String dia = JOptionPane.showInputDialog("Digite um numero");

        int diaNum = Integer.parseInt(dia);

        switch (diaNum) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        
            default:
                break;
        }
    }
}
