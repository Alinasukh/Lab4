package org.example;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class SCVParserTest {

    @Test
    void testInputAndPrint() {
        SCVParser parser = new SCVParser();
        String testFilePath = "D:\\ВГУ\\Программирование\\Lab 4 Java\\src\\test\\java\\org\\example\\test.csv";

        // Создаем тестовый CSV-файл
        createTestCSVFile(testFilePath);

        // Проверяем правильность чтения и вывода данных
        parser.input(testFilePath);
        parser.print();

        // Удаляем тестовый файл при завершении работы программы
        File file = new File(testFilePath);
        file.deleteOnExit();
    }

    // Вспомогательный метод для создания тестового CSV-файла
    private void createTestCSVFile(String filePath) {
    }
}