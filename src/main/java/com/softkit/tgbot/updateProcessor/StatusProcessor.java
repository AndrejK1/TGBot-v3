package com.softkit.tgbot.updateProcessor;

import com.pengrad.telegrambot.model.Update;
import com.softkit.tgbot.dataManagment.IncomingData;
import com.softkit.tgbot.dataManagment.OutgoingData;

public abstract class StatusProcessor implements OutgoingData {

    protected IncomingData incomingData;

    public StatusProcessor(Update update) {
        incomingData = new IncomingData(update);
    }

    abstract ResponseStatus process();

    abstract boolean isCorrectData();

    public IncomingData getIncomingData() {
        return incomingData;
    }
}
