package org.example;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Класс SCVParser представляет собой инструмент для чтения данных из CSV-файла и представления их в виде объектов Human.
 */
public class SCVParser implements AbstractReader {

    ArrayList<Human> people; // Список людей, полученных из CSV-файла
    ArrayList<Unit> units; // Список подразделений

    // Метод indexOfDivision возвращает индекс подразделения по имени
    private int indexOfDivision(String name) {
        for (int i = 0; i < units.size(); i++)
            if (units.get(i).getName().equals(name))
                return i;
        return -1;
    }

    /**
     * Конструктор класса SCVParser. Инициализирует списки людей и подразделений.
     */
    public SCVParser() {
        people = new ArrayList<>();
        units = new ArrayList<>();
    }

    /**
     * Метод input предназначен для считывания данных из CSV-файла и создания объектов Human на основе этих данных.
     * @param csvFilePath путь к CSV-файлу
     */
    @Override
    public void input(String csvFilePath) {
        int id, salary, division_id;
        String name;
        Gender gender;
        Date date;
        Unit unit;
        try {
            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
            CSVReader csvReader = new CSVReaderBuilder(new FileReader(csvFilePath)).withCSVParser(parser).build();
            List<String[]> allData = csvReader.readAll();

            for (int i = 1; i < allData.size(); i++) {
                id = Integer.parseInt(allData.get(i)[0]);
                name = allData.get(i)[1];
                gender = Gender.valueOf(allData.get(i)[2]);
                date = new SimpleDateFormat("dd.MM.yyyy").parse(allData.get(i)[3]);
                division_id = indexOfDivision(allData.get(i)[4]);
                if (division_id == -1) {
                    division_id = units.size();
                    unit = new Unit(division_id, allData.get(i)[4]);
                    units.add(unit);
                }
                else
                    unit = new Unit(division_id, allData.get(i)[4]);
                salary = Integer.parseInt(allData.get(i)[5]);
                people.add(new Human(id, name, gender, date, unit, salary));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для вывода информации о людях, считанных из CSV-файла.
     */
    @Override
    public void print() {
        for (int i = 0; i < people.size(); i++)
            people.get(i).print();
    }
}