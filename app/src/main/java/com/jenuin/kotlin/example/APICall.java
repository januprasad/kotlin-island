package com.jenuin.kotlin.example;

import example.jenuine.upisdk.Channel;
import example.jenuine.upisdk.UPIInterface;

/**
 * Created by jenuprasad on 19/07/17.
 */

public class APICall {

    public void callSDK() {
        UPIInterface u = Channel.getChannel();
        u.callPayAPI();
    }
}
