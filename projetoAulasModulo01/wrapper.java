package projetoAulasModulo01;

public class wrapper {
    public static void main(String[] args) {
        Byte a = 10;
        Short b = 100;
        Integer c = 1000;
        Long d = 1000000000000L;

       System.out.println(Byte.valueOf(a));
       System.out.println(Short.valueOf(a));
       System.out.println(c.toString());
       System.out.println(Long.toString(d));

       Boolean bo = Boolean.parseBoolean("true");
       System.out.println(bo.toString().toUpperCase());

       Character z = '#';
       System.out.println(z + "...");
       System.out.println(b);

       
    }
}
