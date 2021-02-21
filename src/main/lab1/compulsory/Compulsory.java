package main.lab1.compulsory;

public class Compulsory {

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

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 9) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = declare();
        while (n > 9) {
            n = sumOfDigits(n);
        }
        System.out.println("Willy-nilly this semester I will learn " + languages[n]);
    }

}
