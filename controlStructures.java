public class controlStructures {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        // if (a > b) {
        // c = a;
        // } else {
        // c = b;
        // }

        if (a > b)
            c = a;
        if (b > a)
            c = b;
        System.out.println(c);

        int min = a < b ? a : b; // тернаоный оператор.
        System.out.println(min);
    }
}
