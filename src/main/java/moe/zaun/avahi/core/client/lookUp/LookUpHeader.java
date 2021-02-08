package moe.zaun.avahi.core.client.lookUp;

import com.sun.jna.Library;
import com.sun.jna.ptr.IntByReference;
import moe.zaun.avahi.core.client.client.AvahiClientPointer;
import moe.zaun.avahi.core.common.adress.AvahiIfIndex;
import moe.zaun.avahi.core.common.adress.AvahiProtocol;

public interface LookUpHeader extends Library {
    AvahiServiceBrowserPointer avahi_service_browser_new(AvahiClientPointer client, AvahiIfIndex ifInterface, AvahiProtocol protocol, String type, String domain, AvahiServiceBrowserCallback callback, IntByReference userData);
}
