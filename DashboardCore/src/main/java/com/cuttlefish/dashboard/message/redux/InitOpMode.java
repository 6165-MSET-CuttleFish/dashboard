package com.cuttlefish.dashboard.message.redux;

import com.cuttlefish.dashboard.message.Message;
import com.cuttlefish.dashboard.message.MessageType;

public class InitOpMode extends Message {
    private String opModeName;

    public InitOpMode(String opModeName) {
        super(MessageType.INIT_OP_MODE);

        this.opModeName = opModeName;
    }

    public String getOpModeName() {
        return opModeName;
    }
}
