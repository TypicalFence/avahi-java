package moe.zaun.avahi.core.client.lookUp;

import com.sun.jna.Callback;
import com.sun.jna.ptr.IntByReference;
import moe.zaun.avahi.core.common.adress.AvahiIfIndex;
import moe.zaun.avahi.core.common.defs.AvahiBrowserEvent;
import moe.zaun.avahi.core.common.defs.AvahiLookupResultFlags;

public interface AvahiServiceBrowserCallback extends Callback {

    void avahiServiceBrowserCallBack(
            AvahiServiceBrowserPointer browser,
            AvahiIfIndex avahiInterface,
            int event,
            String name,
            String type,
            String domain,
            int flags,
            IntByReference userData);

}
