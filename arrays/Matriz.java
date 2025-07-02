package arrays;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matriz {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Lançamento de notas");
        System.out.print("Digite o numero de alunos: ");
        int alunos = sc.nextInt();
        double nota;
        List<List<Double>> notas = new ArrayList<>();

        for (int i = 0; i < alunos; i++) {
            List<Double> alunoNotas = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite a nota %d : ", j + 1);
                nota = sc.nextDouble();
                alunoNotas.add(nota);              
            }
            notas.add(alunoNotas);
        }
        System.out.println(notas);
    }
}
