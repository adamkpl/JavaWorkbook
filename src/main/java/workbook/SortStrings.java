package workbook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SortStrings {
    public static void main(String[] args) throws IOException {
        SortInput sortInput = new SortInput();

    }

    private static BufferedReader readFile(String filePath) {
        BufferedReader file = null;

        try {
            // Define the source of strings that will go into a List
            // todo This will fail to find the file on Linux. Address this issue
            String currentRelativePath = Paths.get(filePath).toAbsolutePath().toString();
            file = new BufferedReader(new FileReader(currentRelativePath));

/*
            // Define input data type
            String input;
            // Define a collection type. It's going to be a dynamic List of strings from file
            List<String> list = new ArrayList<>();

            // Add every single line from file to our dynamic List of strings from file
            while((input = file.readLine()) != null) {
                list.add(input);
            }
            // Print the entire list
            for (String s : list) {
                System.out.println(s);
            }
*/
            // Handle an exception
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(filePath);
        System.out.println(file);

        return file;
    }

    private static void printContents(BufferedReader file) {
        try {
            // Define input data type
            String input;
            // Define a collection type. It's going to be a dynamic List of strings from file
            List<String> list = new ArrayList<>();

            // Add every single line from file to our dynamic List of strings from file
            while((input = file.readLine()) != null) {
                list.add(input);
            }
            // Print the entire list
            for (String s : list) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}