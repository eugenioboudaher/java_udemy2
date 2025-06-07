package projetoAulasModulo01;
import javax.swing.JOptionPane;


public class Desafio1Conversão {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Type your name:");
        String salary1 = JOptionPane.showInputDialog("Type your salary 1:");
        String salary2 = JOptionPane.showInputDialog("Type your salary 2:");
        String salary3 = JOptionPane.showInputDialog("Type your salary 3:");

        if (salary1.contains(",")) {
            salary1 = salary1.replace(",", ".");
        }
        if (salary2.contains(",")) {
            salary2 = salary2.replace(",", ".");
        }
        if (salary3.contains(",")) {
            salary3 = salary3.replace(",", ".");
        }

        double salary1Double = Double.parseDouble(salary1);
        double salary2Double = Double.parseDouble(salary2);
        double salary3Double = Double.parseDouble(salary3);

        double media = (salary1Double + salary2Double + salary3Double) / 3;

        System.out.printf("O funcionário: %s, ganhou uma média de R$ %.2f", name, media);
    }
}
