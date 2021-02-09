package moe.zaun.avahi;

import moe.zaun.avahi.core.common.adress.AvahiIfIndex;
import moe.zaun.avahi.core.common.adress.AvahiProtocol;
import org.junit.jupiter.api.Test;

public class ServiceBrowserTest {
    @Test
    void canBeCreated() {
        AvahiSimplePoll simplePoll = new AvahiSimplePoll();
        AvahiPoll poll = simplePoll.get();
        AbstractAvahiClient client = new DummyAvahiClient(poll);
        AbstractAvahiServiceBrowser browser = new DummyAvahiServiceBrowser(client, AvahiIfIndex.UNSPEC, AvahiProtocol.UNSPEC, "_http._tcp", null);
    }

}
