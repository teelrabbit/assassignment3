/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: PalindromeChecker.java
 * Author: Frank M. Carrano
 * Author: Timothy M. Henry
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment03PartB;

import java.util.Scanner;

//
// - Do not change the "main" method.
// - Please ADD CODE to complete implementing the program
//
public class PalindromeChecker {
    private static boolean isPalindrome(String string) {
        OurStack stack = new OurStack();
        String[] arr = string.split("",string.length());
        String[] filter = new String[0];
        for (int i = 0; i < string.length(); i++) {
           if (arr[i].matches("[a-zA-Z]") != true) {
                System.out.println(arr[i]);
                stack.push(arr[i].toLowerCase());
            }

        }

       for (int i = 0; i < arr.length; i++) {


           if (stack.isEmpty() == true) {
               return false;
           }
           String tmp = stack.pop().toString();
           if(tmp == null) {
                return false;
           }
           if (arr[i].compareToIgnoreCase(tmp) <0) {
               return false;
           }
       }
       return true;
    } 

    //
    // - Do not change the "main" method.
    // - Please ADD CODE to complete implementing the program
    //
    public static void main(String[] args) {
        //
        // - Do not change the "main" method.
        // - Please ADD CODE to complete implementing the program
        //
        Scanner input = new Scanner(System.in);
        System.out.print("[>>] Enter a string (or a ! to exit): ");
        String string = input.nextLine();

        while (!string.equals("!")) {
            if (isPalindrome(string)) {
                System.out.println(" [+] Yes. \"" + string + "\" IS a palindrome!");
            } else {
                System.out.println(" [-] No. \"" + string + "\" is NOT a palindrome!");
            }
            System.out.print("[>>] Enter a string: ");
            string = input.nextLine();
        }

        System.out.println("[<<] Thank you!");
        //
        // - Do not change the "main" method.
        // - Please ADD CODE to complete implementing the program
        //
    }
}