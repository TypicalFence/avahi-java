package moe.zaun.avahi.core.common.error;

import com.sun.jna.FromNativeContext;
import com.sun.jna.ToNativeContext;
import com.sun.jna.TypeConverter;

public final class AvahiErrorConverter implements TypeConverter {

    @Override
    public Object fromNative(Object nativeValue, FromNativeContext context) {
        Integer i = (Integer) nativeValue;
        Class<?> targetClass = context.getTargetType();
        if (!AvahiError.class.isAssignableFrom(targetClass)) {
            return null;
        }

        return AvahiError.fromCode(i);
    }

    @Override
    public Object toNative(Object value, ToNativeContext context) {
        AvahiError err = (AvahiError) value;
        return err.getCode();
    }

    @Override
    public Class<?> nativeType() {
        return Integer.class;
    }
}
