package com.aktepe.mucahit;

// Throwable --> Exception --> RuntimeException -->

class AgeException extends RuntimeException {
    public AgeException() {};

    public AgeException(String str) {
        super(str);
    }
}

public class MyExceptions {
    public static void main(String[] args) {
//        int bolunen = 5, bolen = 0;
//        if (bolen == 0) {
//            throw new ArithmeticException("Sifirla bolme yapilamaz");
//        }

        int age = 20;
        if (age > 10) {
            throw new AgeException("Yas 10 dan buyuk olamaz");
        }

        // Compiler Error --> Kod calismiyorken hata uretir.
        // Runtime Error  -->
    }
}

// Exception lar programmer'a veya tester'a hatanin neyden kaynaklandigini belirtmek icin yardimci metinlerdir.
// Log
// ahmet 5 / 0

/*
Java, Git, Github

Sonraki Hafta
Selenium
TestNG
Cucumber

Bir Sonraki Hafta
Testing Exercises

2 Sonraki Hafta
Complete Java, Testing

3 Sonraki Hafta
SQL

4 Sonraki Hafta
SQL

5 Sonraki Hafta
API

6 Sonraki Hafta
Jenkins
*/

