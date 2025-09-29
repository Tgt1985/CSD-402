public class Pyramid {
    public static void printMain(int n) {
        for (int r = 1; r <= n; r++) {
            for (int l = 1; l <= n - r; l++) {

                // Left spaceings
                System.out.print(" ");

            }
            // used to represent t(r, y)
            int t = 1;
            for (int y = 1; y <= r; y++) {

                // First values is 1
                System.out.print(t + " ");
                t = t * (r - y) / y;
            }
            // Print a blank line
            System.out.println();
        

    }
       
    }
    public static void main(String[] args) {
        int n = 8;
        printMain(n);
    }
}
