package MeusProjetinhos;

public class Banco {
    public class Conta  {
        private String nome;
        private double saldo;
        public Conta (String nome, double saldo) {
            this.nome = nome;  
            this.saldo = saldo;          
        }

        public void SetName (String nome) {
            this.nome = nome;
        }
        
        public void setSaldo (double saldo) {
            this.saldo = saldo;
        }

        public String getName () {
            return nome;
        }

        public double getSaldo () {
            return saldo;
        }

        public void depositar (double valor) {
            if (valor < 0) {
                System.out.println("Valor inválido");
                System.out.printf("Você tem R$ %.2f", saldo);
            }else {
                saldo += valor;
                System.out.printf("Você depositou R$ %.2f \n", valor);
                System.out.printf("Você tem R$ %.2f\n", saldo);
            }
        }
    }
    public static void main(String[] args) {
        Banco a = new Banco();
        Conta conta = a.new Conta("Eugenio", 2000);
        conta.depositar(200);
        System.out.println(conta.getSaldo());
        
    }
}