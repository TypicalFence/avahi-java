package moe.zaun.avahi;

public class DummyAvahiClient extends AvahiClient {

    protected DummyAvahiClient(AvahiPoll poll) {
        super(poll);
    }

    @Override
    protected void callBack(AvahiClient client, int state) {

    }
}
