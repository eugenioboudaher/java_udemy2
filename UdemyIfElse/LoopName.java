package UdemyIfElse;

public class LoopName {
    public static void main(String[] args) {
        
        external: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    break external;
                }
                System.out.printf("i = %d // j = %d \n", i, j);
            }
        }
    }
}
