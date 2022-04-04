package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {

        char ch = 'Y';
        Scanner sc = new Scanner(System.in);
        while (ch == 'Y' || ch == 'y') {
            System.out.println("Enter First Number");
            int num1 = sc.nextInt();
            System.out.println("Enter Second Number");
            int num2 = sc.nextInt();
            System.out.println("Please Enter One of Symbols  '+', '-', '/', '*') : ");
            char sym = sc.next().charAt(0);
            Calculator ca = new Calculator();
            ca.calculateResult(num1, num2, sym);
            System.out.println("Do You Want to continue");
            ch = sc.next().charAt(0);
        }
    }
}
