(ns moe.zaun.avahi
  (:import (moe.zaun.avahi AvahiClient
                           AvahiClientCallback
                           AvahiClientCallback$Arguments
                           AvahiServiceBrowser
                           AvahiServiceBrowserCallback
                           AvahiServiceBrowserCallback$Arguments
                           AvahiPoll
                           AbstractAvahiClient)
           (moe.zaun.avahi.core.common.adress AvahiIfIndex AvahiProtocol)))

(defn client-callback [f]
  (reify AvahiClientCallback
    (^void accept [this ^AvahiClientCallback$Arguments args]
      (f (.client args) (.state args)))))

(defn browser-callback [f]
  (reify AvahiServiceBrowserCallback
        (^void accept [this ^AvahiServiceBrowserCallback$Arguments args]
                (f (.browser args)
                   (.avahiInterface args)
                   (.event args)
                   (.name args)
                   (.type args)
                   (.domain args)
                   (.flags args)))))

(defn create-client [^AvahiPoll poll handler]
  (new AvahiClient poll (client-callback handler)))

(defn create-browser [^AbstractAvahiClient client ^AvahiIfIndex interface ^AvahiProtocol protocol ^String type ^String domain handler]
  (new AvahiServiceBrowser client interface protocol type domain (browser-callback handler)))
