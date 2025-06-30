package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesfioMediaNptas {
    public static void main(String[] args) {
        
        double [] notas = new double[4];

        Scanner sc = new Scanner(System.in);
        double nota;

        int counter = 1;
        int index = 0;
        double soma = 0;
        double media = 0;
        while (index < 4) {
            System.out.println("Digite as notas");
            System.out.printf("Digite nota %d: " ,counter);
            nota = sc.nextDouble();
            notas[index] = nota;
            soma += nota;

            counter++;
            index++;
        }
        media = soma / notas.length;
        System.out.println(Arrays.toString(notas));
        System.out.println(media);
        sc.close();
    }
}
