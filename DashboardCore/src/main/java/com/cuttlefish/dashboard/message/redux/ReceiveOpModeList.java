package com.cuttlefish.dashboard.message.redux;

import com.cuttlefish.dashboard.message.Message;
import com.cuttlefish.dashboard.message.MessageType;
import java.util.List;

public class ReceiveOpModeList extends Message {
    private List<String> opModeList;

    public ReceiveOpModeList(List<String> opModeList) {
        super(MessageType.RECEIVE_OP_MODE_LIST);

        this.opModeList = opModeList;
    }
}
