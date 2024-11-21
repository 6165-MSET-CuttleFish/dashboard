package com.cuttlefish.dashboard.message.redux;

import com.cuttlefish.dashboard.message.Message;
import com.cuttlefish.dashboard.message.MessageType;

public class GetRobotStatus extends Message {

    public GetRobotStatus() {
        super(MessageType.GET_ROBOT_STATUS);
    }
}
