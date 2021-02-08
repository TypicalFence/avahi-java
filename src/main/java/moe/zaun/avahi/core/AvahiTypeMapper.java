package moe.zaun.avahi.core;

import com.sun.jna.DefaultTypeMapper;
import moe.zaun.avahi.core.common.adress.AvahiIfIndex;
import moe.zaun.avahi.core.common.adress.AvahiIfIndexConverter;
import moe.zaun.avahi.core.common.adress.AvahiProtocol;
import moe.zaun.avahi.core.common.adress.AvahiProtocolConverter;
import moe.zaun.avahi.core.common.defs.AvahiLookupResultFlags;
import moe.zaun.avahi.core.common.defs.AvahiLookupResultFlagsConverter;
import moe.zaun.avahi.core.common.error.AvahiError;
import moe.zaun.avahi.core.common.error.AvahiErrorConverter;

public class AvahiTypeMapper extends DefaultTypeMapper {
    public AvahiTypeMapper() {
        super();
        addTypeConverter(AvahiError.class, new AvahiErrorConverter());
        addTypeConverter(AvahiProtocol.class, new AvahiProtocolConverter());
        addTypeConverter(AvahiIfIndex.class, new AvahiIfIndexConverter());
        addTypeConverter(AvahiLookupResultFlags.class, new AvahiLookupResultFlagsConverter());
        addTypeConverter(JnaEnum.class, new EnumConverter());
    }
}
