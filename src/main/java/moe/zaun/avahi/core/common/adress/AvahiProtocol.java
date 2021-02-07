package moe.zaun.avahi.core.common.adress;

/**
 * Protocol family specification, takes the values AVAHI_PROTO_INET, AVAHI_PROTO_INET6, AVAHI_PROTO_UNSPEC.
 *
 * Avahi defines this as a "typedef int" with a anonymous enum for some values, technically other values are possible.
 *
 * This class is just a neat little box for typechecking.
 */
public class AvahiProtocol {
    public final int value;

    public static final AvahiProtocol INET = new AvahiProtocol(0);
    public static final AvahiProtocol INET6 = new AvahiProtocol(1);
    public static final AvahiProtocol UNSPEC = new AvahiProtocol(-1);

    public AvahiProtocol(int value) {
        this.value = value;
    }
}
