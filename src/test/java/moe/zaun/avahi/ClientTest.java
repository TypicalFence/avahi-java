package moe.zaun.avahi;

import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    void canBeCreated() {
        AvahiSimplePoll simplePoll = new AvahiSimplePoll();
        AvahiPoll poll = simplePoll.get();
        AvahiClient client = new DummyAvahiClient(poll);
    }
}
