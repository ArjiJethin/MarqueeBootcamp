import java.util.*;

public class SuperUglyNumGen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nop = sc.nextInt();
        int[] primes = new int[nop];

        for (int i = 0; i < nop; i++) {
            primes[i] = sc.nextInt();
        }

        sc.close();

        int ctr = 1;
        System.out.println(1);

        int num = 2;
        while (ctr < n) {
            int index = 0;
            int temp = num;
            // boolean isSuperUgly = true;

            while (temp != 1 && index < primes.length) {
                if (temp % primes[index] == 0) {
                    while (temp % primes[index] == 0) {
                        temp /= primes[index];
                    }
                } else {
                    index++;
                }
            }

            if (temp == 1) {
                System.out.print(num + " ");
                ctr++;
            }

            num++;
        }
    }
}