package com.cuttlefish.dashboard.message.redux;

import com.cuttlefish.dashboard.message.Message;
import com.cuttlefish.dashboard.message.MessageType;

public class StartOpMode extends Message {
    public StartOpMode() {
        super(MessageType.START_OP_MODE);
    }
}
