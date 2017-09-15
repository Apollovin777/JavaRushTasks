package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить две строки.
3. Первая строка должна содержать только гласные буквы из введенной строки, разделенные пробелом.
4. Вторая строка должна содержать только согласные и знаки препинания из введенной строки, разделенные пробелом.
5. Каждая строка должна заканчиваться пробелом.
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        ArrayList<Character> vowel = new ArrayList<>();
        ArrayList<Character> notVowel = new ArrayList<>();
        for(Character c : str.toCharArray()){
            if(c.charValue()!=32){
                if(isVowel(c))
                    vowel.add(c);
                else
                    notVowel.add(c);
            }
        }
        for(Character c : vowel)
            System.out.print(c + " ");
        System.out.println();
        for(Character c : notVowel)
            System.out.print(c + " ");

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}