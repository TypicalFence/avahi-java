package moe.zaun.avahi;

import java.util.function.Consumer;

public interface AvahiClientCallback extends Consumer<AvahiClientCallback.Arguments> {
    class Arguments {
        public final AbstractAvahiClient client;
        public final int state;

        public Arguments(AbstractAvahiClient client, int state) {
            this.client = client;
            this.state= state;
        }
    }

}
