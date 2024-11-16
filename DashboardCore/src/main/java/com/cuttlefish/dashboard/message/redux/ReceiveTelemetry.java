package com.cuttlefish.dashboard.message.redux;

import com.cuttlefish.dashboard.message.Message;
import com.cuttlefish.dashboard.message.MessageType;
import com.cuttlefish.dashboard.telemetry.TelemetryPacket;
import java.util.List;

public class ReceiveTelemetry extends Message {
    // an empty list tells clients to clear
    private List<TelemetryPacket> telemetry;

    public ReceiveTelemetry(List<TelemetryPacket> packets) {
        super(MessageType.RECEIVE_TELEMETRY);

        telemetry = packets;
    }
}
