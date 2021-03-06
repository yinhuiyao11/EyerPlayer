package com.eyer.eyerplayer;

public class EyerPlayerJNI {
    static {
        System.loadLibrary("EyerPlayerJNI");
    }

    public static native long       videoview_context_init      (android.view.Surface surface);
    public static native int        videoview_context_change    (long surface, int w, int h);
    public static native int        videoview_context_uninit    (long surface);

    public static native long       gl_context_init             (android.view.Surface surface);
    public static native int        gl_context_change           (long ctx, int w, int h);
    public static native int        gl_context_uninit           (long ctx);

    public static native long       player_init                 ();
    public static native int        player_uninit               (long player);
    public static native int        player_open                 (long player, String url);

    public static native int        player_set_gl_ctx           (long player, long gl_ctx);
    public static native int        player_unset_gl_ctx         (long player);
}
