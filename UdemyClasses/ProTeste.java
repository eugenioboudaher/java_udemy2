package UdemyClasses;

public class ProTeste {
    public static void main(String[] args) {
        Pro p1 = new Pro();
        p1.nome = "Notebook";
        p1.preco = 4352.52;
        p1.desconto = 0.1;

        System.out.println(p1.nome);
        System.out.println(p1.preco);
        System.out.println(p1.desconto);
        System.out.printf("R$ %.2f", p1.preco *( 1 - p1.desconto));
    }
}
