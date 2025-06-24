package UdemyClasses;

public class ProTeste {
    public static void main(String[] args) {
        Pro p1 = new Pro();
        p1.nome = "Notebook";
        p1.preco = 4352.52;
        p1.desconto = 0.1;
        
        Pro p2 = new Pro();
        p2.nome = "Celular";
        p2.preco = 1352.52;
        p2.desconto = 0.2;
        

        System.out.println(p1.nome);
        System.out.println(p1.preco);
        System.out.println(p1.desconto);
        System.out.println(p1.precoComDesconto(0.2));
        System.out.println(p2.precoComDesconto());
    }
}
