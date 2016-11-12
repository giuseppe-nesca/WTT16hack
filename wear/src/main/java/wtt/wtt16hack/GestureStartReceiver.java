package wtt.wtt16hack;

/**
 * Created by danie on 12/11/2016.
 */
import watch.nudge.gesturelibrary.AppControllerReceiverService;
import wtt.wtt16hack.gui.act.MainWatchActivity;

public class GestureStartReceiver extends AppControllerReceiverService {
    @Override
    protected Class getWatchActivityClass() {
        return MainWatchActivity.class;
    }
}