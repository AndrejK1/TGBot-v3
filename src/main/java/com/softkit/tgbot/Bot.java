package com.softkit.tgbot;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.request.GetUpdates;
import com.softkit.tgbot.updateProcessor.UpdateProcessor;

public class Bot extends TelegramBot {

    private final GetUpdates getUpdates;
    private UpdateProcessor updateProcessor;
    private static Bot bot;
    private static String token = "1032578818:AAEcsGFQ46oLcenajdG7vUB_jPyuazzdqIk";

    private Bot(String botToken) {
        super(botToken);

        getUpdates = new GetUpdates().limit(5).offset(0).timeout(100);
        updateProcessor = new UpdateProcessor();
        setUpdatesListener(Update -> {
            updateProcessor.process(execute(getUpdates).updates());
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });
    }

    public static Bot getBot(){
        if (bot == null) {
            bot = new Bot(token);
        }
        return bot;
    }
}
