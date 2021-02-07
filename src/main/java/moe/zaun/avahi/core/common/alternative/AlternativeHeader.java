package moe.zaun.avahi.core.common.alternative;

import com.sun.jna.Library;

public interface AlternativeHeader extends Library {
    /**
     * Find an alternative for the specified host name.
     * If called with an original host name, "-2" is appended, afterwards the number is increased on each call. (i.e. "foo" becomes "foo-2" becomes "foo-3" and so on.) avahi_free() the result.
     * @param hostName
     * @return
     */
    String avahi_alternative_host_name(String hostName);
}
