package com.cuttlefish.dashboard.message.redux;

import com.cuttlefish.dashboard.message.Message;
import com.cuttlefish.dashboard.message.MessageType;

public class GetConfig extends Message {
    public GetConfig() {
        super(MessageType.GET_CONFIG);
    }
}
