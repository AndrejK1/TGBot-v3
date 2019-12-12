package com.softkit.tgbot.dataManagment;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.request.BaseRequest;
import com.pengrad.telegrambot.request.SendMessage;
import com.softkit.tgbot.Bot;

public interface OutgoingData {
    // текст
    // кнопки
    default boolean sendRequest( BaseRequest request ){
        return Bot.getBot().execute( request ).isOk();
    }
}
