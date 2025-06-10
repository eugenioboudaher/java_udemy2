package MeusProjetinhos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {           

            System.out.println("Digite um numero:");
            int numero = sc.nextInt();
            sc.nextLine();
            if (numero % 2 == 0) {
                pares.add(numero);

            }else {
                impares.add(numero);
            }

            System.out.println("Deseja sair?");
            String opcao = sc.nextLine();
            if (opcao.equals("s") ) {
                break;
            }else {
                continue;
            }


        }
            System.out.println(pares);
            System.out.println(impares);
            sc.close();
    }
}
