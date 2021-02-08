package moe.zaun.avahi.core.client.client;


import com.sun.jna.Callback;
import com.sun.jna.ptr.IntByReference;

public interface AvahiClientCallback extends Callback {
    //public abstract void avahiClientCallback(AvahiClient client, AvahiClientState state, IntByReference userData);
    void avahiClientCallback(AvahiClientPointer client, int state, IntByReference userData);
}
