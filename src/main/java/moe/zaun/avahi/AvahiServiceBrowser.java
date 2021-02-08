package moe.zaun.avahi;

import com.sun.jna.ptr.IntByReference;
import moe.zaun.avahi.core.client.LibAvahiClient;
import moe.zaun.avahi.core.client.lookUp.AvahiServiceBrowserCallback;
import moe.zaun.avahi.core.client.lookUp.AvahiServiceBrowserPointer;
import moe.zaun.avahi.core.common.adress.AvahiIfIndex;
import moe.zaun.avahi.core.common.adress.AvahiProtocol;
import moe.zaun.avahi.core.common.defs.AvahiBrowserEvent;
import moe.zaun.avahi.core.common.defs.AvahiLookupResultFlags;

public abstract class AvahiServiceBrowser implements AvahiServiceBrowserCallback {

    public final AvahiServiceBrowserPointer pointer;

    protected AvahiServiceBrowser(AvahiClient client, AvahiIfIndex avahiInterface, AvahiProtocol protocol, String type, String domain) {
        this.pointer = LibAvahiClient.INSTANCE.avahi_service_browser_new(
                client.pointer,
                avahiInterface,
                protocol,
                type,
                domain,
                this,
                new IntByReference()
        );
    }

    protected AvahiServiceBrowser(AvahiServiceBrowserPointer pointer) {
        this.pointer = pointer;
    }

    protected abstract void callBack(
            AvahiServiceBrowser browser,
            AvahiIfIndex avahiInterface,
            AvahiBrowserEvent event,
            String name,
            String type,
            String domain,
            AvahiLookupResultFlags flags);

    @Override
    public final void avahiServiceBrowserCallBack(AvahiServiceBrowserPointer browser,
                                                  AvahiIfIndex avahiInterface,
                                                  AvahiBrowserEvent event,
                                                  String name,
                                                  String type,
                                                  String domain,
                                                  AvahiLookupResultFlags flags,
                                                  IntByReference userData) {
        this.callBack(this, avahiInterface, event, name, type, domain, flags);
    }
}
