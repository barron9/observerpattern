import org.greenrobot.eventbus.EventBus;

public class bus extends EventBus {


    @Override
    public void register(Object subscriber) {
        super.register(subscriber);
    }

    @Override
    public void post(Object event) {
        super.post(event);
    }
}
