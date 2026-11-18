import java.util.Random;

public class Q6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(256);
        System.out.println("Number: " + num);
        
        int[] binary = new int[8];
        int temp = num;
        
        for (int i = 7; i >= 0; i--) {
            binary[i] = temp % 2;
            temp /= 2;
        }
        
        System.out.print("Binary: ");
        for (int i = 0; i < binary.length; i++) {
            System.out.print(binary[i]);
        }
        System.out.println();
    }
}