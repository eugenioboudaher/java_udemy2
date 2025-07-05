

import java.util.ArrayList;
import java.util.List;

public class ListJava {
    public static void main(String[] args) {
        
        List<Object> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Eugenio");
        Usuario u2 = new Usuario("Lucas");
        Usuario u3 = new Usuario("Sueanne");
        Usuario u4 = new Usuario("Eugenio");

        lista.add(u1);
        lista.add(u2);
        lista.add(u3);
        lista.add(u4);

        for (Object i : lista) {
            System.out.println(i.toString());
        }
    }
}
