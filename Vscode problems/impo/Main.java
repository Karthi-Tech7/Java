// import java.util.Random;
// public class whilelp {
//     public static void main(String[] args)
//     {
//         Random a = new Random();
//         int b = 0;
//         while(b!=7) {
//             b = a.nextInt(10);
//             System.out.println(b);
//         }
//     }

// }

// import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();

        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
            System.out.println(a[i]);
        }

        int largest = a[0];
        int i = 1;

        while (i < a.length) {
            if (a[i] > largest) {
                largest = a[i];
            }
            i++;
        }

        System.out.println("Largest: " + largest);
    }
}