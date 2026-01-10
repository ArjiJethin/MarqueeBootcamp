package W2Day2;

import java.util.*;

public class JumbledNumWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        sc.close();

        int[] arr = new int[256];
        for (char ch : str.toCharArray())
            arr[ch]++;

        int[] num = new int[10];

        // Unique letters
        num[0] = arr['z']; // zero
        num[2] = arr['w']; // two
        num[4] = arr['u']; // four
        num[6] = arr['x']; // six
        num[8] = arr['g']; // eight

        // Letters after removing uniques
        num[1] = arr['o'] - num[0] - num[2] - num[4]; // one
        num[3] = arr['h'] - num[8]; // three
        num[5] = arr['f'] - num[4]; // five
        num[7] = arr['s'] - num[6]; // seven

        // 'i' appears in five, six, eight, nine -> remaining is nine
        num[9] = arr['i'] - num[5] - num[6] - num[8];

        // Correct printing
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < num[i]; k++) {
                System.out.print(i);
            }
        }
    }
}
