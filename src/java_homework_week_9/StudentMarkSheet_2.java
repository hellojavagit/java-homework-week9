package java_homework_week_9;
//program to print student mark sheet
import java.util.Scanner;

public class StudentMarkSheet_2 {
    int rollno, englishMarks, mathsMarks, scienceMarks;
    String sname, grade, result;
    float perc, total;

    public static void main(String[] args) {
        StudentMarkSheet_2 ms = new StudentMarkSheet_2();
        ms.studentDetails();//calling details of student and marks
    }
    public void studentDetails() {
        boolean b = true;
        Scanner sc = new Scanner(System.in);

           while ( b) {
            System.out.println("Enter student name :");
            sname = sc.nextLine();
            System.out.println("Enter roll no ");
            rollno = sc.nextInt();
            System.out.println("enter marks in 3 subjects");
            englishMarks = sc.nextInt();
            scienceMarks = sc.nextInt();
            mathsMarks = sc.nextInt();
              calculation();
              grades();
              display();
              break;
            }
    }
        public void calculation() {
        total = (englishMarks + scienceMarks + mathsMarks);
        perc = (total * 100) / 300;
        if (perc >= 35)
            result = "pass";
        else
            result = "fail";
    }

    public void grades()// method to calculate grades using if else
    {
        if (perc >= 80)
            grade = "A+";
        else if (perc >= 60)
            grade = "A";
        else if (perc >= 50)
            grade = "B";
        else if (perc >= 35)
            grade = "C";
    }

    public void display() {
        System.out.println("-----------------------------------|");
        System.out.println("|         MARKS SHEET              |");
        System.out.println("|----------------------------------|");
        System.out.println("|   NAME           :     " + sname + "       |");
        System.out.println("|  Rollno          :     " + rollno + "      |");
        System.out.println("|------------------------------------|");
        System.out.println("|   Subjects    :      Marks          |");
        System.out.println("|--------------------------------------|");
        System.out.println("|   English     :      " + englishMarks + "       |");
        System.out.println("|   Science     :      " + scienceMarks + "      |");
        System.out.println("|   Maths       :      " + englishMarks + "     |");
        System.out.println("|------------------------------------------------|");
        System.out.println("|   Total        :       " + total + "     |");
        System.out.println("|-------------------------------------------------|");
        System.out.println("|    Percentage  :  " + perc + "       " + "|");
        System.out.println("|    Result      :   " + result + "               " + "|");
        System.out.println("|    Grade       :    " + grade + "               " + "|");
        System.out.println("|--------------------------------------------|");
    }

}



