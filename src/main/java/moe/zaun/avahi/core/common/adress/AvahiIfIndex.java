package moe.zaun.avahi.core.common.adress;

import com.sun.jna.FromNativeContext;
import com.sun.jna.NativeMapped;
import moe.zaun.avahi.core.AvahiTypeMapper;

/**
 * Numeric network interface index.
 *
 * Takes OS dependent values and the special constant AVAHI_IF_UNSPEC
 *
 * Avahi defines this as a "typedef int"
 */
public class AvahiIfIndex implements NativeMapped {
    public final int value;

    public static final AvahiIfIndex UNSPEC = new AvahiIfIndex(-1);


    public AvahiIfIndex() {
        this.value = UNSPEC.value;
    }

    public AvahiIfIndex(int value) {
        this.value = value;
    }

    @Override
    public Object fromNative(Object nativeValue, FromNativeContext context) {
        return new AvahiIfIndexConverter().fromNative(nativeValue, context);
    }

    @Override
    public Object toNative() {
        return this.value;
    }

    @Override
    public Class<?> nativeType() {
        return Integer.class;
    }
}
