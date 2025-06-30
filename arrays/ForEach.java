package arrays;

public class ForEach {
    
    public static void main(String[] args) {
        
        double [] a = {9, 8, 7 , 9.4};

        int counter = 0;
        for (double j : a) {
            if (counter == a.length - 1) {
                System.out.println(j);
            }else {
                System.out.print(j + " -- ");
            }
            counter++;
        }
    }
}
