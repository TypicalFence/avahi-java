package moe.zaun.avahi.core.common;

import static org.junit.jupiter.api.Assertions.assertEquals;

import moe.zaun.avahi.core.common.error.AvahiError;
import org.junit.jupiter.api.Test;


public class ErrorTest {

    @Test
    void std_err() {
        String ok = LibAvahiCommon.INSTANCE.avahi_strerror(AvahiError.OK);
        assertEquals("OK", ok);
        String max = LibAvahiCommon.INSTANCE.avahi_strerror(AvahiError.ERR_MAX);
        assertEquals("Invalid Error Code", max);
    }
}
