package moe.zaun.avahi.core.client.client;


import com.sun.jna.ptr.IntByReference;

public abstract class AvahiClientCallback {
    //public abstract void avahiClientCallback(AvahiClient client, AvahiClientState state, IntByReference userData);
    public abstract void avahiClientCallback(AvahiClient client, int state, IntByReference userData);
}
