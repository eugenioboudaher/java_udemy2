package UdemyIfElse;

import java.util.Scanner;

public class Introducao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a media: ");
        double media = sc.nextDouble();

        if(media < 7){
            System.out.println("Reprovado");
        }else {
            System.out.println("Aprovado");
        }

        sc.close();
    }
}
