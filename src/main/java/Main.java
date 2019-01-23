

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> listNumbers = enterInterval();
        printEvenNumber(listNumbers);
        printOddNumber(listNumbers);
        printSumEvenNumber(listNumbers);
        printSumOddNumber(listNumbers);
        LinkedList listFibonacci = createListFibonacci(listNumbers);
        printListFibonacci(listFibonacci);


    }

    public static LinkedList<Integer> enterInterval() {
        System.out.println("Enter first number:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Enter last number");
        int lastNumber = scanner.nextInt();
        LinkedList<Integer> interval = new LinkedList<Integer>();
        for (int i = firstNumber; i <= lastNumber; i++) {
            interval.add(i);
        }
        System.out.println(interval);
        return interval;
    }

    public static void printOddNumber(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if ((number % 2) == 1) {
                System.out.print(number + ", ");
            }
        }

    }

    public static void printEvenNumber(List<Integer> list) {

        ListIterator<Integer> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            int number = iterator.previous();
            if (number % 2 == 0) {
                System.out.print(number + ", ");

            }
            System.out.println();
        }
    }

    public static void printSumOddNumber(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        int sumNumber = 0;
        while (iterator.hasNext()) {
            int number = iterator.next();
            if ((number % 2) == 1) {

                sumNumber = sumNumber+ number;
            }

        }
        System.out.println("sum odd number =" + sumNumber);

    }

    public static void printSumEvenNumber(List<Integer> list) {

        Iterator<Integer> iterator = list.iterator();
        int sumNumber = 0;
        while (iterator.hasNext()) {
            int number = iterator.next();
            if ((number % 2) == 0) {

                sumNumber = sumNumber+ number;
            }

        }
        System.out.println("sum even number =" + sumNumber);

    }


    public static LinkedList createListFibonacci(LinkedList<Integer> list) {
        System.out.println("Enter the size of set:");
        System.out.println("Enter first number:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ListIterator<Integer> iterator = list.listIterator(list.size());
        LinkedList<Integer> listFibonacci = new LinkedList<Integer>();
        int f1 = 0;
        int f2 = iterator.previous();
        if (f2 % 2 == 1) {
            f1 = f2;
        } else {
            f1 = iterator.previous();
        }
        listFibonacci.add(f1);
        listFibonacci.add(f2);
        for (int i = 2; i <= size; i++) {
            int newNumber = listFibonacci.get(listFibonacci.size() - 2) + listFibonacci.getLast();

            listFibonacci.add(newNumber);


        }
        return listFibonacci;
    }
    public static void printListFibonacci(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {

            System.out.print(iterator.next() + ", ");

            }

        }

    }




