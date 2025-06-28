package MeusProjetinhos;

public class Rascunho {
    int a = 10;

static int soma2 (int a) {
    return a += 2;
}


    
    public static void main(String[] args) {
        
        Rascunho amor = new Rascunho();
        amor.a = 12;
        amor.a = Rascunho.soma2(amor.a);
        System.out.println(amor.a);
    }
}
