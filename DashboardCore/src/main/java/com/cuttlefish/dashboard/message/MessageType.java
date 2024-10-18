package com.cuttlefish.dashboard.message;

import com.cuttlefish.dashboard.message.redux.GetConfig;
import com.cuttlefish.dashboard.message.redux.GetRobotStatus;
import com.cuttlefish.dashboard.message.redux.InitOpMode;
import com.cuttlefish.dashboard.message.redux.ReceiveConfig;
import com.cuttlefish.dashboard.message.redux.ReceiveGamepadState;
import com.cuttlefish.dashboard.message.redux.ReceiveImage;
import com.cuttlefish.dashboard.message.redux.ReceiveOpModeList;
import com.cuttlefish.dashboard.message.redux.ReceiveRobotStatus;
import com.cuttlefish.dashboard.message.redux.ReceiveTelemetry;
import com.cuttlefish.dashboard.message.redux.SaveConfig;
import com.cuttlefish.dashboard.message.redux.StartOpMode;
import com.cuttlefish.dashboard.message.redux.StopOpMode;

/**
 * Dashboard message types. These values match the corresponding Redux actions in the frontend.
 */
public enum MessageType {
    /* status (also serves as a heartbeat) */
    GET_ROBOT_STATUS(GetRobotStatus.class),
    RECEIVE_ROBOT_STATUS(ReceiveRobotStatus.class),

    /* op mode management */
    INIT_OP_MODE(InitOpMode.class),
    START_OP_MODE(StartOpMode.class),
    STOP_OP_MODE(StopOpMode.class),
    RECEIVE_OP_MODE_LIST(ReceiveOpModeList.class),

    /* config */
    GET_CONFIG(GetConfig.class),
    SAVE_CONFIG(SaveConfig.class),
    RECEIVE_CONFIG(ReceiveConfig.class),

    /* telemetry */
    RECEIVE_TELEMETRY(ReceiveTelemetry.class),

    /* camera */
    RECEIVE_IMAGE(ReceiveImage.class),

    /* gamepad */
    RECEIVE_GAMEPAD_STATE(ReceiveGamepadState.class);

    final Class<? extends Message> msgClass;

    MessageType(Class<? extends Message> msgClass) {
        this.msgClass = msgClass;
    }
}
