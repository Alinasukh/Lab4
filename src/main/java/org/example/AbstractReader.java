package org.example;

/**
 * Интерфейс AbstractReader предоставляет методы для ввода данных из CSV-файла и вывода данных в консоль.
 */
public interface AbstractReader {

    /**
     * Ввод данных из csv-файла
     * @param csvFilePath путь к CSV-файлу
     */
    void input(String csvFilePath);

    /**
     * Вывод данных в консоль
     */
    void print();
}