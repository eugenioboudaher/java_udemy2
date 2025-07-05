import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetJava {
    
    public static void main(String[] args) {
        SortedSet<String> lista = new TreeSet<>();

        lista.add("Eugenio");
        lista.add("Lucas");
        lista.add("Sueanne");
        lista.add("Delania");
        lista.add("Amélia");

        System.out.println(lista);
    }
}
