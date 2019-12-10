package com.softkit.tgbot.updateProcessor;

public enum ResponseStatus {

    COMPLETE(0),
    WRONG_INPUT(1),
    RESTART(2)
    ;

    int status;

    ResponseStatus(int status){
        this.status =status;
    }

}
