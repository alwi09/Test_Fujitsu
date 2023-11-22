package com.fujitsu;

import com.fujitsu.answer.Palindrome;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        // mengunakkan scanner untuk inputan pada console
        Scanner scanner = new Scanner(System.in);

        // deklarasi tryAgain agar bisa di akses pada kondisi loop
        String tryAgain;
        do {
            // untuk memasukkan inputan
            System.out.print("Masukkan Kata : ");
            String inputWord = scanner.nextLine();

            // membuat object dari class Palindrome
            Palindrome palindrome = new Palindrome();

            // melakukan pengecekan
            // dan pemanggilan object palindrome
            if (palindrome.isPalindrome(inputWord)){
                System.out.println(inputWord + " adalah palindrome : " + palindrome.isPalindrome(inputWord));
            }else {
                System.out.println(inputWord + " bukan palindrome : " + palindrome.isPalindrome(inputWord));
            }

            // menanyakan pada pengguna
            System.out.print("Apakah ingin mencoba lagi? (y/n) : ");
            tryAgain = scanner.nextLine();

            // keluar dari looping jika jawaban bukan (y)
        }while (tryAgain.equalsIgnoreCase("y"));

        // menutup scanner
        scanner.close();
    }
}
