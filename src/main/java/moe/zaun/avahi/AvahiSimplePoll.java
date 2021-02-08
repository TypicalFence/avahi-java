package moe.zaun.avahi;

import moe.zaun.avahi.core.common.LibAvahiCommon;
import moe.zaun.avahi.core.common.simpleWatch.AvahiSimplePollPointer;
import moe.zaun.avahi.core.common.watch.AvahiPollPointer;


public final class AvahiSimplePoll implements freeable  {
    public final AvahiSimplePollPointer pointer;

    public AvahiSimplePoll() {
        this.pointer = LibAvahiCommon.INSTANCE.avahi_simple_poll_new();
    }

    public AvahiSimplePoll(AvahiSimplePollPointer pointer) {
        this.pointer = pointer;
    }

    @Override
    public void free() {
        LibAvahiCommon.INSTANCE.avahi_simple_poll_free(this.pointer);
    }

    public AvahiPoll get() {
        AvahiPollPointer pointer = LibAvahiCommon.INSTANCE.avahi_simple_poll_get(this.pointer);
        return new AvahiPoll(pointer);
    }

    public void loop() {
        LibAvahiCommon.INSTANCE.avahi_simple_poll_loop(this.pointer);
    }

    public void iterate(int sleep) {
        LibAvahiCommon.INSTANCE.avahi_simple_poll_iterate(this.pointer, sleep);
    }

    public void quit() {
        LibAvahiCommon.INSTANCE.avahi_simple_poll_quit(this.pointer);
    }
}
