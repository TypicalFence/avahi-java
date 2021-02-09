package moe.zaun.avahi;

import moe.zaun.avahi.core.common.adress.AvahiIfIndex;
import moe.zaun.avahi.core.common.adress.AvahiProtocol;
import moe.zaun.avahi.core.common.defs.AvahiBrowserEvent;

public class AvahiServiceBrowser extends AbstractAvahiServiceBrowser{

    AvahiServiceBrowserCallback browserCallback;

    public AvahiServiceBrowser(
            AbstractAvahiClient client,
            AvahiIfIndex avahiInterface,
            AvahiProtocol protocol,
            String type,
            String domain,
            AvahiServiceBrowserCallback callback
    ) {
        super(client, avahiInterface, protocol, type, domain);
        this.browserCallback = callback;
    }

    @Override
    protected void callBack(
            AbstractAvahiServiceBrowser browser,
            AvahiIfIndex avahiInterface,
            AvahiBrowserEvent event,
            String name,
            String type,
            String domain,
            int flags
    ) {
        this.browserCallback.accept(new AvahiServiceBrowserCallback.Arguments(browser, avahiInterface, event, name, type, domain, flags));
    }
}
