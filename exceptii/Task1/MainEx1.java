package org.example.lab4.Task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainEx1 {
    private static void readAndPrintLine() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            System.out.println("Your text: "+line);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        readAndPrintLine();
    }
}
