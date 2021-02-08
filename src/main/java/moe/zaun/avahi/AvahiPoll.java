package moe.zaun.avahi;

import moe.zaun.avahi.core.common.watch.AvahiPollPointer;

public final class AvahiPoll {
    public final AvahiPollPointer pointer;


    public AvahiPoll(AvahiPollPointer pointer) {
        this.pointer = pointer;
    }
}
