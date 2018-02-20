package khasang.level0.level0.homework.bookrep;

import java.util.*;

public class BookManager {
    private Map<Integer, Book> map = new LinkedHashMap<Integer, Book>();
    private Scanner scanner;

    void showMenu() {
        System.out.println("\n" + "Выберите следующие действия: \n" +
                "а) добавить новую книгу(нажмите 1) \n" +
                "б) посмотреть все книги (нажмите 2) \n" +
                "в) посмотреть инфо по существующей(нажмите 3) \n" +
                "д) удалить книгу (нажмите 4) \n" +
                "е) сортировать по автору книг (нажмите 5) \n" +
                "ж) выйти из программы(нажмите 6) \n");
    }

    void select() {
        scanner = new Scanner(System.in);
        boolean finish = true;

        while (finish) {
            String userInput = scanner.nextLine();
            switch (userInput) {
                case "1":
                    System.out.println("Введите автора и название книги через Enter:");
                    addBook(new Book(scanner.nextLine(), scanner.nextLine()));
                    break;
                case "2":
                    showBooks();
                    break;
                case "3":
                    System.out.println("Введите индекс книги:");
                    int index = scanner.nextInt();
                    searchBook(index);
                    break;
                case "4":
                    System.out.println("Введите индекс книги, которую хотите удалить:");
                    index = scanner.nextInt();
                    deleteBook(index);
                    break;
                case "5":
                    sortByValue(map);
                    break;
                case "6":
                    finish = false;
            }
            showMenu();
        }
    }

    void addBook(Book book) {
        map.put(book.getIndex(), book);
    }

    void showBooks() {
        for (Map.Entry<Integer, Book> entry : map.entrySet()) {
            System.out.println("Id " + entry.getKey() + "" + entry.getValue());
        }
        System.out.println();
    }

    void searchBook(int index) {
        System.out.println("Id" + map.get(index).getIndex() + ". " + map.get(index));
    }

    void deleteBook(int index) {
        if (!map.containsKey(index)) {
            System.out.println("Нет такой книги, попробуйте ещё раз");
        } else {
            System.out.println("Была удалена книга: " + map.get(index));
            map.remove(index);
        }
    }

    void sortByValue(Map<Integer, Book> map) {
        List<Book> list = new ArrayList<>(map.values());
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
        for (Book book : list) {
            System.out.println("Id " + book.getIndex() + ". Автор: " + book.getAuthor() + ". " + book.getNameOfBook());
        }
    }
}
