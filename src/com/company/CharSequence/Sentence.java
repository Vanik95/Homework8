package com.company.CharSequence;

public class Sentence implements CharSequence {

    //region Properties

    private String text;

    //endregion

    //region Constructors

    public Sentence() {
    }

    public Sentence(String text) {
        this.text = text;
    }

    //endregion

    //region Public Methods

    @Override
    public int length() {
        return text.length();
    }

    @Override
    public char charAt(int index) {
        return text.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {

        return text.subSequence(start, end);
    }

    //endregion

    //region Getters and Setters

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    //endregion
}
