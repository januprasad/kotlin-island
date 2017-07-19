package com.jenuin.kotlin.example;

import example.jenuine.upi_sample.Channel;
import example.jenuine.upi_sample.UPIInterface;
import example.jenuine.upi_sample.callapi.CallBunchAPI;

/**
 * Created by jenuprasad on 19/07/17.
 */

public class APICall {

    public void callSDK() {
        UPIInterface u = Channel.getChannel();
        u.callPayAPI();
    }
}
