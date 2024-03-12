package Lesson01_03.task_4;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {


    public static void main(String[] args) {
        String sourcePath = "source.txt";
        String targetPath = "target.txt";

        CopyFileContent(sourcePath, targetPath);

    }


    private static void CopyFileContent(String sourcePath, String targetPath) {
        try (var reader = new FileReader(sourcePath);
             var writer = new FileWriter(targetPath)) {

            while (reader.ready()) {          // Проверяем готов ли поток к чтению, и что он не пуст.
                writer.write(reader.read());  // Читаем и записываем данные в выходной поток.
            }


        } catch (FileNotFoundException exception) {
            System.out.println("Файл не найден - " + exception.getMessage());

        } catch (IOException exception) {
            System.out.println("Ошибка ввода/вывода - " + exception.getMessage());
        }
    }
}
