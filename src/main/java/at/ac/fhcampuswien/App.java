package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char charLit = 'Z';
        int intLit = 0xface;
        int int2Lit = 012;
        long longLit = 80L;
        float floatLit= 44e-1f;
        float float2Lit = 5.5f;
        double doubleLit = 8.88e1;
        double double2Lit = 99.9;

        int sum;

        sum = ((int)charLit) + intLit + int2Lit + ((int)longLit) + ((int)floatLit) + ((int)float2Lit) + ((int)doubleLit) + ((int)double2Lit);
        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);

        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();
        int result = firstNum + secondNum;

        System.out.println(result);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);

        System.out.println("Before Swap:");
        System.out.print("x: ");
        int firstNumber = scan.nextInt();

        System.out.print("y: ");
        int secondNumber = scan.nextInt();

        System.out.println("After Swap:");
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        System.out.println("x: " + firstNumber);
        System.out.println("y: " + secondNumber);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);

        System.out.print("n1: ");
        int firstNumber = scan.nextInt();
        System.out.print("n2: ");
        int secondNumber = scan.nextInt();

        if(firstNumber > secondNumber)
        {
            System.out.println("n1 > n2");
        }
        else if(firstNumber < secondNumber)
        {
            System.out.println("n2 > n1");
        }
        else
        {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int revenue = scan.nextInt();

        if(revenue < 0 || revenue >= 100000 )
        {
            System.out.println("Invalid Revenue");
        }
        else if(revenue < 20000)
        {
            System.out.println("Poor Sales Revenue");
        }
        else if(revenue < 50000)
        {
            System.out.println("Average Sales Revenue");
        }
        else if(revenue < 80000)
        {
            System.out.println("Good Sales Revenue");
        }
        else if(revenue < 100000)
        {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int userInput = scan.nextInt();

        switch (userInput)
        {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;

        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scan.nextInt();

        if (year % 4 == 0 && year % 400 == 0)
        {
            System.out.println("Leapyear");
        }
        else if (year % 100 == 0 && year % 400 != 0)
        {
            System.out.println("Not a Leapyear");
        }
        else
        {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        int inputReversed;
        int firstDigit;
        int secondDigit;
        int thirdDigit;

        System.out.print("Number: ");
        int input = scan.nextInt();




        if (input >= 0 && input <10)
        {
            inputReversed = input;
            System.out.println(inputReversed);
        }
        else if (input >= 10 && input < 100)
        {
            firstDigit = input / 10;
            secondDigit = input % 10;

            inputReversed = secondDigit * 10 + firstDigit;
            System.out.println(inputReversed);
        }
        else if (input >= 100 && input < 1000)
        {
            int temporaryNum;
            firstDigit = input / 100;
            temporaryNum = input % 100;
            secondDigit = temporaryNum / 10;
            thirdDigit = temporaryNum % 10;

            inputReversed = thirdDigit * 100 + secondDigit * 10 + firstDigit;
            System.out.println(inputReversed);
        }

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}