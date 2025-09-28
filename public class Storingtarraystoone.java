import java.util.Arrays;

public class Storingtarraystoone {

    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = {4, 5, 6};

        int a1 = a.length;
        int b1 = b.length;
        int n = a1 + b1;

        int c[] = new int[n];

        // copy first array
        for (int i = 0; i < a1; i++) {
            c[i] = a[i];
        }

        // copy second array
        for (int i = 0; i < b1; i++) {
            c[a1 + i] = b[i];
        }

        // print only once (not inside a loop)
        System.out.println("Combined array: " + Arrays.toString(c));
    }
}
