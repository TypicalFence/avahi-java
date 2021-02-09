package moe.zaun.avahi;

public class DummyAvahiClient extends AbstractAvahiClient {

    protected DummyAvahiClient(AvahiPoll poll) {
        super(poll);
    }

    @Override
    protected void callBack(AbstractAvahiClient client, int state) {

    }
}
