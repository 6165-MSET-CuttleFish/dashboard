package com.cuttlefish.dashboard.message.redux;

import com.cuttlefish.dashboard.config.variable.CustomVariable;
import com.cuttlefish.dashboard.message.Message;
import com.cuttlefish.dashboard.message.MessageType;

public class SaveConfig extends Message {
    private CustomVariable configDiff;

    public SaveConfig(CustomVariable configDiff) {
        super(MessageType.SAVE_CONFIG);

        this.configDiff = configDiff;
    }

    public CustomVariable getConfigDiff() {
        return configDiff;
    }
}
