package com.cl.remusic;

import net.wequick.small.Small;

/**
 * Created by galen on 15/11/3.
 */
public class Application extends android.app.Application {

    public Application() {
        // This should be the very first of the application lifecycle.
        // It's also ahead of the installing of content providers by what we can avoid
        // the ClassNotFound exception on if the provider is unimplemented in the host.
        Small.preSetUp(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        // Optional
        Small.setLoadFromAssets(BuildConfig.LOAD_FROM_ASSETS);
    }

}
