package moe.zaun.avahi.core.client.lookUp;

import com.sun.jna.ptr.IntByReference;
import moe.zaun.avahi.core.common.adress.AvahiIfIndex;
import moe.zaun.avahi.core.common.defs.AvahiBrowserEvent;
import moe.zaun.avahi.core.common.defs.AvahiLookupResultFlags;

public abstract class AvahiServiceBrowserCallback {

    public abstract void avahiServiceBrowserCallBack(
            AvahiServiceBrowser browser,
            AvahiIfIndex avahiInterface,
            AvahiBrowserEvent event,
            String name,
            String type,
            String domain,
            AvahiLookupResultFlags flags,
            IntByReference userData);

}
