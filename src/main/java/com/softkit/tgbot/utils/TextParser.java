package com.softkit.tgbot.utils;

public class TextParser {

    public static int wordCount(String text) {
        return text.trim().split(" ").length; // дожна быть проверка на несколько пробелов, не только на один
    }

    public static boolean isLetterText(String text) {
        return false;
    }

    public static boolean isDigitsText(String text) {
        return false;
    }

    public static boolean isEnglishText(String text) {
        return false;
    }
}
