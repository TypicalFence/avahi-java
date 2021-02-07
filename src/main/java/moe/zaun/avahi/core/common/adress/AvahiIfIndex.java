package moe.zaun.avahi.core.common.adress;

/**
 * Numeric network interface index.
 *
 * Takes OS dependent values and the special constant AVAHI_IF_UNSPEC
 *
 * Avahi defines this as a "typedef int"
 */
public class AvahiIfIndex {
    public final int value;

    public static final AvahiIfIndex UNSPEC = new AvahiIfIndex(-1);

    public AvahiIfIndex(int value) {
        this.value = value;
    }
}
