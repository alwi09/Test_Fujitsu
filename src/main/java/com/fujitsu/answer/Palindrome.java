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



        return true;
    }

}
