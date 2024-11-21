package com.cuttlefish.dashboard.message.redux;

import com.cuttlefish.dashboard.RobotStatus;
import com.cuttlefish.dashboard.message.Message;
import com.cuttlefish.dashboard.message.MessageType;

public class ReceiveRobotStatus extends Message {
    private RobotStatus status;

    public ReceiveRobotStatus(RobotStatus robotStatus) {
        super(MessageType.RECEIVE_ROBOT_STATUS);

        status = robotStatus;
    }
}
