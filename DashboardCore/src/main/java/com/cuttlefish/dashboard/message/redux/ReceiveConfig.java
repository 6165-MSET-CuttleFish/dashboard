package com.cuttlefish.dashboard.message.redux;

import com.cuttlefish.dashboard.config.variable.CustomVariable;
import com.cuttlefish.dashboard.message.Message;
import com.cuttlefish.dashboard.message.MessageType;

public class ReceiveConfig extends Message {
    private CustomVariable configRoot;

    public ReceiveConfig(CustomVariable configRoot) {
        super(MessageType.RECEIVE_CONFIG);

        this.configRoot = configRoot;
    }
}
