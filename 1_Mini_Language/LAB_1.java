import java.util.Scanner;

public class LAB_1 {
    public static void main(String[] args) {
        /*
        A. Data Types:
            int – for integer numbers.
            boolean – for true/false values.
            float – for real numbers (with decimal).
            String – for text.
            class – to define composite types (similar to struct in C++ but simplified).

        B. Statements:
            Assignment Statement:
                Format: identifier = expression;
            Input/Output Statements:
                Input: Scanner in = new Scanner(System.in); identifier = in.next<DataType>();
                Output: System.out.println(expression);
            Conditional (if-else) Statement:
                Format: if (condition) { statements } [else { statements }]
            Looping Statements:
                While Loop: while (condition) { statements }
                For Loop: for (initialization; condition; increment) { statements }
                Method Call:
                Format: identifier(parameter_list);
        C. Additional Restrictions:
            Identifiers:
                Must start with a letter, and can contain letters and digits.
                Cannot use Java reserved words (int, boolean, float, class, if, else, while, for, Scanner, System.out, etc.).

                identifier ::= letter | letter{letter}{digit}

                letter ::= "A" | "B" | . ..| "Z"

                digit ::= "0" | "1" |...| "9"


            Constants:
                Defined using the final keyword.
                Once initialized, a constant cannot be modified.

            LANGUAGE STRUCTURE:

            <program> ::= <class_header> <main_method> <declaration_list> <statement_list>

            <class_header> ::= class ID { <main_method> }

            <main_method> ::= public static void main(String[] args) { <declaration_list> <statement_list> }

            <declaration_list> ::= <declaration> | <declaration> <declaration_list>
            <declaration> ::= <data_type> ID [= <expression>];  // Allows initialization during declaration

            <data_type> ::= int | float | boolean | String | class ID

            <statement_list> ::= <statement> <statement_list>
            <statement> ::= <assignment> | <input_statement> | <output_statement> | <conditional_statement> | <loop_statement> | <method_call>

            <assignment> ::= ID = <expression>;

            <input_statement> ::= Scanner in = new Scanner(System.in); ID = in.next<DataType>();

            <output_statement> ::= System.out.println(<expression>);

            <conditional_statement> ::= if (<condition>) { <statement_list> } [else { <statement_list> }]

            <loop_statement> ::= while (<condition>) { <statement_list> } | for (<assignment> <condition>; <assignment>) { <statement_list> }

            <method_call> ::= ID(<parameter_list>);

            <parameter_list> ::= <expression> | <expression>, <parameter_list> | e  // Parameters for methods

            <condition> ::= <expression> <relational_operator> <expression>

            <expression> ::= ID | CONST | <expression> <arithmetic_operator> <expression> | (<expression>)

            <arithmetic_operator> ::= + | - | * | /

            <relational_operator> ::= != | == | < | > | <= | >=

*/

        class GCD {
            public static void main(String[] args) {
                int a, b;

                // Input
                Scanner in = new Scanner(System.in);
                a = in.nextInt();
                b = in.nextInt();

                // GCD Calculation using while loop
                while (a != b) {
                    if (a > b) {
                        a = a - b;
                    } else {
                        b = b - a;
                    }
                }


                // Output
                System.out.println("The GCD is: " + a);
            }
        }

        class PrimeNumbers {
            public static void main(String[] args) {
                int k;

                // Input
                Scanner in = new Scanner(System.in);
                System.out.println("Enter the value of k:");
                k = in.nextInt();

                // Print prime numbers less than k
                System.out.println("Prime numbers less than " + k + ":");
                for (int num = 2; num < k; num++) {  // Start from 2 because 1 is not prime
                    if (isPrime(num)) {
                        System.out.println(num);  // Output prime number
                    }
                }
            }

            // Method to check if a number is prime
            public static boolean isPrime(int n) {
                if (n < 2) {
                    return false;  // 0 and 1 are not prime
                }
                for (int i = 2; i <= n / 2; i++) {  // Check divisibility from 2 to n/2
                    if (n % i == 0) {
                        return false;  // If divisible, not prime
                    }
                }
                return true;  // If not divisible, prime
            }
        }


        class ErrorExamples {
            public static void main(String[] args) {
                int a, b;

                // Error 1: Missing semicolon
                // System.out.println("Enter two natural numbers")
                a = 5;
                b = 10;

                // Error 2: Missing closing parenthesis
                // if (a > b {
                //     System.out.println("a is greater than b");
                // }

                // Error 3: Using undeclared variable
                // c = a + b;

                // Error 4: Using an undeclared class
                // MyClass obj = new MyClass();
            }
        }

        class Person {
            String name;
            int age;

            public static void main(String[] args) {
                Person p = new Person();
                // Error 1: Identifier starting with a number (invalid)
                // int a0b;

                // Error 2: Using reserved keyword as an identifier
                // int class;

                // Error 3: Trying to increment a constant
                final int num = 10;
                // num++;  // Error: Cannot modify a constant
            }
        }
    }
}
