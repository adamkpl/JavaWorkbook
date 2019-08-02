/* Java. Podstawy. Wydanie X – Cay S. Horstmann"
 * JAVA API: https://docs.oracle.com/javase/8/docs/api/ */

/**
 * Reading & Writing contents into files
 * @version 1.1 2019-08-02
 * @author Adam K.
 */

/* 1. Ask user for an input until a single character is given.
 * 2. Save output into a .txt file.
 * 3. Read it. */

package com.horstmann;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {

        //Ask user for input
        Scanner readInput = new Scanner(System.in);
        System.out.println("Type anything: ");
        String userInput = readInput.nextLine();

        //3.8.3. Pętle
        do
        {
            if (userInput.length() == 0)
            {
                System.out.println("No input. Try again. " + "User input length: " + userInput.length());
                userInput = readInput.nextLine();
            }
        }
        while (userInput.length() == 0);
        {
            // no instructions here as intended.
        }

        // 3.7.3. Zapis i odczyt plików
        //Save user's input into a .txt file.
        String userOutput = userInput;
        //PrintWriter saveOutput = new PrintWriter("..\\out.txt"); //If file does not exist, it should be created and saved in your IDE's folder e.g \\Users\\username\\IdeaProjects
        PrintWriter saveOutput = new PrintWriter("src\\main\\java\\com\\horstmann\\out.txt");
        saveOutput.print(userOutput);
        saveOutput.close();

        System.out.println("User's input: " + userInput + ". ");
        System.out.println("User input length: " + userInput.length());
        System.out.println("Saving results into an output file.");

        //Read contents from a local file
        //Scanner localTextfile = new Scanner(Paths.get("..\\out.txt"));
        Scanner localTextfile = new Scanner(Paths.get("src\\main\\java\\com\\horstmann\\out.txt"));

        if (localTextfile.hasNext())
        {
            while (localTextfile.hasNext())
            {
                System.out.println("Output file content: " + localTextfile.nextLine());
            }
        }
        else
        {
            System.out.println("No content to display!");
        }

    }

}