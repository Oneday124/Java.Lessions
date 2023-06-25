// Доступны циклы while, do while, for и его модификация for in
public class cycles {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;

        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);

        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);

        // continue, break
        // Операторы для управления циклами - continue и breake
        // Выполнение следующей итерации цикла - continue
        // Прерывание текущей итерации цикла - breake
        // *ближайшего к оператору

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0)
                continue;
            System.out.println(i); // 0, 2, 4, 6, 8
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0)
                break;
            System.out.println(i); // 0
        }

    }
}
