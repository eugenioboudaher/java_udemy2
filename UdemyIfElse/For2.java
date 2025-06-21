package UdemyIfElse;

public class For2 {
    public static void main(String[] args) {
        String inicial = "#";
        String finale = "######";

        for (; inicial.length() < finale.length(); inicial += "#") {
            System.out.println(inicial);
        }
    }
}
