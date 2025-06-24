package UdemyClasses;


public class Pro {
    String nome;
    double preco;
    double desconto;

    public Pro (String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public Pro () {};



    public String precoComDesconto (double  descontoDoGerente ) {
        double precoFinal = preco * (1 -( desconto + descontoDoGerente));
        return String.format("O porduto %s ficou com o preço de R$ %.2f", nome, precoFinal);
    }
    public String precoComDesconto ( ) {
        double precoFinal = preco * (1 -( desconto ));
        return String.format("O porduto %s ficou com o preço de R$ %.2f", nome, precoFinal);
    }

    

}
