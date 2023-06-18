/**
 * program
 */
public class program {

    public static void main(String[] args) {
        float f = 123.45f;
        double e = 123.46;
        System.out.println(f);
        System.out.println(e);
        char ch = '{';
        System.out.println(ch);
        boolean f1 = true ^ false; // Разделительная дизъюнкция. Истина тогда и только тогда когда сторого одно из значений истина
        System.out.println(f1);
        //неявня типизация
        var a = 123;
        System.out.println(a);
        var d = 123.456;
        System.out.println(d);
        System.out.println(getType(a)); // Integer
        System.out.println(getType(d)); // Double
        //Строки
        String s = "qwert";
        System.out.println(s.length());
        System.out.println(s.charAt(1));
    }


    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}