package MeusProjetinhos;

public class Rascunho {
    public int somar (int... args) {
        int soma = 0;
        for (int i : args) {
            soma += i;            
        }
        return soma;
    }

    public static void main(String[] args) {
        Rascunho eugenio = new Rascunho();

        System.out.println(eugenio.somar(2,2,5,7,8));
    }
}
