package khasang.level0.level0.homework.polymorphism;

import java.util.*;

public class Manager {
    private Map<Integer, Thing> map = new LinkedHashMap<>();
    private Scanner scanner;

    void showMenu() {
        System.out.println("\n" + "Выберите следующие действия: \n" +
                "а) добавить новую вещь(нажмите 1) \n" +
                "б) посмотреть все вещи (нажмите 2) \n" +
                "в) посмотреть инфо по существующей(нажмите 3) \n" +
                "д) удалить вещь (нажмите 4) \n" +
                "е) сортировать по автору, производителю (нажмите 5) \n" +
                "ж) удалить ВСЕ ВЕЩИ (нажмите 6) \n" +
                "з) выйти из программы(нажмите 7) \n");
    }

    void select() throws InterruptedException {
        scanner = new Scanner(System.in);
        boolean finish = true;

        while (finish) {
            String userInput = scanner.nextLine();
            int indexOfThing;
            switch (userInput) {
                case "1":
//                    System.out.println("Введите автора, название книги и ISBN через Enter:");
//                    addThing(new Thing(scanner.nextLine(), scanner.nextLine()));
                    addThing();
                    break;
                case "2":
                    showBooks();
                    break;
                case "3":
                    System.out.println("Введите индекс вещи:");
                    indexOfThing = scanner.nextInt();
                    searchThing(indexOfThing);
                    break;
                case "4":
                    System.out.println("Введите индекс вещи, которую хотите удалить:");
                    indexOfThing = scanner.nextInt();
                    deleteThing(indexOfThing);
                    break;
                case "5":
                    sortByValue(map);
                    break;
                case "6":
                    deleteAllThing(map);
                    break;
                case "7":
                    finish = false;
            }
            showMenu();
        }
    }

    void addThing() {
        System.out.println("Для того, чтобы добавить:" +
                "Книгу(нажмите 1)\n" +
                "Одежду(нажмите 2)\n" +
                "Магнитик(нажмите 3\n)"
        );
    }

    void addThing(Thing thing) {
        //System.out.println("");
        map.put(thing.getId(), thing);
    }

    void showBooks() throws InterruptedException {
        for (Map.Entry<Integer, Thing> entry : map.entrySet()) {
            System.out.println("Id " + entry.getKey() + "" + entry.getValue());
        }
        System.out.println();
        Thread.sleep(2000);
    }

    void searchThing(int index) throws InterruptedException {
        System.out.println("Id" + map.get(index).getId() + ". " + map.get(index));
        Thread.sleep(2000);
    }

    void deleteThing(int index) {
        if (!map.containsKey(index)) {
            System.out.println("Нет такой книги, попробуйте ещё раз");
        } else {
            System.out.println("Была удалена книга: " + map.get(index));
            map.remove(index);
        }
    }

    private void deleteAllThing(Map<Integer, Thing> map) {
        map.clear();
    }

    void sortByValue(Map<Integer, Thing> map) {
        List<Thing> list = new ArrayList<>(map.values());
        Collections.sort(list, (o1, o2) -> o1.getProducer().compareTo(o2.getProducer()));
        for (Thing book : list) {
            System.out.println(book);
        }
    }
}
