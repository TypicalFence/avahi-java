package moe.zaun.avahi.core.common.defs;

import moe.zaun.avahi.core.JnaEnum;

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
}
