package UdemyClasses;

public class JantarTeste {
    
    public static void main(String[] args) {
        

        Pessoa pessoa = new Pessoa("Eugenio", 91);
        Comida batata = new Comida("batata");

        pessoa.comer(batata, 0.8);
        pessoa.comer(batata, 0.8);
        pessoa.comer(batata, 0.8);
        pessoa.comer(batata, 0.8);
        pessoa.comer(batata, 0.8);

        System.out.println(pessoa.weight);
    }
}
