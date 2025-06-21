package UdemyIfElse;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a faixa: ");
        String faixa = sc.nextLine();

        switch (faixa) {
            case "Black":
                System.out.println("Sabe kata 1");
            case "Brown":
                System.out.println("Sabe kata 1");
            case "Green":
                System.out.println("Sabe kata 1");
            case "Yellow":
                System.out.println("Sabe kata 1");
            case "White":
                System.out.println("Sabe kata 1");
        }


        sc.close();
    }
}
