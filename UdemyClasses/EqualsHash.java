package UdemyClasses;

public class EqualsHash {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Eugenio";
        u1.email = "aeug@gmail.com";
        
        Usuario u2 = new Usuario();
        u2.nome = "Eugenio";
        u2.email = "eug@gmail.com";

        String a = "eugenio";
        String b = "eugenio";

        System.out.println(u1.equals(u2));
        System.out.println(a.equals(b));
        
    }
}
