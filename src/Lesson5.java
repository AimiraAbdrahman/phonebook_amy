// Создать структуру для хранения Номеров паспортов и Фамилий
// сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

// public class Lesson5 {
//     public static void main(String[] args) {
//         Map<Integer, String> passNumToName = new HashMap<>();

//         passNumToName.put(123456, "Иванов");
//         passNumToName.put(321456, "Васильев");
//         passNumToName.put(234561, "Петрова");
//         passNumToName.put(234432, "Иванов");
//         passNumToName.put(654321, "Петрова");
//         passNumToName.put(345678, "Иванов");

//         // Map<Integer, String> map = Map.of(123456, "Иванов", 321456, "Васильев");
//         // map.remove(123456);
//         System.out.println(passNumToName);

//         // for (Map.Entry<Integer, String> entry : passNumToName.entrySet()) {
//         //     if (entry.getValue().equals("Иванов")) {
//         //         System.out.println(entry.getKey() + " " + entry.getValue());
//         //     }
//         // }

//         List<Map.Entry<Integer, String>> ivanovs = passNumToName.entrySet().stream().
//         filter(integerStringEntry -> integerStringEntry.getValue().equals("Иванов")).toList();
//         System.out.println(ivanovs);
//     }
// }

// Написать метод, который переведет число из римского формата записи в арабский.
// Например, MMXXII = 2022

/**
 * Lesson5
 */
// public class Lesson5 {

//     public static void main(String[] args) {
//         System.out.println(RomanToArabic("MMIV"));
//     }
    
//     static Map<String, Integer> map = new LinkedHashMap<>(Map.of(
//             "I", 1, 
//             "V", 5, 
//             "X", 10, 
//             "L", 50, 
//             "C", 100, 
//             "D", 500, 
//             "M", 1000
//         ));
//     public static int RomanToArabic(String str) {
//         List<Integer> arabic = new LinkedList<>();

//         String[] split = str.split("");
//         int res = 0;
//         for (String string : split) {
//             arabic.add(map.get(string));
//         }
//         for (int i = 0; i < arabic.size() - 1; i++) {
//             if (arabic.get(i) < arabic.get(i + 1)) {
//                 res -= arabic.get(i);
//             } else {
//                 res += arabic.get(i);
//             }
//         }
//         res += arabic.get(arabic.size() - 1);
//         return res;
//     }

//     // Alternative solution
//     private final String EXCEPTION = "String must contain only valid roman numerals [I, V, X, L, C, D, M].";

//     private boolean romanNumberIsValid(String input) {
//         return Pattern.matches("[IVXLCDM]+", input);
//     }

//     public int toArabic (String romanNotation) {
//         if (romanNotation == null) {
//             throw new RuntimeException(EXCEPTION);
//         }
//         int result = 0;
//         if (romanNumberIsValid(romanNotation)) {
//             result = map.get(Character.toString(romanNotation.charAt(0)));
//             List<Integer> symbols = romanNotation.chars().mapToObj(Character::toString).
//             map(map::get).collect(Collectors.toList());
//             for (int i = 0; i < symbols.size(); i++) {
//                 if (symbols.get(i) >= symbols.get(i+1)) {
//                     result += symbols.get(i+1);
//                 }
//                 if (symbols.get(i) < symbols.get(i+1)) {
//                     result += symbols.get(i+1) - symbols.get(i)*2;
//                 }
//             }
//             return result;
//         }
//         else {
//             throw new RuntimeException("Exception");
//         }
//     }
// }

// Вы работаете с приложением для учета имен пользователей. Ваша задача - разработать программу, 
// которая принимает на вход пять имен пользователей (или использует имена по умолчанию, если 
// аргументы не предоставлены) и подсчитывает, сколько раз каждое имя встречается.
// Программа должна использовать HashMap для хранения имен и их количества вхождений.
// По завершении, программа выводит результат в виде пар "имя - количество".
// На входе:
// 'Elena'
// 'Elena'
// 'Elena'
// 'Ivan'
// 'Ivan'
// На выходе:
// {Ivan=2, Elena=3}

// import java.util.HashMap;

// class NamesCounter {
//     private HashMap<String, Integer> names = new HashMap<>();

//     // Метод для добавления имени в HashMap
//     public void addName(String name) {
//         if (names.containsKey(name)) {
//             names.put(name, names.get(name) + 1);
//         } else {
//             names.put(name, 1);
//         }
//     }

//     // Метод для вывода содержимого HashMap
//     public void showNamesOccurrences() {
//         System.out.println(names);
//     }
// }

// public class Printer {
//     public static void main(String[] args) {
//         String name1;
//         String name2;
//         String name3;
//         String name4;
//         String name5;

//         if (args.length == 0) {
//             name1 = "Elena";
//             name2 = "Elena";
//             name3 = "Elena";
//             name4 = "Elena";
//             name5 = "Ivan";
//         } else {
//             name1 = args[0];
//             name2 = args[1];
//             name3 = args[2];
//             name4 = args[3];
//             name5 = args[4];
//         }      
//         NamesCounter namesCounter = new NamesCounter();

//         namesCounter.addName(name1);
//         namesCounter.addName(name2);
//         namesCounter.addName(name3);
//         namesCounter.addName(name4);

//         namesCounter.addName(name5);

//         namesCounter.showNamesOccurrences();
//     }
// }

// Напишите программу, представляющую телефонную книгу. Программа должна иметь следующие функции:
// add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
// Если запись с именем name уже существует, добавляет новый номер телефона в существующую запись.
// Если запись с именем name не существует, создает новую запись с этим именем и номером телефона phoneNum.
// find(String name): Поиск номеров телефона по имени в телефонной книге.
// Если запись с именем name существует, возвращает список номеров телефона для этой записи.
// Если запись с именем name не существует, возвращает пустой список.
// getPhoneBook(): Возвращает всю телефонную книгу в виде HashMap, где ключи - это имена, а значения - 
// списки номеров телефона.
// Пример.
// На входе:
// add("Alice", 123456);   
// add("Alice", 789012);   
// add("Bob", 789012);   
// На выходе:
// Команды:
// find("Alice")
// getPhoneBook()
// find("Me")
// Результат:
// [123456, 789012]. 
// {Bob=[789012], Alice=[123456, 789012]} 
// []

// import java.util.ArrayList;
// import java.util.HashMap;

// class PhoneBook {
//     private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

//     public void add(String name, Integer phoneNum) {
//         if (phoneBook.containsKey(name)) {
//             phoneBook.get(name).add(phoneNum);
//         } else {
//             ArrayList<Integer> values = new ArrayList<>();
//             values.add(phoneNum);
//             phoneBook.put(name, values);
//         }
//     }

//     public ArrayList<Integer> find(String name) {
//         if (phoneBook.containsKey(name)) {
//             return phoneBook.get(name);
//         }
//         return new ArrayList<Integer>();
//     }

//     public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
//         return phoneBook;
//     }
// }

// public class Printer {
//     public static void main(String[] args) {
//         String name1;
//         String name2;
//         int phone1;
//         int phone2;

//         if (args.length == 0) {
//             name1 = "Ivanov";
//             name2 = "Petrov";
//             phone1 = 123456;
//             phone2 = 654321;
//         } else {
//             name1 = args[0];
//             name2 = args[1];
//             phone1 = Integer.parseInt(args[2]);
//             phone2 = Integer.parseInt(args[3]);
//         }

//         PhoneBook myPhoneBook = new PhoneBook();
//         myPhoneBook.add(name1, phone1);
//         myPhoneBook.add(name1, phone2);
//         myPhoneBook.add(name2, phone2);

//         System.out.println(myPhoneBook.find(name1));
//         System.out.println(PhoneBook.getPhoneBook());
//         System.out.println(myPhoneBook.find("Me"));
//     }
// }

// Необходимо разработать программу для сортировки массива целых чисел с использованием сортировки 
// кучей (Heap Sort). Программа должна работать следующим образом: Принимать на вход массив целых 
// чисел для сортировки. Если массив не предоставлен, программа использует массив по умолчанию.
// Сначала выводить исходный массив на экран. Затем применять сортировку кучей (Heap Sort) для 
// сортировки элементов массива в порядке возрастания. Выводить отсортированный массив на экран.
// Ваше решение должно содержать два основных метода: buildTree, который строит сортирующее дерево 
// на основе массива, и heapSort, который выполняет собственно сортировку кучей.
// Программа должна быть способной сортировать массив, даже если он состоит из отрицательных чисел и имеет дубликаты.
// На входе:
// '5 8 12 3 6 9'
// На выходе:
// Initial array:
// [5, 8, 12, 3, 6, 9]
// Sorted array:
// [3, 5, 6, 8, 9, 12]

import java.util.Arrays;

class HeapSort {
    public static void buildTree(int[] tree, int sortLength) {
        // Для всех вершин дерева начиная с середины сортируемой части массива
        // (движемся влево до нулевого индекса)
        for (int i = sortLength / 2 - 1; i >= 0; i--) {
            int maxIndex;
            // Если у вершины два листа, выбираем больший
            if (i * 2 + 2 <= sortLength - 1) {
                if (tree[i * 2 + 2] > tree[i * 2 + 1]) maxIndex = i * 2 + 2;
                else maxIndex = i * 2 + 1;
            // Иначе один лист
            } else maxIndex = i * 2 + 1;
            // Сравниваем лист с максимальным значением с вершиной, при большем значении
            // дочернего элемента меняем его местами с вершиной
            if (tree[i] < tree[maxIndex]) {
                int temp = tree[i];
                tree[i] = tree[maxIndex];
                tree[maxIndex] = temp;
            }
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
        // Выход из рекурсии: длина сортируемой части равна 0
        if (sortLength == 0) return;
        // Выстраивание элементов части массива в виде сортирующего дерева
        buildTree(sortArray, sortLength);
        // Замена местами первого и последнего элемента в сортируемой части
        int temp = sortArray[0];
        sortArray[0] = sortArray[sortLength - 1];
        sortArray[sortLength - 1] = temp;
        // Рекурсивно построение дерева и замена элементов для n - 1 элементов массива
        heapSort(sortArray, sortLength - 1);
    }
}

public class Printer {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}


