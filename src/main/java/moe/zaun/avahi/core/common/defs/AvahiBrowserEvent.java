package moe.zaun.avahi.core.common.defs;

import moe.zaun.avahi.core.JnaEnum;

/**
 * Can't seem to get this thing mapped in the callback :<
 */
public enum AvahiBrowserEvent implements JnaEnum<AvahiBrowserEvent> {
    NEW,
    REMOVE,
    CACHE_EXHAUSTED,
    ALL_FOR_NOW,
    FAILURE;

    private static int start = 0;

    public int getIntValue() {
        return this.ordinal() + start;
    }

    public AvahiBrowserEvent getForValue(int i) {
        for (AvahiBrowserEvent o : AvahiBrowserEvent.values()) {
            if (o.getIntValue() == i) {
                return o;
            }
        }
        return null;
    }

    public static AvahiBrowserEvent fromValue(int i) {
        return AvahiBrowserEvent.values()[0].getForValue(i);
    }
}
