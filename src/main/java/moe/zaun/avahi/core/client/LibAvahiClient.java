package moe.zaun.avahi.core.client;
import com.sun.jna.Library;
import com.sun.jna.Native;

interface LibAvahiClient extends Library {
    LibAvahiClient INSTANCE = (LibAvahiClient) Native.loadLibrary("avahi-client", LibAvahiClient.class);
}
