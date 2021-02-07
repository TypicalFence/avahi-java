package moe.zaun.avahi.core.common.malloc;

import com.sun.jna.Library;
import com.sun.jna.ptr.IntByReference;

public interface MallocHeader extends Library {
    /**
     * Free some memory.
     * @param ptr
     */
    void avahi_free(IntByReference ptr);
}
