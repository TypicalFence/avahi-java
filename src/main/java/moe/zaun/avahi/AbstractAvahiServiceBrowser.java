package moe.zaun.avahi;

import com.sun.jna.ptr.IntByReference;
import moe.zaun.avahi.core.client.LibAvahiClient;
import moe.zaun.avahi.core.client.lookUp.AvahiServiceBrowserCallback;
import moe.zaun.avahi.core.client.lookUp.AvahiServiceBrowserPointer;
import moe.zaun.avahi.core.common.adress.AvahiIfIndex;
import moe.zaun.avahi.core.common.adress.AvahiProtocol;
import moe.zaun.avahi.core.common.defs.AvahiBrowserEvent;

public abstract class AbstractAvahiServiceBrowser implements AvahiServiceBrowserCallback {

    public final AvahiServiceBrowserPointer pointer;

    public AbstractAvahiServiceBrowser(AbstractAvahiClient client, AvahiIfIndex avahiInterface, AvahiProtocol protocol, String type, String domain) {
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

    public AbstractAvahiServiceBrowser(AvahiServiceBrowserPointer pointer) {
        this.pointer = pointer;
    }

    protected abstract void callBack(
            AbstractAvahiServiceBrowser browser,
            AvahiIfIndex avahiInterface,
            AvahiBrowserEvent event,
            String name,
            String type,
            String domain,
            int flags);

    @Override
    public final void avahiServiceBrowserCallBack(AvahiServiceBrowserPointer browser,
                                                  AvahiIfIndex avahiInterface,
                                                  int event,
                                                  String name,
                                                  String type,
                                                  String domain,
                                                  int flags,
                                                  IntByReference userData) {
        this.callBack(this, avahiInterface, AvahiBrowserEvent.fromValue(event), name, type, domain, flags);
    }
}
