package moe.zaun.avahi;

import moe.zaun.avahi.core.common.adress.AvahiIfIndex;
import moe.zaun.avahi.core.common.defs.AvahiBrowserEvent;

import java.util.function.Consumer;

public interface AvahiServiceBrowserCallback extends Consumer<AvahiServiceBrowserCallback.Arguments> {
    class Arguments {
        public final AbstractAvahiServiceBrowser browser;
        public final AvahiIfIndex avahiInterface;
        public final AvahiBrowserEvent event;
        public final String name;
        public final String type;
        public final String domain;
        public final int flags;

        public Arguments(AbstractAvahiServiceBrowser browser,
                         AvahiIfIndex avahiInterface,
                         AvahiBrowserEvent event,
                         String name,
                         String type,
                         String domain,
                         int flags
        ) {
            this.browser = browser;
            this.avahiInterface = avahiInterface;
            this.event = event;
            this.name = name;
            this.type = type;
            this.domain = domain;
            this.flags = flags;
        }
    }

}
