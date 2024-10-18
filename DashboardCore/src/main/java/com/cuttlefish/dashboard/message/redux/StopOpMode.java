package com.cuttlefish.dashboard.message.redux;

import com.cuttlefish.dashboard.message.Message;
import com.cuttlefish.dashboard.message.MessageType;

public class StopOpMode extends Message {
    public StopOpMode() {
        super(MessageType.STOP_OP_MODE);
    }
}
