package MeusProjetinhos;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Rascunho {
    public static void main(String[] args) {
        
        int ChosenNumber = 5, count = 0, highest = Integer.MAX_VALUE, lowest = Integer.MIN_VALUE;
        List<Integer> numList = new ArrayList<>();

        while (true) {
            String Usernumber = JOptionPane.showInputDialog("Digite o número de 1 a 10: ");
            int UsernumberInt = Integer.parseInt(Usernumber);

            if (UsernumberInt < 1){
                System.out.println("Não é primo");
            }else {
                for (int i = 1; i < UsernumberInt; i++) {
                    if (UsernumberInt % i == 1) {
                        System.out.println("É primo");
                    }else {
                        System.out.println("Não é primo");
                    }
                }
            }

            if (UsernumberInt < 0 || UsernumberInt > 10) {
                System.out.println("Só de 1 a 10");
                continue;
            }
            count += 1;
            numList.add(UsernumberInt);
            if (count == 1) {
                highest = UsernumberInt;
                lowest = UsernumberInt;
            }else {
                if (UsernumberInt > highest) highest = UsernumberInt;
                if (UsernumberInt < lowest) lowest = UsernumberInt;
            }


            if (UsernumberInt == ChosenNumber) {
                System.out.println("Parabéns, você ganhou");
                break;
            }
            else if (UsernumberInt < ChosenNumber) {
                System.out.println("Tente um número maior");
            } else {
                System.out.println("Tente um núero menor");
            }
        }
        System.out.printf("Tentativas: %d\n Maior Número: %d\n Menor Número: %d\n Lista de números %s",
                                    count, highest, lowest, numList);
    }
}
