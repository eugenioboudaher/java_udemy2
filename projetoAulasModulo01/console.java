package projetoAulasModulo01;

import java.util.Scanner;

public class console {
    public static void main (String[] args) {

        System.out.print("Bom dia \n");
        System.out.printf("Salário = %.2f \n",1568.45874);
        System.out.printf("Salário = %d \n", 5);
        System.out.printf("Salário = %s", "Eugenio");

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println(nome);

        sc.close();

    }
}
