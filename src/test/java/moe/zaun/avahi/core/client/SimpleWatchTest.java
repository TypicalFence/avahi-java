package moe.zaun.avahi.core.client;


import moe.zaun.avahi.core.common.LibAvahiCommon;
import moe.zaun.avahi.core.common.simpleWatch.AvahiSimplePollPointer;
import org.junit.jupiter.api.Test;

public class SimpleWatchTest {

    @Test
    void createAndFree() {
        AvahiSimplePollPointer myPool = LibAvahiCommon.INSTANCE.avahi_simple_poll_new();
        LibAvahiCommon.INSTANCE.avahi_simple_poll_free(myPool);
    }

    @Test
    void get() {
        AvahiSimplePollPointer myPool = LibAvahiCommon.INSTANCE.avahi_simple_poll_new();
        LibAvahiCommon.INSTANCE.avahi_simple_poll_get(myPool);
        LibAvahiCommon.INSTANCE.avahi_simple_poll_free(myPool);
    }
}
