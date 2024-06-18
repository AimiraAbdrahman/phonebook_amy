// public class App {
//     public static void main(String[] args) throws Exception {
//         int a = 123;
//         // a = --a;
//         int b = a--;
//         int c = --a;
//         int d = b-c;
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//         System.out.println(d);
//     }
// }

// Задана натуральная степень k. Сформировать случайным образом список
// коэффициентов (значения от 0 до 100) многочлена степени k.
// *Пример: k = 2 => 2*x^2 + 4*x + 5 = 0 или x^2 + 5 = 0 или 10*x^2 = 0

// public class App {
//     public static void main(String[] args) throws Exception {
//         int k = 2;
//         int[] arr = new int[k+1];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = (int) (Math.random() * 100);
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + "*x^" + (arr.length - i - 1) + " + ");
//         }
//         System.out.println("0");
//     }
// }

// Даны два файла, в каждом из которых находится запись многочлена. 
// Сформировать файл содержащий сумму многочленов.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.System.Logger.Level;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// public class App {
//     public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        System.out.println("Hello, " + name + "!");
//     }
// }

// В консоли запросить имя пользователя. В зависимости от
// текущего времени, вывести приветствие вида
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

// public class App {
//     public static void main(String[] args) throws Exception {
       
//        while (true) {
//         live();
//        }
// }
// /**
//  * 
//  */
// public static void live() {
//           System.out.println("Сколько вам лет?");
//        Scanner scanner = new Scanner(System.in);
//        int age;
//        try{
//         age = scanner.nextInt();
//         if(age < 10) {
//             System.out.println("Вы еще молоды");
//            }
//            else if (age > 18) {
//             System.out.println("Вы взрослый");
//            }
//             else {
//                 System.out.println("Вы очень старый");
//             }  
//        }
//        catch(InputMismatchException e) {
//         System.out.println("Вы ввели не число");
//        }
//         }
// }

// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

// public class App {
//     public static void main(String[] args) throws Exception {
       
//     int[] arr = {1, 4, 5, 4, 7, 8};
//     // int[] arr1 = new int[]{1, 4, 5, 4, 7, 8};
//     // int[] arr2 = new int[5];
//     int sum = 0;
//     for (int i = 0; i < arr.length; i++) {
//         sum += arr[i];
// }
// System.out.println(sum);
//         }
//     }

// ###########################################################

// Во фразе "Добро пожаловать на курс по Java" переставить слова
// в обратном порядке.

// public class App {
//     public static void main(String[] args) throws Exception {
//        String str = "Добро пожаловать на курс по Java";
//        String[] arr = str.split(" ");
//        String result = "";
//     //    StringBuilder sb = new StringBuilder();
//        for (int i = arr.length - 1; i >= 0; i--) {
//            result += arr[i] + " ";
//         //    String temp = arr[i]; 
//         //    sb.append(temp).append(" ");
//        }
//        System.out.println(result);
//     //    System.out.println(sb);
//         }
//     }


// ##############################################################
// Homework Seminar 1 java
    // Внутри класса Answer напишите метод countNTriangle, который принимает число n и 
    // возвращает его n-ое треугольное число. Если число n < 1 (ненатуральное) метод должен 
    // вернуть -1.

    // public class App {
    //     public static void main(String[] args) throws Exception {
    //        int n = 0;
    //        if (n >= 1){
    //         // int sum = (n*(n+1))/2;
    //         System.out.println((n*(n+1))/2);
    //       }
    //             else if (n < 1) {
    //               System.out.println(-1);
    //             } 
    //         }
    //     }
     
// Напишите функцию printPrimeNums, которая выведет на экран все простые числа в 
// промежутке от 1 до 1000, каждое на новой строке.

// public class App {

//     public static void printPrimeNums() {
//         for (int i = 2; i <= 1000; i++) {
//             if (isPrime(i)) {
//                 System.out.println(i);
//             }
//         }
//     }

//     private static boolean isPrime(int num) {
//         if (num <= 1) {
//             return false;
//         }
//         for (int i = 2; i <= Math.sqrt(num); i++) {
//             if (num % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         printPrimeNums();
//     }
// }

// Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, 
// оно должно записаться в лог-файл.

// public class App {
// /**
//  * @param args
//  */

// private static Logger LOGGER = Log.log(App.class.getName());  
// public static void main(String[] args) {
//     LOGGER.log(Level.INFO, "Приложение стартовало");

//     String out = "/Users/amy/Desktop/Graphic_Design";
// // Применяем наш метод конвертируя названия в строку

//     System.out.println(Arrays.toString(readFileName("/Users/amy/Desktop/Graphic_Design")));

// // Применяем метод для записывания строки в файл

// writeFilesNamesinFile("task1.txt", out);
// }
// // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
// // Создаем метод для считывания файла

// /**
//  * @param path
//  * @return
//  */
// public static String[] readFileName(String path) {
//     File file  = new File(path);
//         if (file.isDirectory()) {
//             File[] arrFiles = file.listFiles();
//             String[] names = new String[arrFiles.length];
//             for (int i = 0; i < names.length; i++) {
//                 names[i] = arrFiles[i].getName();
//             }
//             return names;
//         }
//         else {
//             throw new RuntimeException("Файл не является папкой");
// }
// }
// // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
// // Создаем метод, записывающий полученный массив в файл
// /**
//  * @param in
//  * @param out
//  */
// private static void writeFilesNamesinFile(String in, String out) {
//     FileWriter fw = null;
//     try {
//         fw = new FileWriter(in);
//         String [] arr = readFileName(out);
//         for (String s : arr) {
//             fw.write(s + "\n");
//         }
//     }
//     catch (IOException e) {
//         throw new RuntimeException(e);
//     } finally {
//         try {
//             fw.close();
//         }
//         catch (IOException e) {
//             throw new RuntimeException("Error closing file", e);
//         }
//     }
// }
// }

// Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
// String s1 = "hello"; сравнить s1 с остальными
// String s2 = "hello"; равны по значению и по ссылке
// String s3 = s1; равны по значению и по ссылке
// String s4 = "h" + "e" + "l" + "l" + "o"; равны по значению и по ссылке
// String s5 = new String("hello"); не равны по ссылке, но равны по значению
// String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'}); не равны по ссылке, но равны по значению

// ###########################################################
// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.

// /**
//  * App
//  */
// public class App {

//     public static void main(String[] args) {
//         List <Integer> intlist = new ArrayList<>();
//         Random random = new Random();
//         for (int i = 0; i < 10; i++) {
//             intlist.add(random.nextInt(0, 10));
//         }
//         System.err.println("intlist: " + intlist);
//         Collections.sort(intlist);
//         System.err.println("intlist: " + intlist);

//     }

// }

// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.

/**
 * App
 */
// public class App {

//     public static void main(String[] args) {
//         ArrayList strlist = new ArrayList<String>(); // создали список объектов
//         strlist.add("null");
//         strlist.add(1);
//         strlist.add("hello");
//         strlist.add(12);
//         for (int i = 0; i < strlist.size(); i++) {
//             if (strlist.get(i) instanceof Integer) {
//                 strlist.remove(strlist.get(i));
//             }
//         }
//         System.err.println(strlist);
//     }
// }

// Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, 
// что на 0-й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - 
// названия книг. Напишите метод для заполнения данной структуры.

/**
 * App
 */
// public class App {
//     static List<ArrayList<String>> books = new ArrayList<>();

//     public static void main(String[] args) {
//         ArrayList<String> proza = new ArrayList<String>(List.of("proza", "War and Peace", "Buratino"));
//         ArrayList<String> poem = new ArrayList<String>(List.of("Borodino", "Yevgeniy", "Onegin"));
//         ArrayList<String> skazki = new ArrayList<>();
//         skazki.add("skazki");
//         skazki.add("Red riding hood");
//         skazki.add("3 bears");
//         books.addAll(List.of(proza, poem, skazki));
//         System.out.println("books: " + books);
//     }
// }

// Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел, 
// реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.
// import java.util.Arrays;
// /**
//  * App
//  */
// public class App {

//     public static void main(String[] args) {
//         int[] myArray = {0, -1, 2, 33, 29};
//         mergeSort(myArray);
//         for (int i = 0; i < myArray.length; i++) {
//             System.out.println(myArray[i] + "");
//         }
//     }

//     private static void mergeSort(int[] arr) {
//         int n = arr.length;
//         if (n == 1) return;

//         int mid  = n / 2;
//         int[] l = new int[mid];
//         int[] r = new int[n - mid];
//         for (int i = 0; i < mid; i++) {
//             l[i] = arr[i];
//         }
//         for (int i = mid; i < n; i++) {
//             r[i-mid] = arr[i];
//         }

//         mergeSort(l);
//         mergeSort(r);
//         merge(arr, l, r);
// }

// private static void merge(int[] arr, int[] l, int[] r) {
//     int right = r.length;
//     int left = l.length;
//     int i = 0;
//     int j = 0;
//     int k = 0;

//     while (i < left && j < right) {
//         if (l[i] < r[j]) {
//             arr[k] = l[i];
//             i++;
//         } else {
//             arr[k] = r[j];
//             j++;
//         }
//         k++;
//     }
//     for (int ll = i; ll < left; ll++) {
//         arr[k++] = l[ll];
// }
// for (int rr = j; rr < right; rr++) {
//     arr[k++] = r[rr];
// }
// }
// }

// Реализуйте метод, который принимает на вход целочисленный массив arr:
// - Создаёт список ArrayList, заполненный числами из исходого массива arr.
// - Сортирует список по возрастанию и выводит на экран.
// - Находит минимальное значение в списке и выводит на экран - Minimum is {число}
// - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
// - Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}

/**
 * App
 */
// public class App {

//     public static void main(String[] args) {
//         Integer[] arr = {34, 6, 1, 23, 8};
//         analyzeNumbers(arr);
//     }

//     public static void analyzeNumbers(Integer[] arr) {
    
//         // List<Integer> intlist = Arrays.asList(arr);
//         Arrays.sort(arr); 
//         int count = 0;
//         int sum = 0;
//         int i = 0;
//         int max = arr[0];
//         int min = arr[0];
//         for (i = 0; i < arr.length; i++) {
//             count++;
//             sum += arr[i];
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//     }
//     System.out.println(Arrays.toString(arr));
//     System.out.println("Minimum is " + min);
//     System.out.println("Maximum is " + max);
//     double avg = (double) sum / count;
//     System.out.println("Average is " + avg);

//     // ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));
//     //     Collections.sort(nums); // сортировка списка по возрастанию
//     //     System.out.println(nums); // вывод списка на экран
//     //     System.out.println("Minimum is " + nums.get(0)); // нахождение минимального значения в списке и вывод на экран
//     //     System.out.println("Maximum is " + nums.get(nums.size()-1)); // нахождение максимального значения в списке и вывод на экран

//     //     int sum = 0;
//     //     for(int i : nums){ // вычисление суммы всех элементов списка
//     //         sum += i;
//     //     }
//     //     System.out.println("Average is = " + (double) sum / nums.size()); // вычисление среднего арифметического значений списка

// }
// }

// #################################################
// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
// Сравните с предыдущим

/**
 * App
 */
// public class App {
//     private static int LENGTH = 10000000;
//     public static void main(String[] args) {
//         getTime();
//     }

//     private static void getTime(){
// List<Integer> intArrayList = new ArrayList<>();
// List<Integer> intLinkedList = new LinkedList<>();

// long startTime = System.currentTimeMillis();

// for (int i = 0; i < LENGTH; i++){
//     intArrayList.add(i);
// }

// long endTime = System.currentTimeMillis();

// double result = (endTime - startTime);

// System.out.printf("Run time for ArrayList: %s %s %n", result, "ms");

// long startTime2 = System.currentTimeMillis();
// for (int i = 0; i < LENGTH; i++) {
//     intLinkedList.add(i);
// }

// long endTime2 = System.currentTimeMillis();

// double result2 = (endTime2 - startTime2);
// System.out.printf("Run time for LinkedList: %s %s %n", result2, "ms");

// // To compare that LinkedList takes a shorter time when putting values in the middle
// // int count = 0;

// // long startTime3 = System.currentTimeMillis();
// // Random rand = new Random();
// // while (count != 1000) {
// //     intArrayList.add(40000, rand.nextInt());
// //     count += 2;
// // }

// // long endTime3 = System.currentTimeMillis();
// // System.out.println(endTime3 - startTime3);  
//     }
// }

// Реализовать свою структуру данных
// Реализовать стэк с помощью массива.
// Нужно реализовать методы: size(), empty(), push(), peek(), pop(). 

// class Answer {  
//     public static StringBuilder answer(String QUERY, String PARAMS){
//         // Напишите свое решение ниже
// String prepare = PARAMS.replace("{","").replace("}", "").replace("\"", "");
// String name = prepare.split(",")[0].split(":")[1];                         
// String country = prepare.split(",")[1].split(":")[1];
// String city = prepare.split(",")[2].split(":")[1];
// String age = prepare.split(",")[3].split(":")[1];
// StringBuilder result = new StringBuilder(QUERY);
// if (!name.equals("null")) {
//   result.append("name=").append("'").append(name).append("'");
// }
// if (!name.equals("null")) {
//   result.append(" and ");
// }
// if (!country.equals("null")) {
//   result.append("country=").append("'").append(country).append("'");
// }
// if (!country.equals("null")) {
//   result.append(" and ");
// }
// if (!city.equals("null")) {
//   result.append("city=").append("'").append(city).append("'");
// }
// if (!city.equals("null")) {
//   result.append(" and ");
// }
// if (!age.equals("null")) {
//   result.append("age=").append("'").append(age).append("'");
// }
// return result;
//     }
// }


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
// public class Printer{ 
// 	public static void main(String[] args) { 
//       String QUERY = "";
//       String PARAMS = "";
      
//       if (args.length == 0) {
//         // При отправке кода на Выполнение, вы можете варьировать эти параметры
//         QUERY = "select * from students where ";
// 	    PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
//       }
//       else{
//         QUERY = args[0];
//         PARAMS = args[1];
//       }     
      
//       Answer ans = new Answer();      
//       System.out.println(ans.answer(QUERY, PARAMS));
// 	}
// }

// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.
// Напишите свой код в методе sort класса BubbleSort. 
// Метод sort принимает на вход один параметр:
// int[] arr - числовой массив
// После каждого прохода по массиву ваш код должен делать запись 
// в лог-файл 'log.txt' в формате год-месяц-день час:минуты 
// {массив на данной итерации}. 
// arr = new int[]{9, 4, 8, 3, 1};
// sort(arr)

// // При чтении лог-файла получим:
// 2023-05-19 07:53 [4, 8, 3, 1, 9]
// 2023-05-19 07:53 [4, 3, 1, 8, 9]
// 2023-05-19 07:53 [3, 1, 4, 8, 9]
// 2023-05-19 07:53 [1, 3, 4, 8, 9]
// 2023-05-19 07:53 [1, 3, 4, 8, 9]

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

// class BubbleSort {
//     private static File log;
//     private static FileWriter fileWriter;

//     public static void sort(int[] mas) {
//         try {
//             log = new File("log.txt");
//             log.createNewFile();
//             fileWriter = new FileWriter(log);
//             bubbleSort(mas);

//         } catch (IOException e) {
//             e.printStackTrace();
//         } finally {
//             try {
//                 fileWriter.close();
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//         }
//     }

//     private static int[] bubbleSort(int[] mas) {
//         boolean isSorted = false;
//         int buffer;

//         while (!isSorted) {
//             isSorted = true;
//             for (int i = 0; i < mas.length - 1; i++) {
//                 if (mas[i] > mas[i + 1]) {
//                     isSorted = false;

//                     buffer = mas[i];
//                     mas[i] = mas[i + 1];
//                     mas[i + 1] = buffer;
//                 }
//             }
//             logStep(Arrays.toString(mas));
//         }
//         return mas;
//     }

//     public static void logStep(String note){
//       try {
//           SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//           String timestamp = dateFormat.format(new Date());
//           fileWriter.write(timestamp + " " + note + "\n");
//       } catch (IOException e) {
//           e.printStackTrace();
//       }
//   }

// }

// public class Printer{ 
//     public static void main(String[] args) { 
//       int[] arr = {};

//       if (args.length == 0) {
//         arr = new int[]{9, 4, 8, 45, 1};
//       }
//       else{
//         arr = Arrays.stream(args[0].split(", "))
//                         .mapToInt(Integer::parseInt)
//                         .toArray();
//       }     

//       BubbleSort ans = new BubbleSort();      
//       ans.sort(arr);

//       try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
//             String line;
//             while ((line = br.readLine()) != null) {
//                 System.out.println(line);
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }


  // public static void main(String[] args) {
  //     int[] arr = new int[]{3, 2, 1};
  //     sort(arr);
  // }

  // public static void sort(int[] arr) {
  //     int n = arr.length;
  //     boolean swapped;
  //     do {
  //         swapped = false;
  //         for (int i = 1; i < n; i++) {
  //             if (arr[i - 1] > arr[i]) {
  //                 int temp = arr[i - 1];
  //                 arr[i - 1] = arr[i];
  //                 arr[i] = temp;
  //                 swapped = true;
  //             }
  //         }  } while (swapped);
  //         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
  //     LocalDateTime now = LocalDateTime.now();
  //     String logEntry = now.format(dtf) + " " + java.util.Arrays.toString(arr);
  //     try (PrintWriter writer = new PrintWriter(new FileWriter("log.txt", true))) {
  //         writer.println(logEntry);
  //     } catch (IOException e) {
  //         e.printStackTrace();
  //     }
  // }

  





