package com.softkit.tgbot.updateProcessor;

import com.pengrad.telegrambot.model.Update;
import com.softkit.tgbot.utils.BotLogger;

import java.util.List;

public class UpdateProcessor {

    private StatusProcessorFactory spf = new StatusProcessorFactory();

    public void process(List<Update> updates) {

        if (updates != null && !updates.isEmpty()) {
            BotLogger.log("Process with " + updates.size() + " updates");

            // starting threads?

            for (Update update : updates) {
                ResponseStatus rs = processUpdate(update);
            }
        }
    }

    private ResponseStatus processUpdate(Update update) {
        return spf.getStatusProcessor(update).process();
    }

}
