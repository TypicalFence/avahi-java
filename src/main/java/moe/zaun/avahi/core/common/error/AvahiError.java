package moe.zaun.avahi.core.common.error;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum AvahiError {
    OK(0),
    ERR_FAILURE(-1),
    ERR_BAD_STATE(-2),
    ERR_INVALID_HOST_NAME(-3),
    ERR_INVALID_DOMAIN_NAME(-4),
    ERR_NO_NETWORK(-5),
    ERR_INVALID_TTL(-6),
    ERR_IS_PATTERN(-7),
    ERR_COLLISION(-8),
    ERR_INVALID_RECORD(-9),
    ERR_INVALID_SERVICE_NAME(-10),
    ERR_INVALID_SERVICE_TYPE(-11),
    ERR_INVALID_PORT(-12),
    ERR_INVALID_KEY(-13),
    ERR_INVALID_ADDRESS(-14),
    ERR_TIMEOUT(-15),
    ERR_TOO_MANY_CLIENTS(-16),
    ERR_TOO_MANY_OBJECTS(-17),
    ERR_TOO_MANY_ENTRIES(-18),
    ERR_OS(-19),
    ERR_ACCESS_DENIED(-20),
    ERR_INVALID_OPERATION(-21),
    ERR_DBUS_ERROR(-22),
    ERR_DISCONNECTED(-23),
    ERR_NO_MEMORY(-24),
    ERR_INVALID_OBJECT(-25),
    ERR_NO_DAEMON(-26),
    ERR_INVALID_INTERFACE(-27),
    ERR_INVALID_PROTOCOL(-28),
    ERR_INVALID_FLAGS(-29),
    ERR_NOT_FOUND(-30),
    ERR_INVALID_CONFIG(-31),
    ERR_VERSION_MISMATCH(-32),
    ERR_INVALID_SERVICE_SUBTYPE(-33),
    ERR_INVALID_PACKET(-34),
    ERR_INVALID_DNS_ERROR(-35),
    ERR_DNS_FORMERR(-36),
    ERR_DNS_SERVFAIL(-37),
    ERR_DNS_NXDOMAIN(-38),
    ERR_DNS_NOTIMP(-39),
    ERR_DNS_REFUSED(-40),
    ERR_DNS_YXDOMAIN(-41),
    ERR_DNS_YXRRSET(-42),
    ERR_DNS_NXRRSET(-43),
    ERR_DNS_NOTAUTH(-44),
    ERR_DNS_NOTZONE(-45),
    ERR_INVALID_RDATA(-46),
    ERR_INVALID_DNS_CLASS(-47),
    ERR_INVALID_DNS_TYPE(-48),
    ERR_NOT_SUPPORTED(-49),
    ERR_NOT_PERMITTED(-50),
    ERR_INVALID_ARGUMENT(-51),
    ERR_IS_EMPTY(-52),
    ERR_NO_CHANGE(-53),
    ERR_MAX(-54);

    private int code;

    public int getCode() {
        return code;
    }

    public static AvahiError fromCode(int code) {
        List<AvahiError> matches = Arrays.stream(AvahiError.values())
                .filter(x -> x.code == code).collect(Collectors.toList());

        if (matches.isEmpty()) {
            return AvahiError.ERR_MAX;
        }

        return  matches.get(0);
    }

    AvahiError(int code) {
        this.code = code;
    }
}
