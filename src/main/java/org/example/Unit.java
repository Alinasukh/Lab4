package org.example;

/**
 * Класс Unit представляет подразделение организации с определенными атрибутами, такими как id и название.
 */
public class Unit {
    int id; // Уникальный идентификатор подразделения
    String name; // Название подразделения

    /**
     * Создает объект Unit с указанными атрибутами.
     * @param id уникальный идентификатор подразделения
     * @param name название подразделения
     */
    public Unit(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Возвращает название подразделения.
     * @return название подразделения
     */
    public String getName() {
        return name;
    }
}