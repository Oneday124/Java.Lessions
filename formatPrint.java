public class formatPrint {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        // String res = a + " + " + b + " = " + c;
        // System.out.println(res);
        // String res2 = String.format("%d + %d = %d \n", a, b, c);
        System.out.printf("%d + %d = %d \n", a, b, c);
        // System.out.println(res2);
    }
}
