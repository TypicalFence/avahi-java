package moe.zaun.avahi.core.common.simpleWatch;

import com.sun.jna.Library;
import com.sun.net.httpserver.Headers;
import moe.zaun.avahi.core.common.watch.AvahiPollPointer;

public interface SimpleWatchHeader extends Library {
    /**
     * Create a new main loop object.
     * @return AvahiSimplePollPointer
     */
    AvahiSimplePollPointer avahi_simple_poll_new();

    /**
     * Free a main loop object.
     * @param ptr AvahiSimplePollPointer
     */
    void avahi_simple_poll_free(AvahiSimplePollPointer ptr);
    AvahiPollPointer avahi_simple_poll_get(AvahiSimplePollPointer ptr);

    /**
     * Call avahi_simple_poll_iterate() in a loop and return if it returns non-zero.
     */
    int avahi_simple_poll_loop(AvahiSimplePollPointer ptr);

    /**
     * Run a single main loop iteration of this main loop.
     *
     * If sleep_time is < 0 this will block until any of the registered events happens,
     * then it will execute the attached callback function.
     * If sleep_time is 0 the routine just checks if any event is pending.
     * If yes the attached callback function is called, otherwise the function returns immediately.
     * If sleep_time > 0 the function will block for at most the specified time in msecs.
     *
     * Returns -1 on error, 0 on success and 1 if a quit request has been scheduled.
     * Usually this function should be called in a loop until it returns a non-zero value
     *
     * @param ptr
     * @param sleep_time
     * @return
     */
    int avahi_simple_poll_iterate(AvahiSimplePollPointer ptr, int sleep_time);

    /**
     * Request that the main loop quits.
     *
     * If this is called the next call to avahi_simple_poll_iterate() will return 1
     */
    void avahi_simple_poll_quit(AvahiSimplePollPointer ptr);
}
