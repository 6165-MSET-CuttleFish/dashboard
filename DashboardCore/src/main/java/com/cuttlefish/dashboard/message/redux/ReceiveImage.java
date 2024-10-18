package com.cuttlefish.dashboard.message.redux;

import com.cuttlefish.dashboard.message.Message;
import com.cuttlefish.dashboard.message.MessageType;

public class ReceiveImage extends Message {
    private String imageString;

    public ReceiveImage(String imageString) {
        super(MessageType.RECEIVE_IMAGE);

        this.imageString = imageString;
    }
}
