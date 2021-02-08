package moe.zaun.avahi.core.client;

import com.sun.jna.Native;
import moe.zaun.avahi.core.AvahiTypeMapper;
import moe.zaun.avahi.core.client.client.ClientHeader;
import moe.zaun.avahi.core.client.lookUp.LookUpHeader;
import moe.zaun.avahi.core.common.LibAvahiCommon;

import java.util.HashMap;
import java.util.Map;

public interface LibAvahiClient extends LookUpHeader, ClientHeader {
    private static Map<String, Object> getOptions () {
        Map<String, Object> options = new HashMap<String, Object>();
        options.put(LibAvahiCommon.OPTION_TYPE_MAPPER, new AvahiTypeMapper());
        return options;
    }

    LibAvahiClient INSTANCE = (LibAvahiClient) Native.loadLibrary("avahi-client", LibAvahiClient.class, getOptions());
}
