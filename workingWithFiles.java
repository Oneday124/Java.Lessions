import java.io.FileWriter;
import java.io.IOException;

public class workingWithFiles {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", false)) { // try - обработка ошибок, определяем FileWriter (fw)
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush(); // метод принудительной записи
        } catch (IOException ex) {
            System.out.println(ex.getMessage()); // для вывода ошибки, если есть ошибки
        }

    }
}
