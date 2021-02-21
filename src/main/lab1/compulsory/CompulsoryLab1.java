package main.lab1.compulsory;

public class CompulsoryLab1 {
    /**
     * The role of the declare function is to initialize the "n" number
     * and to modify it in accordance to the operations on the website.
     * I preferred to use the literal way of writing the hexa/binary numbers
     * over the "Integer.parseInt" method because it's shorter and looks tidier
     * */
    static int declare() {

        int binaryNumber = 0b10101;
        int hexNumber = 0xff;
        int n = (int) (Math.random() * 1000000);
        n = n * 3;
        n = n + binaryNumber;
        n = n + hexNumber;
        n = n * 6;
        return n;
    }

    /**
     * Simple function that adds the digits of a number
     **/
    static int sumOfDigits(int n) {

        int sum = 0;
        while (n > 9) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
    /**
     * In main I initialise the string with programming languages,
     * the "n" number, we add the digits of "n" until it is a one digit number
     * and print the result
     * */
    public static void main(String[] args) {

        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = declare();
        while (n > 9) {
            n = sumOfDigits(n);
        }
        System.out.println("Willy-nilly this semester I will learn " + languages[n]);
    }

}
