package com.softkit.tgbot.dataManagment;

import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;

public class IncomingData {

    private Update update;
    private Message message;

    public IncomingData(Update update) {
    this.update = update;
    message = getMessage();
    }

    public boolean isRollBack() {
        Message message = update.message();
        if( message != null )
            return message.text().compareToIgnoreCase("/start") == 0;
        return false;
    }

    public Message getMessage() {
        if( update.message() != null ) {
            return update.message();
        }else
        if( update.callbackQuery() != null ) {
            return update.callbackQuery().message();
        }
        // thrown some Exception.
        return null;
    }

    public int getUserId()
    {
        return message.from().id();
    }

    public long getChatId(){
        return message.chat().id();
    }

    public int getMessageId()
    {
        return getMessage().messageId();
    }
}
