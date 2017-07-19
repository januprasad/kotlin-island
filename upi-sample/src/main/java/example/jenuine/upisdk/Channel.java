package example.jenuine.upisdk;

/**
 * Created by jenuprasad on 19/07/17.
 */

public class Channel implements UPIInterface {
    public static UPIInterface getChannel() {
        return new Channel();
    }

    @Override
    public void callPayAPI() {
        CallBunchAPI callBunchAPI = new CallBunchAPI();
        callBunchAPI.callSomeAPI();
    }

    @Override
    public void init() {

    }

    @Override
    public void generateOTP() {

    }
}
