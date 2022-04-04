package java_homework_week_9;

import java.util.Scanner;

//Write a Java program to reverse an array of integer values.
public class ReverseOfIntegerArray_3 {
    public static void main(String[] args) {
        acceptArray();

    }

    public static void acceptArray() {
        System.out.println("Enter the size of the Array: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        System.out.println("Enter " + num + " elements of the Array");
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("original array is:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "  ");
        System.out.println();

        System.out.println("Reverse of entered array is:");

        for (int j = array.length-1; j >= 0; j--)
            System.out.print(array[j] + "   ");


    }
}


