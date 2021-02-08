package moe.zaun.avahi.core.client;
import com.sun.jna.Native;
import moe.zaun.avahi.core.client.client.ClientHeader;
import moe.zaun.avahi.core.client.lookUp.LookUpHeader;

public interface LibAvahiClient extends LookUpHeader, ClientHeader {
    LibAvahiClient INSTANCE = (LibAvahiClient) Native.loadLibrary("avahi-client", LibAvahiClient.class);
}
