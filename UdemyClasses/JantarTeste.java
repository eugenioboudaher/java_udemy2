package UdemyClasses;

public class JantarTeste {
    
    public static void main(String[] args) {
        

        Pessoa pessoa = new Pessoa("Eugenio", 91);
        Comida batata = new Comida("batata", 0.8);
        Comida arroz = new Comida("arroz", 0.3);
        Comida feijao = new Comida("feijão", 0.5);

        pessoa.comer(batata, arroz, feijao);


        System.out.println(pessoa.weight);
    }
}
