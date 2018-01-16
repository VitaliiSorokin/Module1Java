package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your role: ");

        while (true) {
            printMainMenu();
            switch (scanner.nextInt()) {
                case 1:
                    printStudentMenu();
                    break;
                case 2:
                    printTeacherMenu();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
            }
        }


    }

    private static void studentMenu() {
        System.out.println("--------------------");
        printStudentMenu();
    }

    private static void printMainMenu() {
        System.out.println("Select your role: ");
        System.out.println("1 - Student");
        System.out.println("2 - Teacher");
    }

    private static void printStudentMenu() {
        System.out.println("Choose your faculty: ");
        System.out.println("1 - First");
        System.out.println("2 - Second");
        System.out.println("3 - Third");
    }

    private static void printTeacherMenu() {
        System.out.println("Select your role: ");
        System.out.println("1 - Student");
        System.out.println("2 - Teacher");
        System.out.println("3 - EXIT");
    }

}
