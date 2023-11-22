package com.fujitsu.answer;

public class Palindrome {

    public boolean isPalindrome(String word){

        // untuk menghapus spasi jika kata inputan menggunakan spasi
        // dan mengubah huruf menjadi huruf kecil semua
        String cleanWord = word.replaceAll("\\s", "").toLowerCase();

        // untuk mendapatkan panjang string / huruf yang telah di bersihkan
        int length = cleanWord.length();

        // inisialisasi indeks awal
        int start = 0;

        // inisialisasi indeks akhir
        int end = length - 1;

        // melakukan pengecekan palindrome
        while (start < end){

            // jika karakter/huruf posisi start tidak sama dengan karakter posisi end
            if (cleanWord.charAt(start) != cleanWord.charAt(end)){
                return false; // bukan palindrome
            }

            // indeks start =+ 1
            start++;

            // indeks end =- 1
            end--;

        }

        // itu adalah palindrome
        return true;
    }

}
