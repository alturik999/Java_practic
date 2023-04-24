package H_W_6.HW5;

//Task 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Collections;

public class task_1 {
    static Map<String, ArrayList<String>> phoneBook = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        chooseOperation();
        for (Map.Entry<String, ArrayList<String>> contact : phoneBook.entrySet()) {
            System.out.printf("%s, %s\n", contact.getKey(), contact.getValue());
        }
    }
    private static void chooseOperation() {
        System.out.println("""
                Выберите действие:
                1 - создать контакт
                2 - обновить контакт
                3 - завершить работу""");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1" -> createNewContact();
            case "2" -> editContact();
            case "3" -> System.out.println("Работа завершена!");
        }
    }
    private static void createNewContact() {
        System.out.print("Введите ФИО: ");
        String name = scanner.nextLine();
        if (phoneBook.containsKey(name)) {
            System.out.println("\n Такой контакт уже есть");
        } else {
            ArrayList<String> number = new ArrayList<>();
            System.out.print("Введите новый номер или q для возврата в меню: ");
            String input = scanner.nextLine();
            while (!input.equals("q")) {
                number.add(input);
                input = scanner.nextLine();
            }
            phoneBook.put(name, number);
        }
        chooseOperation();
    }
    private static void editContact() {
        System.out.print("Введите контакт: ");
        String name = scanner.nextLine();
        if (!phoneBook.containsKey(name)) {
            System.out.println("\nТакого контакта нет");
            chooseOperation();
        } else {
            System.out.print("Введите новый номер или q для возврата в меню: ");
            String number = scanner.nextLine();
            while (!number.equals("q")) {
                phoneBook.get(name).add(number);
                number = scanner.nextLine();
            }
            chooseOperation();
        }
    }
}
