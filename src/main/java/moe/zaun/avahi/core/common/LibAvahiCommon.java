package moe.zaun.avahi.core.common;

import com.sun.jna.Native;
import moe.zaun.avahi.core.common.alternative.AlternativeHeader;
import moe.zaun.avahi.core.common.error.ErrorHeader;
import moe.zaun.avahi.core.common.malloc.MallocHeader;
import moe.zaun.avahi.core.common.simpleWatch.SimpleWatchHeader;

import java.util.HashMap;
import java.util.Map;

public interface LibAvahiCommon extends SimpleWatchHeader, AlternativeHeader, MallocHeader, ErrorHeader {
    private static Map<String, Object> getOptions () {
        Map<String, Object> options = new HashMap<String, Object>();
        options.put(LibAvahiCommon.OPTION_TYPE_MAPPER, new AvahiCommonTypeMapper());
        return options;
    }

    LibAvahiCommon INSTANCE = (LibAvahiCommon) Native.loadLibrary("avahi-common", LibAvahiCommon.class, getOptions());
}
