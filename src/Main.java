import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count = 0;
        while (true) {
            String path = new Scanner(System.in).nextLine();

            File file = new File(path);
            Boolean fileExists = file.exists();
            Boolean isdirectory = file.isDirectory();

            if (fileExists && !isdirectory) {
                System.out.println("Путь ниже указан верно:");
                System.out.println(file);
                count++;
                System.out.println("Это файл номер "+count);
                System.out.println("");
            }

            else {
                System.out.println("Путь ниже указан не верно:");
                System.out.println(file);
                System.out.println("");
            }

        }
    }

}