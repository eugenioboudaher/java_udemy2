package UdemyIfElse;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = sc.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota Inválida");
        }else {
            if (nota >= 8 ) {
                System.out.println("A");
            }else if (nota >= 6 && nota < 8) {
                System.out.println("Passou");
            }else {
                System.out.println("REprovado");
            }
        }

        sc.close();
    }
}
