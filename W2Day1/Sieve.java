package W2Day1;

import java.util.*;

public class Sieve {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int noe;
        char[] arr;

        noe = sc.nextInt();
        arr = new char[noe];

        sc.close();

        long start_time = System.nanoTime();

        for (int i = 0; i < noe; i++) {
            arr[i] = 'P';
        }

        arr[0] = 'N';
        arr[1] = 'N';

        int multiple;

        for (multiple = 4; multiple < noe; multiple += 2) {
            arr[multiple] = 'C';
        }

        int prime, inc, compctr;
        compctr = noe / 2;

        for (prime = 3; prime * prime < noe; prime += 2) {
            if (arr[prime] == 'C') {
                continue;
            }
            inc = prime << 1;
            for (multiple = prime * prime; multiple < noe; multiple += inc) {
                if (arr[multiple] == 'P') {
                    arr[multiple] = 'C';
                    compctr++;
                }
            }
        }

        int pctr = noe - compctr;
        System.out.printf("In the range %d to %d , we have %d primes", 1, noe, pctr);

        long end_time = System.nanoTime();
        double duration = (end_time - start_time) / 1_000_000_000.0;
        System.out.printf("\nDuration = %.3f seconds\n", duration);

    }

}