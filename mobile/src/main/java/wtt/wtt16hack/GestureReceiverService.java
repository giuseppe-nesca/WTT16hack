package wtt.wtt16hack;

/**
 * Created by danie on 12/11/2016.
 */



import watch.nudge.phonegesturelibrary.AppLaunchReceiverService;

/*
* GestureReceiverService
*
* Service which launches the mobile app when the wear app is launched.
 */

public class GestureReceiverService extends AppLaunchReceiverService {
    public GestureReceiverService() {
    }

    @Override
    protected Class getPhoneActivityClass() {
        return MainActivity.class;
    }

}