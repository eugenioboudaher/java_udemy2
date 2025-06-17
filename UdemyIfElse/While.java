package UdemyIfElse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0, even = 0, odd = 0, sum = 0, highest = 0;
        List<Integer> numList = new ArrayList<>();
        while (true) {
            
            System.out.print("Digite o núemro: ");
            int num = sc.nextInt();
            sc.nextLine();

            numList.add(num);

            sum += num;
            if (num % 2 == 0) {
                even++;
            }else {
                odd++;
            }

            if (num > highest) {
            highest = num;
            }
            
            counter++;
            if (num == 0){
                System.out.println("fim");
                break;
            }
            


        }
        System.out.printf("Total de números: %d \n", counter);
        System.out.printf("Soma de números: %d \n", sum);
        System.out.printf("Total de números pares: %d \n", even);
        System.out.printf("Total de números impares: %d \n", odd);
        System.out.printf("O maior número é: %d \n", highest);
        System.out.printf("Lista de números digitados: %s\n", numList);
        sc.close();
    }
}
