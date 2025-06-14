package Udemy;

import java.util.List;
import java.util.ArrayList;

public class Unario {

    public class Banco {
        List<Conta> accounts = new ArrayList<>();

        public void addAccount(Conta account) {
            accounts.add(account);
            System.out.println(accounts);
        }

        public class Conta {
            String nome;
            double saldo;
            double limite;
            String numeroConta;
            Boolean contaCorrente;

            public Conta(String nome, double saldo, double limite, String numeroConta, Boolean contaCorrente) {
                this.nome = nome;
                this.saldo = saldo;
                this.limite = limite;
                this.numeroConta = numeroConta;
                this.contaCorrente = contaCorrente;
            }

            public void depositar(double valor) {
                if (valor < 0) {
                    System.out.println("Valor inválido");
                } else {
                    if (contaCorrente) {
                        saldo += limite + valor;
                        System.out.printf("Depósito de R$ %.2f novo saldo com limite é de %.2f%n", valor, saldo);
                    } else {
                        saldo += valor;
                        System.out.printf("Depósito de R$ %.2f novo saldo é de %.2f%n", valor, saldo);
                    }
                }
            }

            @Override
            public String toString() {
                return "Conta{" +
                        "nome='" + nome + '\'' +
                        ", saldo=" + saldo +
                        ", limite=" + limite +
                        ", numeroConta='" + numeroConta + '\'' +
                        ", contaCorrente=" + contaCorrente +
                        '}';
            }
        }
    }

    // Agora o main está na posição correta:
    public static void main(String[] args) {
        Unario unario = new Unario();
        Banco banco = unario.new Banco();
        Banco.Conta conta = banco.new Conta("Eugenio", 1000, 200, "0000-1", true);
        conta.depositar(200);
        banco.addAccount(conta);
    }
}
