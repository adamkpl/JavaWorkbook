/* Java. Podstawy. Wydanie X – Cay S. Horstmann"
 * JAVA API: https://docs.oracle.com/javase/8/docs/api/ */

/**
 * Reading & Writing contents into files
 * @version 1.0 2019-08-01
 * @author Adam K.
 */

/*1. Ask user for an input.
 * 2. Save it into a .txt file.
 * 3. Read it.*/

package com.horstmann;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {

        //Ask user for input
        System.out.println("Hi! What is your name?");
        Scanner readInput = new Scanner(System.in);
        String userInput = readInput.nextLine();

        if(userInput.isEmpty()) {
            System.out.println("No input.");
        } else {
            System.out.println("User's input: " + userInput + ". " + "Saving it into a file.");
        }

        // 3.7.3. Zapis i odczyt plików
        //Save user's input into a .txt file.
        String userOutput = userInput;
        //PrintWriter saveOutput = new PrintWriter("..\\out.txt"); //If file does not exist, it should be created and saved in your IDE's folder e.g \\Users\\username\\IdeaProjects
        PrintWriter saveOutput = new PrintWriter("src\\main\\java\\com\\horstmann\\out.txt");
        saveOutput.print(userOutput);
        saveOutput.close();

        //Read contents from a local file
        //Scanner localTextfile = new Scanner(Paths.get("..\\out.txt"));
        Scanner localTextfile = new Scanner(Paths.get("src\\main\\java\\com\\horstmann\\out.txt"));

        if (localTextfile.hasNext()) {
            while (localTextfile.hasNext()) {
                System.out.println("File's content: " + localTextfile.nextLine());
            }
        } else {
            System.out.println("No content to display.");
        }
    }

}