package io.github.donniecodesit;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        Helper helper = new Helper(scanner, manager);
        boolean shouldExit = false;

        do {
            printMenu();
            char select = scanner.next().charAt(0);
            try {
                switch (select) {
                    case '1' -> helper.getStudent();
                    case '2' -> helper.addStudent();
                    case '3' -> helper.removeStudent();
                    case '4' -> helper.updateStudent();
                    case '5' -> helper.listStudents();
                    case '6' -> shouldExit = true;
                    default -> System.out.println("Select an option.");
                }
            } catch(InputMismatchException e) {
                System.out.println("Input type was incorrect.");
                scanner.nextLine();
            } catch(IllegalArgumentException e) {
                System.out.println("UUID invalid.");
                scanner.nextLine();
            } catch(NullPointerException e) {
                System.out.println("Student does not exist.");
                scanner.nextLine();
            } catch(NoSuchElementException e) {
                System.out.println("No data found.");
                scanner.nextLine();
            } catch(Exception e) {
                System.out.println("Unknown Error");
                e.printStackTrace();
                scanner.nextLine();
            }
        } while (!shouldExit);
        System.out.println("Signing off...");
    }

    public static void printMenu() {
        System.out.println("(1) Get A Student");
        System.out.println("(2) Add A Student");
        System.out.println("(3) Remove A Student");
        System.out.println("(4) Update A Student");
        System.out.println("(5) List All Students");
        System.out.println("(6) Quit");
        System.out.print("Select: ");
    }
}
