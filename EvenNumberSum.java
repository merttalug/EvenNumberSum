import java.util.Scanner;

public class EvenNumberSum {
    public static void main(String[] args) {
        int k, total = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("Please enter an even number: ");
            k = inp.nextInt();
            if (k % 4 == 0) {
                total += k;
            }
        }
        while (k > 0 && k % 2 == 0);
        System.out.println("Sum: " + total);

    }
}
