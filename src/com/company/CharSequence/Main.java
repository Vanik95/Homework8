package com.company.CharSequence;

public class Main {

    public static void main(String[] args) {

        Sentence sentence = new Sentence();
        sentence.setText("this is a text");

        System.out.println(sentence.length());

        System.out.print(sentence.charAt(10) + ", ");
        System.out.print(sentence.charAt(11) + ", ");
        System.out.print(sentence.charAt(12) + ", ");
        System.out.println(sentence.charAt(13));

        System.out.println(sentence.subSequence(1, 10));
    }
}
