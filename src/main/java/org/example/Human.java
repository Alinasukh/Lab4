package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Класс Human представляет собой человека с определенными атрибутами, такими как id, имя, пол, дата рождения, подразделение и зарплата.
 */
public class Human {
    int id;
    String name;
    Gender gender;
    Date date;
    Unit unit;
    int salary;

    /**
     * Метод Human создает объект с указанными атрибутами.
     * @param id уникальный идентификатор человека
     * @param name имя человека
     * @param gender пол человека
     * @param date дата рождения человека
     * @param unit подразделение
     * @param salary зарплата человека
     */
    public Human(int id, String name, Gender gender, Date date, Unit unit, int salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.unit = unit;
        this.salary = salary;
    }


    /**
     * Метод print выводит информацию о человеке, включая id, имя, пол, дату рождения, подразделение и зарплату.
     */
    public void print() {
        String pattern = "MM.dd.yyyy";
        DateFormat df = new SimpleDateFormat(pattern);
        String separator = " ";

        System.out.print(id + separator);
        System.out.print(name + separator);
        System.out.print(gender + separator);
        System.out.print(df.format(date) + separator);
        System.out.print(unit.getName() + separator);
        System.out.println(salary + separator);
    }
}