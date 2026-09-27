// ======================================================================
// CODE ATTRIBUTION LIST
// ======================================================================


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (DECLARING VARIABLES)
// TITLE: Java Programming, 9th Edition
// AUTHOR: Joyce Farrell
// DATE: Accessed 28 September 2026
// AVAILABLE: Cengage Learning
// DESCRIPTION: Textbook reference used for guidance on declaring and
// working with Java variables.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (ABSTRACT CLASSES)
// TITLE: Abstract Classes and Methods
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html
// DESCRIPTION: Reference used for guidance on abstract classes,
// abstract methods and class inheritance.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (LIVE PROGRAMMING LESSONS)
// TITLE: Live Lessons at Emeris Durban North
// AUTHOR: Denzyl Governder, Emeris Durban North
// DATE: 21 July 2026 - 27 September 2026
// AVAILABLE: https://www.emeris.ac.za/
// DESCRIPTION: Programming concepts, demonstrations and examples
// discussed during live PROG6112 lessons.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (LIVE PROGRAMMING LESSONS)
// TITLE: Live Lessons at Emeris Durban North
// AUTHOR: Jeyashree Krishnan
// DATE: 21 July 2026 - 27 September 2026
// AVAILABLE: https://www.emeris.ac.za/
// DESCRIPTION: Programming concepts and examples covered during
// PROG6112 live lessons.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (PROG6112 MOCK TEST 1)
// TITLE: PROG6112 Programming 1B - Mock Test 1
// AUTHOR: Denzyl Governder, Emeris Durban North
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://mystudies.iie.edu.za/d2l/le/lessons/86272/topics/7090080
// DESCRIPTION: Practice assessment used as a reference for Java
// programming concepts, problem-solving techniques and assessment-style
// requirements.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (PROG6112 MOCK TEST 2)
// TITLE: PROG6112 Programming 1B - Mock Test 2
// AUTHOR: Denzyl Governder, Emeris Durban North
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://mystudies.iie.edu.za/d2l/le/lessons/86272/topics/7090081
// DESCRIPTION: Practice assessment used as a reference for Java
// programming concepts, problem-solving techniques and assessment-style
// requirements.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (SCANNER AND USER INPUT)
// TITLE: Scanning and Formatting
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/essential/io/scanfor.html
// DESCRIPTION: Reference used for obtaining keyboard input using the
// Scanner class.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (SINGLE AND TWO-DIMENSIONAL ARRAYS)
// TITLE: Arrays
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
// DESCRIPTION: Reference used for declaring, populating and accessing
// single-dimensional and multidimensional arrays.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (FOR LOOPS)
// TITLE: The for Statement
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
// DESCRIPTION: Reference used for repeating operations and iterating
// through arrays using for loops.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (FORMATTED OUTPUT USING printf)
// TITLE: Formatting
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/essential/io/formatting.html
// DESCRIPTION: Reference used for formatted console output using
// printf(), format specifiers and column spacing.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (IF STATEMENTS AND COMPARISONS)
// TITLE: The if-then and if-then-else Statements
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
// DESCRIPTION: Reference used for conditional statements and comparing
// values when making decisions in the application.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (ARITHMETIC AND ASSIGNMENT OPERATORS)
// TITLE: Assignment, Arithmetic, and Unary Operators
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html
// DESCRIPTION: Reference used for calculations, addition, assignment
// and compound assignment operators such as +=.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (CREATING AND IMPLEMENTING INTERFACES)
// TITLE: Implementing an Interface
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/java/IandI/usinginterface.html
// DESCRIPTION: Reference used for creating Java interfaces and
// implementing interface methods in classes.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (INHERITANCE AND EXTENDING CLASSES)
// TITLE: Inheritance
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
// DESCRIPTION: Reference used for creating subclasses and extending
// parent or abstract classes.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (METHOD OVERRIDING AND @Override)
// TITLE: Overriding and Hiding Methods
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/java/IandI/override.html
// DESCRIPTION: Reference used for overriding inherited methods and
// applying the @Override annotation.
// ----------------------------------------------------------------------


// ----------------------------------------------------------------------
// CODE ATTRIBUTION (SUPER KEYWORD AND SUPERCLASS CONSTRUCTOR)
// TITLE: Using the Keyword super
// AUTHOR: Oracle
// DATE: Accessed 28 September 2026
// AVAILABLE:
// https://docs.oracle.com/javase/tutorial/java/IandI/super.html
// DESCRIPTION: Reference used for calling superclass constructors and
// working with inherited members using the super keyword.
// ----------------------------------------------------------------------

package com.mycompany.silverscreen;


import java.util.Scanner;

public class SilverScreen {

    public static void main(String[] args) {

        // I create a Scanner so I can receive input from the user.
        Scanner input = new Scanner(System.in);

        // I store the names of the three cinema branches.
        String[] branches = {"Gateway", "Pavillion", "Ballito"};

        // I create a two-dimensional array to store adult and student ticket sales.
        // I use column 0 for adult tickets and column 1 for student tickets.
        int[][] ticketSales = new int[branches.length][2];

        System.out.println("=================================================");
        System.out.println("SILVERSCREEN TICKET REPORT");
        System.out.println("=================================================");

        // I use a loop to enter ticket information for each cinema branch.
        for (int i = 0; i < branches.length; i++) {

            System.out.print(
                    "Enter Adult tickets for " + branches[i] + ": "
            );

            // I store the number of adult tickets in column 0.
            ticketSales[i][0] = input.nextInt();

            System.out.print(
                    "Enter Student tickets for " + branches[i] + ": "
            );

            // I store the number of student tickets in column 1.
            ticketSales[i][1] = input.nextInt();

            System.out.println("-------------------------------------------");
        }

        // I display the headings for my ticket sales table.
        System.out.printf(
                "%-15s %-10s %-10s%n",
                "BRANCH",
                "ADULT",
                "STUDENT"
        );

        System.out.println("-------------------------------------------");

        // I use a loop to display the ticket sales for every branch.
        for (int i = 0; i < branches.length; i++) {

            System.out.printf(
                    "%-15s %-10d %-10d%n",
                    branches[i],
                    ticketSales[i][0],
                    ticketSales[i][1]
            );
        }

        System.out.println("-------------------------------------------");

        // I start the grand total at zero so I can add each branch total.
        int grandTotal = 0;

        // I start the lowest total at the largest possible integer value.
        int lowestTotal = Integer.MAX_VALUE;

        // I create a String to store the name of the branch with the lowest sales.
        String lowestBranch = "";

        // I use a loop to calculate the total tickets sold by each branch.
        for (int i = 0; i < branches.length; i++) {

            // I calculate the branch total by adding adult and student tickets.
            int branchTotal
                    = ticketSales[i][0]
                    + ticketSales[i][1];

            // I display the total tickets sold by the current branch.
            System.out.println(
                    branches[i]
                    + ": "
                    + branchTotal
            );

            // I add the current branch total to the grand total.
            grandTotal += branchTotal;

            // I check if the current branch has fewer sales than the previous lowest.
            if (branchTotal < lowestTotal) {

                // I store the current branch total as the lowest total.
                lowestTotal = branchTotal;

                // I store the current branch name as the lowest sales branch.
                lowestBranch = branches[i];
            }
        }

        System.out.println("------------------------------------");

        // I display the total number of tickets sold by all branches.
        System.out.println(
                "GRAND TOTAL: " + grandTotal
        );

        // I display the branch that had the lowest ticket sales.
        System.out.println(
                "LOWEST SALES BRANCH: " + lowestBranch
        );

        System.out.println("=======================================");

        // I close the Scanner after I have finished receiving all input.
        input.close();
    }
}