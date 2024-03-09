/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package takingUserInputCode;
import java.util.Scanner;

/**
 *
 * @author king-maverickk
 */
public class takingUserInputCode {

    public static void main(String[] args) {
        // Declare variables
        String studentName;
        double testOne;
        double examMark;
        Scanner input = new Scanner(System.in);
        
        // Dynamic assignment of values
        System.out.println("STUDENT NAME: ");
        studentName = input.nextLine();

        System.out.println("TEST 1 RESULTS: ");
        testOne = input.nextDouble();

        System.out.println("EXAM RESULTS: ");
        examMark = input.nextDouble();
        
        // Average calculation
        double average = (testOne + examMark) / 2;

        // Outputs here         
        System.out.println("====== TEST RESULTS for ======");
        System.out.println("Student Name: " + studentName);
        System.out.println("Test 1 Mark: " + testOne);
        System.out.println("Exam Mark: " + examMark);
        System.out.println("==================================");
        System.out.println("Average mark: " + average);
        System.out.println("==================================");

        // remember to close Scanner object!
        input.close();
    }
}