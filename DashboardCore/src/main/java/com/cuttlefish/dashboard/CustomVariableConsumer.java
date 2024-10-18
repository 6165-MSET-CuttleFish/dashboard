package com.cuttlefish.dashboard;

import com.cuttlefish.dashboard.config.variable.CustomVariable;

public interface CustomVariableConsumer {
    void accept(CustomVariable customVariable);
}
