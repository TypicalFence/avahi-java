package moe.zaun.avahi.core.common.adress;

import com.sun.jna.FromNativeContext;
import com.sun.jna.ToNativeContext;
import com.sun.jna.TypeConverter;

public class AvahiProtocolConverter implements TypeConverter {

    @Override
    public Object fromNative(Object nativeValue, FromNativeContext context) {
        Integer i = (Integer) nativeValue;
        Class<?> targetClass = context.getTargetType();
        if (!AvahiProtocol.class.isAssignableFrom(targetClass)) {
            return null;
        }

        return new AvahiProtocol(i);
    }

    @Override
    public Object toNative(Object value, ToNativeContext context) {
        AvahiProtocol protocol = (AvahiProtocol) value;
        return protocol.value;
    }

    @Override
    public Class<?> nativeType() {
        return Integer.class;
    }
}
