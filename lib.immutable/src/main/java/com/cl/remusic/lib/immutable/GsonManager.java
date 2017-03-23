package com.cl.remusic.lib.immutable;

import com.google.gson.Gson;

/**
 * Created by chenlong on 17/3/23.
 */

public class GsonManager {

    private static Gson gson;

    private volatile static GsonManager gsonManager;
    public static GsonManager getInstance(){
        if (null ==gsonManager){
            gsonManager = new GsonManager();
        }
        return gsonManager;
    }


    public Gson getGson(){
        if (null == gson){
            gson = new Gson();
        }
        return gson;
    }

}
