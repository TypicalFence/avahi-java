package moe.zaun.avahi.core;

import com.sun.jna.FromNativeContext;
import com.sun.jna.ToNativeContext;
import com.sun.jna.TypeConverter;

public class EnumConverter implements TypeConverter {

    public Object fromNative(Object input, FromNativeContext context) {
        Integer i = (Integer) input;
        Class targetClass = context.getTargetType();
        if (!JnaEnum.class.isAssignableFrom(targetClass)) {
            return null;
        }
        Object[] enums = targetClass.getEnumConstants();
        if (enums.length == 0) {
            return null;
        }

        JnaEnum instance = (JnaEnum) enums[0];
        return instance.getForValue(i);
    }

    public Object toNative(Object input, ToNativeContext context) {
        JnaEnum j = (JnaEnum) input;
        return j.getIntValue();
    }

    public Class nativeType() {
        return Integer.class;
    }
}
