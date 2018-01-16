package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        List<Integer> uniqueNums = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Please enter 10 number to fill array (each with <Enter>):");
            numbers[i] = scanner.nextInt();

            if (!uniqueNums.contains(numbers[i])) {
                uniqueNums.add(numbers[i]);
            }
        }
        System.out.println("The number of unique elements is " + uniqueNums.size());
    }
}
