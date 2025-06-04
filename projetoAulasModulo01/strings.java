package projetoAulasModulo01;

public class strings {

    public static void main (String[] args) {

        System.out.println("Eugenio".charAt(0));

        String e = "Euggenio abenoado por Deus".concat("!!!").toUpperCase();
        System.out.println(e);
        System.out.println(e.startsWith("E"));
        System.out.println(e.length());
        System.out.println(e.endsWith("U"));

        String nome = "Sueanne";
        double dinheiro = 100.555550;
        System.out.printf("Nome: => %s Frase que ama: => %s e possui R$ %.2f \n", nome, e,  dinheiro);
        System.out.println(e.contains("Deus"));
        System.out.println(e.indexOf("Deus"));
        System.out.println(e.substring(1));
       
    }
}