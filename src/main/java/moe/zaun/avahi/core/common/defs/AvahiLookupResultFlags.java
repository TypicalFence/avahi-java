package moe.zaun.avahi.core.common.defs;

import moe.zaun.avahi.core.common.error.AvahiError;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public enum AvahiLookupResultFlags {
    RESULT_CACHED(1),
    RESULT_WIDE_AREA(2),
    RESULT_MULTICAST(4),
    RESULT_LOCAL(8),
    RESULT_OUR_OWN(16),
    RESULT_STATIC(32);

    public final int value;

    AvahiLookupResultFlags(int value) {
        this.value = value;
    }

    public static Optional<AvahiLookupResultFlags> fromValue(int value) {
        List<AvahiLookupResultFlags> matches = Arrays.stream(AvahiLookupResultFlags.values())
                .filter(x -> x.value == value).collect(Collectors.toList());

        if (matches.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(matches.get(0));
    }

}
