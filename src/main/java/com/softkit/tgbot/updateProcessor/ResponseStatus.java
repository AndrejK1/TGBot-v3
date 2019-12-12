package com.softkit.tgbot.updateProcessor;

public enum ResponseStatus {

    COMPLETE(0),
    WRONG_INPUT(1),
    EDIT_DATA(2),
    RESTART(64)
    ;

    int status;

    ResponseStatus(int status){
        this.status =status;
    }

}
