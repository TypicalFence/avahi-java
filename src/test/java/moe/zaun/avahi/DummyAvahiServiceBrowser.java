package moe.zaun.avahi;

import moe.zaun.avahi.core.client.lookUp.AvahiServiceBrowserPointer;
import moe.zaun.avahi.core.common.adress.AvahiIfIndex;
import moe.zaun.avahi.core.common.adress.AvahiProtocol;
import moe.zaun.avahi.core.common.defs.AvahiBrowserEvent;
import moe.zaun.avahi.core.common.defs.AvahiLookupResultFlags;

public class DummyAvahiServiceBrowser extends AvahiServiceBrowser {

    protected DummyAvahiServiceBrowser(AvahiClient client, AvahiIfIndex avahiInterface, AvahiProtocol protocol, String type, String domain) {
        super(client, avahiInterface, protocol, type, domain);
    }

    @Override
    protected void callBack(AvahiServiceBrowser browser,
                            AvahiIfIndex avahiInterface,
                            AvahiBrowserEvent event,
                            String name,
                            String type,
                            String domain,
                            AvahiLookupResultFlags flags) {

    }
}