package com.softkit.tgbot.updateProcessor;

import com.pengrad.telegrambot.model.Update;
import com.softkit.tgbot.database.User;

public class StatusProcessorFactory {

    private class HelloProcessor extends StatusProcessor {


        public HelloProcessor(Update update) {
            super(update);
        }

        @Override
        ResponseStatus process() {
            return null;
        }

        @Override
        boolean isCorrectData() {

            return false;
        }
    }

    public StatusProcessor getStatusProcessor(Update update) {


        //if (status == 1) from update
            return new HelloProcessor(update);
    }
}
