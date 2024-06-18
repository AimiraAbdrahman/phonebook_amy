import java.util.*;

public class Phonebook {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();

        addContact(phoneBook, "Иванов", "1234567890");
        addContact(phoneBook, "Петров", "9876543210");
        addContact(phoneBook, "Сидоров", "5555555555");
        addContact(phoneBook, "Иванов", "9998887777");

        phoneBook.entrySet().stream()
                .sorted((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    public static void addContact(Map<String, List<String>> phoneBook, String name, String phoneNumber) {
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }
}

