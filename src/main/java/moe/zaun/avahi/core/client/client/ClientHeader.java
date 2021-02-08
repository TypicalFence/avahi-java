package moe.zaun.avahi.core.client.client;

import com.sun.jna.Library;
import com.sun.jna.ptr.IntByReference;
import moe.zaun.avahi.core.common.watch.AvahiPollPointer;

public interface ClientHeader extends Library {
    AvahiClientPointer avahi_client_new(AvahiPollPointer poll, int clientFlags, AvahiClientCallback callback, IntByReference userData, IntByReference error);
    void avahi_client_free(AvahiClientPointer client);
}
