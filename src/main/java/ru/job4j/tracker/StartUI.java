package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                /*            } else if (...) { */
                /*             Добавить остальные действия системы по меню. */
            }
            if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]);
                }
            }
            if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.println("=== Enter ID ===");
                int id = scanner.nextInt();
                System.out.println("=== Enter name ===");
                Item changename = new Item();
                tracker.replace(id, changename);
                if (tracker.replace(id, changename)) {
                    System.out.println("Успешно");
                } else {
                    System.out.println("Ошибка");
                }
            }
            if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.println("=== Enter ID ===");
                int id = scanner.nextInt();
                tracker.delete(id);
                if (tracker.delete(id)) {
                    System.out.println("Успешно");
                } else {
                    System.out.println("Ошибка");
                }
            }
            if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.println("=== Enter ID ===");
                int id = scanner.nextInt();
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Заявка с таким id не найдена");
                }
            }
            if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.println("=== Enter Name ===");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (int i = 0; i < items.length; i++) {
                        System.out.println(items[i]);
                    }
                } else {
                    System.out.println("Заявки с таким именем не найдены");
                }

            } else if (select == 6) {
                run = false;
            }

        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        /* добавить остальные пункты меню. */
        System.out.println("0. Add new Item\n"
                + "1. Show all items\n"
                + "2. Edit item\n"
                + "3. Delete item\n"
                + "4. Find item by Id\n"
                + "5. Find items by name\n"
                + "6. Exit Program");
    }

}



