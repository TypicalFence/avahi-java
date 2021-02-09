package moe.zaun.avahi;

public class AvahiClient extends AbstractAvahiClient {

    private final AvahiClientCallback clientCallback;

    public AvahiClient(AvahiPoll poll, AvahiClientCallback clientCallback) {
        super(poll);
        this.clientCallback = clientCallback;
    }

    @Override
    protected void callBack(AbstractAvahiClient client, int state) {
        this.clientCallback.accept(new AvahiClientCallback.Arguments(client, state));
    }
}
