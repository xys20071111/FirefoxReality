package org.mozilla.vrbrowser.geckoAdapters;

import androidx.annotation.NonNull;

import org.mozilla.geckoview.GeckoSession;

import static java.util.Objects.requireNonNull;

public interface NavigationDelegateAdapter extends GeckoSession.NavigationDelegate {

    public default void onLocationChange(@NonNull GeckoSession aSession, String aUri) {}
}
