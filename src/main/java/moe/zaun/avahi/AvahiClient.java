package moe.zaun.avahi;

import com.sun.jna.ptr.IntByReference;
import moe.zaun.avahi.core.client.LibAvahiClient;
import moe.zaun.avahi.core.client.client.AvahiClientCallback;
import moe.zaun.avahi.core.client.client.AvahiClientPointer;

public abstract class AvahiClient implements freeable, AvahiClientCallback {

    protected final AvahiClientPointer pointer;
    protected final IntByReference error;

    protected AvahiClient(AvahiPoll poll) {
        this.error = new IntByReference();
        this.pointer = LibAvahiClient.INSTANCE.avahi_client_new(poll.pointer, 0, this, new IntByReference(), error);
    }

    protected abstract void callBack(AvahiClient client, int state);

    @Override
    public final void avahiClientCallback(AvahiClientPointer client, int state, IntByReference userData) {
        this.callBack(this, state);
    }

    @Override
    public final void free() {
        LibAvahiClient.INSTANCE.avahi_client_free(this.pointer);
    }
}
