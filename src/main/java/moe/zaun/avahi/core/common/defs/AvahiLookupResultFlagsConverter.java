package moe.zaun.avahi.core.common.defs;

import com.sun.jna.FromNativeContext;
import com.sun.jna.ToNativeContext;
import com.sun.jna.TypeConverter;
import moe.zaun.avahi.core.common.adress.AvahiIfIndex;

import java.util.Optional;

public class AvahiLookupResultFlagsConverter implements TypeConverter {
    @Override
    public Object fromNative(Object nativeValue, FromNativeContext context) {
        Integer i = (Integer) nativeValue;
        Class<?> targetClass = context.getTargetType();
        if (!AvahiLookupResultFlags.class.isAssignableFrom(targetClass)) {
            return null;
        }
        Optional<AvahiLookupResultFlags> option = AvahiLookupResultFlags.fromValue(i);

        if (option.isEmpty()) {
            return null;
        }

        return option.get();
    }

    @Override
    public Object toNative(Object value, ToNativeContext context) {
        AvahiLookupResultFlags flags = (AvahiLookupResultFlags) value;
        return flags.value;
    }

    @Override
    public Class<?> nativeType() {
        return Integer.class;
    }
}
