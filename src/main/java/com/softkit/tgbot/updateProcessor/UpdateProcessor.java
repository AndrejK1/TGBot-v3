package com.softkit.tgbot.updateProcessor;

import com.pengrad.telegrambot.model.Update;
import com.softkit.tgbot.database.User;
import com.softkit.tgbot.utils.BotLogger;

import java.util.List;

public class UpdateProcessor {

    public void process(List<Update> updates) {

        if (updates != null && !updates.isEmpty()) {
            BotLogger.log("Process with " + updates.size() + " updates");

            // starting threads?

            for (Update update : updates) {
                ResponseStatus rs = processUpdate(update);
                if (rs == ResponseStatus.RESTART) {
                    // restart bot
                }
            }
        }
    }

    private ResponseStatus processUpdate(Update update) {




        return null;
    }

}
