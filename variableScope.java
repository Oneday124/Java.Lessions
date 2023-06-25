// У переменных существует понятие "облсть видимости".
// Если переменную объявили внутри некоторого блока фигурных скобок {},
// то снаружи этого блока переменная будет не доступна.

public class variableScope {
    public static void main(String[] args) {
        {
            int i = 123;
            System.out.println(i);
        }
        System.out.println(i); // error: cannot find symbol
    }
}
