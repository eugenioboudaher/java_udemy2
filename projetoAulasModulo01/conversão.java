package projetoAulasModulo01;

public class conversão {
    public static void main(String[] args) {
        int  a = 400;
        Byte b = (byte) a;
        System.out.println(b);

        double c = 5.1;
        float d = (float) c;
        System.out.println(d);

        Integer x = 3;
        Double y = 2.3;

        String z = x.toString();
        System.out.println(z);
        
        String aa = y.toString();
        System.out.println(aa);

        int ab = 2;
        String ac = Integer.toString(ab);
        System.out.println(ac);

        int ad = 7;
        String ae = Integer.toString(ad);
        System.out.println(ae);

        Integer af = 8888;
        System.out.println(af.toString().length());
    }
}
