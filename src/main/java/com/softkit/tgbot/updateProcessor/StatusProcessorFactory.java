package com.softkit.tgbot.updateProcessor;

import com.pengrad.telegrambot.model.Update;
import com.softkit.tgbot.database.User;

public class StatusProcessorFactory {

    private interface StatusProcessor {
        ResponseStatus process(Update update);
    }


    public static StatusProcessor getStatusProcessor(Update update) {

        return new StatusProcessor() {
            @Override
            public ResponseStatus process(Update update) {
                return null;
            }
        };
    }
}
