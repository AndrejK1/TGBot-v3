package com.softkit.tgbot.utils;

public class BotLogger {
    private static final String logStr = "TELEGRAM BOT LOG:    ";

    public static void log(String log) {
        System.out.println(logStr + log);
    }
}
