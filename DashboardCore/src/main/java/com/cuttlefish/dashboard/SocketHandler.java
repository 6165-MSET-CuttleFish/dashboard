package com.cuttlefish.dashboard;

import com.cuttlefish.dashboard.message.Message;

public interface SocketHandler {
    void onOpen();

    void onClose();

    // Returns true iff the message was handled
    boolean onMessage(Message message);
}
