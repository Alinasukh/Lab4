package org.example;

public class Main {

    public static void main(String[] args) {
        SCVParser parser = new SCVParser();
        parser.input("D:\\ВГУ\\Программирование\\Lab 4 Java\\src\\main\\java\\org\\example\\foreign_names.csv");
        parser.print();
    }
}