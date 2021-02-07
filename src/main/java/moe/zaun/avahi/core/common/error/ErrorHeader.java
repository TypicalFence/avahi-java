package moe.zaun.avahi.core.common.error;

import com.sun.jna.Library;

public interface ErrorHeader extends Library {
    String avahi_strerror(AvahiError err);
}
