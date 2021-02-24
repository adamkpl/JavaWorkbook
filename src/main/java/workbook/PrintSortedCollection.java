package workbook;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintSortedCollection {
    public static void main(String[] args) throws IOException {

        String path = "src\\main\\java\\Workbook\\names.txt";
        Scanner input = readFile(path);
        //printFile(input);
        List<String> names = addStringsToCollectionFromFile(input);
        //printList(names);
        printSortedList(names);

    }

    private static Scanner readFile(String path) throws IOException {
        return new Scanner(Paths.get(path));
    }

    private static void printFile(Scanner input) {
        if (input.hasNext()) {
            while (input.hasNext()) {
                System.out.println(input.nextLine());
            }
        } else {
            System.out.println("No content to display!");
        }
    }

    private static List<String> addStringsToCollectionFromFile(Scanner input) {

        List<String> listWithNames = new LinkedList<>();

        if (input.hasNext()) {
            while (input.hasNext()) {
                listWithNames.add(input.nextLine());
            }
        } else {
            System.out.println("No content.");
        }

        return listWithNames;
    }

    // https://www.javatpoint.com/how-to-sort-a-list-in-java

    private static void printList(List<String> input) {
        input.forEach(System.out::println);
    }

    private static void printSortedList(List<String> input) {
        List<String> sortedList = input.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }

}
