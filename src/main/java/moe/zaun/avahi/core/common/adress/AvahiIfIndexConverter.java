package moe.zaun.avahi.core.common.adress;

import com.sun.jna.FromNativeContext;
import com.sun.jna.ToNativeContext;
import com.sun.jna.TypeConverter;

public class AvahiIfIndexConverter implements TypeConverter {
    @Override
    public Object fromNative(Object nativeValue, FromNativeContext context) {
        Integer i = (Integer) nativeValue;
        Class<?> targetClass = context.getTargetType();
        if (!AvahiIfIndex.class.isAssignableFrom(targetClass)) {
            return null;
        }

        return new AvahiIfIndex(i);
    }

    @Override
    public Object toNative(Object value, ToNativeContext context) {
        AvahiIfIndex index = (AvahiIfIndex) value;
        return index.value;
    }

    @Override
    public Class<?> nativeType() {
        return Integer.class;
    }
}
